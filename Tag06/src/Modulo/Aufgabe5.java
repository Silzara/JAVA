package Modulo;

/*   Lotto dinge
Bitte 6 Lottozahlen erzeugen. Im Array speichern und überlegen wie sie
"Dopplungen" vermeiden

 */

import java.util.Arrays;
import java.util.Random;

/**   Pseudocode
  program Aufagabe5

  {

  int [] lotto
  Random rand

  }

 */

public class Aufgabe5 {
    public static void main(String[] args) {

        int[] lotto = new int[6];
        int[] lottoZahlen = new int[38];
        int randomZahl, set = 6;
        Random rand = new Random();

        //Array mit allen Zahlen
        for (int i = 1; i <= 38; i++) {
            lottoZahlen[i - 1] = i;
        }

        //randomZahl von 1 bis 38 x6
        if(lotto[5]==0) {
            for (int i = 0; i < set; i++) {
                randomZahl = rand.nextInt(1, 39);
                System.out.println(randomZahl);

                for (int j = 0; j < 38; j++) {
                    if (randomZahl == lottoZahlen[j]) {
                        lotto[i] = randomZahl;
                        lottoZahlen[j] = lottoZahlen[j] - randomZahl;
                    }
                }
                if (lotto[i] == 0) {
                    set--;
                } else {
                    System.out.println(Arrays.toString(lotto));
                   System.out.println(Arrays.toString(lottoZahlen));
                }
            }
        }
        //System.out.println(Arrays.toString(lotto));
        //System.out.println(Arrays.toString(lottoZahlen));
    }
}
