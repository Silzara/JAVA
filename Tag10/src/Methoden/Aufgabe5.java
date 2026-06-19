package Methoden;

/*
Name: ………….... zufallSuche
	Übergabewerte: … 3 Integer min, max und suchZahl
	Funktionalität: ..…. lost solange Zahlen zwischen min und max (beiderseits einschließlich) aus, bis die Zahl  suchZahl getroffen wird
	Rückgabewert: …. Anzahl der benötigten Versuche, bis suchZahl getroffen wurde

Diese Methode wird von der Main zehn mal aufgerufen.
Je Aufruf wird ausgegeben, wie oft in der Methode nach der Zahl gesucht werden musste.

	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Random;

/**   Pseudocode
   program Aufgabe5

 {

        zufallSuche(int min max suchZahl)
             Random rand
             int random, tries 0

             DO
                    random = rand(1 bis 100)
                    tries++
             WHILE(random != suchZahl)
             return tries

        main()
             FOR(10 mal)
                   Ausgabe text +zufallSuche(x y z)
             ENDFOR
 }

 */

public class Aufgabe5 {

    public static int zufallSuche(int min, int max, int suchZahl) {
        Random rand = new Random();
        int tries=0;
        int random;

        do{
            random = rand.nextInt(min,max+1);
            tries++;
        }while(random!=suchZahl);

        return tries;
    }
    public static void main(String[] args) {

        for(int a=0;a<10;a++) {

            System.out.println("Für zahl "+13+" wir haben versucht: "+zufallSuche(1, 100, 13)+" zu finden");
        }
    }
}
