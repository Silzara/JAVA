package While;

/*   Erzeuge eine Zufallszahl im Bereich 1 bis 100.
	• Lasse den Benutzer raten, bis die Zahl gefunden ist oder maximal 20 Versuche erreicht sind.
	• Gib nach jedem Tipp eine Rückmeldung: "zu klein" oder "zu groß".
	• Speichere jeden Tipp in einem int[] mit Platz für 20 Werte.
	• Gib am Ende die Anzahl der Versuche und alle Tipps in Eingabereihenfolge aus.

	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Random;
import java.util.Scanner;


/**   Pseudocode
   program Aufgabe4v2

 {

   Scanner sc
   Random rand
   int randomZahl = rand(1 bis 100)
   int zahl, gros 20, versuche 0
   int [] zahlen gros

   for(int i 0, i < gros, i++)
       Eingabe zahl sc
            if(zahl != randomZahl)
                 zahlen[i] = zahl
                 if(zahl < randomZahl)
                        Ausgabe zu klein!
                        versuche++
                 else
                        Ausgabe zu groß!
                        versuche++
                 endif
            else
                   Ausgabe Bingo!
                   versuche++
                   zahlen[i] = zahl
                   Ausgabe text for zahlen[]
                   return
            endif
   endfor

   Ausgabe text max 20 versuche
   Ausgabe text for zahlen[]

 }

 */

public class Aufgabe4v2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomZahl = rand.nextInt(1,101), zahl, gros = 20, versuche=0;
        int [] zahlen = new int[gros];

        System.out.println("Der Random zahl ist "+randomZahl );
        System.out.println("Eine Zahl eingeben!");

        for(int i = 0; i < gros; i++) {
            zahl = sc.nextInt();
            if(zahl != randomZahl) {
                  zahlen[i] = zahl;
                if(zahl < randomZahl) {
                    System.out.println("Zu klein");
                    versuche++;
                }else{
                    System.out.println("Zu groß");
                    versuche++;
                }

            }else{
                System.out.println("Bingo!");
                versuche++;
                zahlen[i] = zahl;
                for(int j = 0; j < versuche; j++ ) {
                    System.out.printf("Versucht: %d\n", j+1);
                    System.out.println("Vermute: " + zahlen[j]);
                }
                System.out.println("");
                return;
            }
        }
        //Ausgabe 20
        System.out.println("Maximal 20 Versuche erreicht sind!");
        System.out.println("Der zahl war "+randomZahl);
        for(int j = 0; j < versuche; j++) {
            System.out.printf("Versucht: %d\n", j+1);
            System.out.println("Vermute: " + zahlen[j]);
        }


    }
}
