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

        int [] lotto = new int[6];
        int [] lottoZahlen = new int[38];
        int randomZahl ;
        Random rand = new Random();

        //Array mit allen Zahlen
        for(int i = 1; i <= 38; i++){
            lottoZahlen[i-1] = i;
        }

        for(int i = 0; i < 6; i++){
            randomZahl = rand.nextInt(1, 39);
            System.out.println(randomZahl);

            for(int j = 0; j < 39; j++){
               if
           }
        }
        System.out.println(Arrays.toString(lottoZahlen));


    }
}
