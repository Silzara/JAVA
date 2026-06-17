package doWhile;

/*   Ziehe eine Zufallszahl im Bereich 1 bis 10.
	•	Der Benutzer gibt einen Tipp ab und erhält die Rückmeldung "Treffer" oder "daneben".
	•	Frage anschließend: "Weiter? (j/n)" und wiederhole bei j/J.

	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Random;
import java.util.Scanner;

/**   Pseudocode
   program Aufagabe4

 {

    int zufallszahl, tipp
    char frage
    Scanner sc
    Random rand

    zufallszahl = rand(1 bis 10)

       do
           Ausgabe text zahl 1 bis 10
           Eingabe zahl sc
               if(tipp = zufallszahl)
                   Ausgabe treffer
               else
                   Ausgabe daneben
               endif
           Ausgabe Weiter? j/n
           Eingabe frage sc
       while(frage = j oder J)

 }

 */

public class Aufgabe4 {
    public static void main(String[] args) {

        int zufallszahl, tipp;
        char frage;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        zufallszahl = rand.nextInt(1,11);

        do {
            System.out.println("Zahl zwischen 1 und 10: ");
            tipp = sc.nextInt();

            if (tipp == zufallszahl) {
                System.out.println("Treffer!");
            } else {
                System.out.println("daneben");
            }

            System.out.println("Weiter? j/n");
            frage = sc.next().charAt(0);

        }while(frage == 'j'|| frage == 'J' );
    }
}
