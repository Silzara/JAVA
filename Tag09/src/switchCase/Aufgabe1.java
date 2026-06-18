package switchCase;

/*
	Der Benutzer gibt eine Zahl ein. Diese sollte zwischen 1 und 7 liegen.
	Das Programm gibt daraufhin den entsprechenden Wochentag aus.
	Z.B. für 2 erscheint die Ausgabe "Dienstag".
	Sollte die Eingabe ausserhalb dieser Zahlen liegen erfolgt eine Information an den Nutzer
	("Falsche Eingabe" oder "Bitte nur 1 bis 7 eingeben").


	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffähiges JAVA Programm
 */

import java.util.Scanner;

/**   Pseudocode
   program Aufgabe1

 {

    int zahl
    Scanner sc

    Ausgabe text 1 bis 7
    Eingabe zahl sc

    switch zahl
        case 1 Montag
        case 2 Dienstag
        case 3 Mittwoch
        case 4 Donnerstag
        case 5 Freitag
        case 6 Samstag
        case 7 Sonntag
        default Falsche Eingabe

 }

 */

public class Aufgabe1 {
    public static void main(String[] args) {

        int zahl;
        Scanner sc = new Scanner(System.in);
    do{
        System.out.print("Gib eine Zahl swischen 1 und 7: ");
        zahl = sc.nextInt();

        switch (zahl) {
            case 1 -> System.out.println("Montag");
            case 2 -> System.out.println("Dienstag");
            case 3 -> System.out.println("Mittwoch");
            case 4 -> System.out.println("Donnerstag");
            case 5 -> System.out.println("Freitag");
            case 6 -> System.out.println("Samstag");
            case 7 -> System.out.println("Sonntag");
            default -> System.out.println("Falsche Eingabe");
        }
    }while (zahl != 0); // 0 stop while
    }
}
