package Eingabe;
/*   Folgende Aufgabe wird Ihnen gestellt:

	Das Programm soll die Flaeche eines Rechteckes berechnen.
	Der Benutzer kann zwei Zahlen eingeben.
	Dann zeigt das Programm die Flaeche an.

	Bitte erstellen Sie:
	- einen Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Scanner;

/**   Pseudocode
 programm Aufgabe1

 {

 int flaeche, laenge, breite
 Scanner sc

 Ausgabe text breite
 Eingabe breite
 Ausgabe text laenge
 Eingabe laenge

 flaeche = breite * laenge
 Ausgabe text flaeche

 }

 */

public class Aufgabe1 {
    public static void main(String[] args) {

        //Variablen
        int flaeche, laenge, breite;

        //Scanner hinzufügen
        Scanner sc = new Scanner(System.in);

        //Eingaben
        System.out.println("Geben Sie bitte die Breite des Rechtecks ein: ");
        breite = sc.nextInt();
        System.out.println("Geben Sie bitte die Länge des Rechtecks ein: ");
        laenge = sc.nextInt();

        //Rechnung
        flaeche = breite * laenge;

        //Ausgaben
        System.out.println("Die Fläche des Rechtecks beträgt: " + flaeche);
    }
}
