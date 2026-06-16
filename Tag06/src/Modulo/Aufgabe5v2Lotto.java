package Modulo;

/*
Bitte 6 Lottozahlen erzeugen. Im Array speichern und überlegen wie sie
"Dopplungen" vermeiden
 */

import java.util.Random;

/**   Pseudocode
   program Aufgabe5v2Lotto

 {



 }

 */

public class Aufgabe5v2Lotto {
    public static void main(String[] args) {

        Random random = new Random();
        int [] lottoTicket = new int[6];
        int [] lottoZahlen = new int[49];
        int randomZahl = random.nextInt(1,50);

        System.out.println(randomZahl);

        System.out.println(lottoZahlen[5]);

        while(lottoTicket[5] == 0) {
            randomZahl = random.nextInt(1,6);


        }
    }
}
