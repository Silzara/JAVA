package Eingabe;

/*   Aufgabe_03_04

Das Programm soll die Gesamtkosten einer Taxifahrt berechnen und fragt daher vom User die folgenden Größen ab:
-	Grundgebühr (in Euro)
-	Anzahl der gefahrenen Kilometer und
-	Preis pro Kilometer (in Euro)

Es folgt die Ausgabe:
Bei einer Grundgebühr von … Euro und einem Kilometerpreis von … Euro, kostet eine … km lange Taxifahrt insgesamt … Euro.
(Alle Ausgaben auf 2 Nachkommastellen gerundet)
Daraufhin endet das Programm.
Konsolenausgabe (eingegebene Daten sind nur Beispiele)

 Geben Sie bitte die Grundgebuehr ein: 3
 Geben Sie bitte die Anzahl der gefahrenen kilometer ein: 15
 Geben Sie bitte den Preis pro Kilometer ein: 1.6

         Bei einer Grundgebuehr von 3.00 Euro und einem Kilometerpreis von 1.60 Euro,
         kostet eine 15.00 km lange Taxifahrt insgesamt 27.00 Euro.

Aufgabenstellung:
Erstellen Sie bitte zunächst einen entsprechenden Pseudocode und übersetzen Sie dieses bitte erst anschließend in einen geeigneten Quellcode.
 */

import java.util.Scanner;

/**   Pseudocode
programm Aufgabe4

 {

 double gebuhr, preisProKilometer, total
 int kilometer
 Scanner sc

 Ausgabe text gebuhr
 Eingabe gebuhr
 Ausgabe text kilometer
 Eingabe kilometer
 Ausgabe text preisProKilometer
 Eingabe preisProkilometer

 total = kilometer * preisProKilometer + gebuhr
 Ausgabe text gebuhr text preisProKilometer text kilometer text total

 }

 */

public class Aufgabe4 {
    public static void main(String[] args) {

        //Variablen
        double gebuhr, preisProKilometer, total, kilometer;

        //Scanner hinzufügen
        Scanner sc = new Scanner(System.in);

        //Eingaben
        System.out.print("Geben Sie bitte die Grundgebuehr ein: ");
        gebuhr = sc.nextDouble();
        System.out.print("Geben Sie bitte die Anzahl der gefahrenen kilometer ein: ");
        kilometer = sc.nextDouble();
        System.out.print("Geben Sie bitte den Preis pro Kilometer ein: ");
        preisProKilometer = sc.nextDouble();

        //Ausgaben & Rechnung
        total = kilometer * preisProKilometer + gebuhr;
        System.out.printf("Bei einer Grundgebuehr von %.2f Euro und einem Kilometerpreis von %.2f Euro,\n kostet eine %.2f km lange Taxifahrt insgesamt %.2f Euro.%n",
                gebuhr, preisProKilometer, kilometer, total);
    }
}
