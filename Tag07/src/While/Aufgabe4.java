package While;

/*
	• Erzeuge eine Zufallszahl im Bereich 1 bis 100.
	• Lasse den Benutzer raten, bis die Zahl gefunden ist oder maximal 20 Versuche erreicht sind.
	• Gib nach jedem Tipp eine Rückmeldung: "zu klein" oder "zu groß".
	• Speichere jeden Tipp in einem int[] mit Platz für 20 Werte.
	• Gib am Ende die Anzahl der Versuche und alle Tipps in Eingabereihenfolge aus.



	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm

 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**   Pseudocode
   program Aufgabe4

 {



 }

 */

public class Aufgabe4 {
    public static void main(String[] args) {

        int zahl, guess,trys=0;
        int [] guesses = new int[20];
        Random rand =  new Random();
        Scanner sc = new Scanner(System.in);

        guess = rand.nextInt(1,101);
        System.out.println("secret number: "+guess);

        System.out.println("enter a number");
        for(int i=0;i<20;i++) {

            System.out.printf("Attempt: %d\n",i);

            while ((zahl = sc.nextInt()) != guess && i != 20) {

                if(zahl < guess) {
                    System.out.println("Zu klein.");
                }else{
                    System.out.println("Zu groß.");
                }
                trys++;
                guesses[i] = zahl;
                i++;
                System.out.println("Attempt: "+i);
            }

            System.out.println("Bingo!");
            System.out.println("Guessed in " + trys);
            System.out.println(Arrays.toString(guesses));
        }

        for(int i = 0; i < 20; i++) {
            System.out.println("Attempt: "+i);
            System.out.println("Guess: "+guesses[i]);
        }

    }
}
