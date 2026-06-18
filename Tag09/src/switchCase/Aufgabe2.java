package switchCase;

/*
Der Benutzer gibt eine Zahl ein. Diese sollte zwischen 1 und 12 liegen.
Das Programm gibt daraufhin die entsprechende Jahreszeit aus.
Z.B. für 7 erscheint die Ausgabe "Sommer".

Sollte die Eingabe ausserhalb dieser Zahlen liegen erfolgt eine Information an den Nutzer
("Falsche Eingabe" oder "Bitte nur 1 bis 12 eingeben" oder etwas entsprechendes)
und er kann die Eingabe wiederholen.

	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffähiges JAVA Programm
 */

import java.util.Scanner;

/**   Pseudocode
   program Aufgabe2

 {

    int zahl
    Scanner sc

    do
        Ausgabe zahl 1 bis 12
        Eingabe zahl sc

        switch
             case 3 - 5  Ausgabe Frühling
             case 6 - 8  Ausgabe Sommer
             case 9 - 11 Ausgabe Herbst
             case 12 - 2 Ausgabe Winter
             default     Ausgabe Falsche Eingabe
        endswitch
    while zahl < 1 || 12 < zahl

 }

 */

public class Aufgabe2 {
    public static void main(String[] args) {

        int zahl;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Zahl zwischen 1 und 12: ");
            zahl = sc.nextInt();

            switch (zahl){
               case 3, 4, 5   -> System.out.println("Frühling");
               case 6,7 ,8    -> System.out.println("Sommer");
               case 9, 10, 11 -> System.out.println("Herbst");
               case 12,1 , 2  -> System.out.println("Winter");
               default        -> System.out.println("Falsche Eingabe");
           }

        }while(zahl < 1 || 12 < zahl);
    }
}
