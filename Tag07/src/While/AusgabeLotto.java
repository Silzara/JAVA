package While;

import java.util.Random;

public class AusgabeLotto {
    public static void main(String[] args) {
        //Lotto spielen
        //1. Aufgabe -6 Lottozahlen ziehen
        Random zufallsZahl = new Random();

        //wir "nehmen" ein Array
        int [] lottoZahlen = new int[6];
        int gezogeneZahl;

        //wie erkennenein Problem - Zahlen wurden doppelt gezogen
        for(int i = 0; i < 6; i++){
            //lottoZahlen[i] = zufallsZahl.nextInt(1,49);
            gezogeneZahl = zufallsZahl.nextInt(1, 49);
            System.out.println(lottoZahlen[i]);
            //wir schauen nach jeder Zahl ob diese Zahl schon mal gezogen wurde

        }
    }
}
