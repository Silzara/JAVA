package switchCase;

/*
Der Benutzer kann zwischen Kreis, Rechteck und Dreieck auswählen
Je nach Form wird er nach den entsprechenden Werten gefragt
um die jeweilige Fläche berechnen zu können.

Setzen Sie Eingabe und Berechnung jeweils in den einzelnen Case - Abschnitten des Switch Case um.

	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffähiges JAVA Programm
 */

import java.util.Scanner;

/**   Pseudocode
   program Aufgabe3

 {

     int wahl
     double messung, messung1, result
     Scanner sc

     Ausgabe text 1 2 oder 3 für kreis, rechteck, dreieck
     Eingabe wahl sc

          SWITCH wahl
                  case 1
                     Ausgabe text für kreis, messung
                     Eingabe messung sc
                     result = kreis rechnung
                     Ausgabe kreis fläsche +result
                  case 2
                     Ausgabe text für rechteck, messung & messung1
                     Eingabe messung sc & messung1 sc
                     result = rechteck rechnung
                     Ausgabe rechteck fläsche +result
                  case 3
                     Ausgabe text für dreieck, messung & messung1
                     Eingabe messung sc & messung1 sc
                     result = dreieck rechnung
                     Ausgabe dreieck fläsche +result
                  default
                     Ausgabe falsche eingabe
          ENDSWITCH

 }

 */

public class Aufgabe3 {
    public static void main(String[] args) {

        int wahl;
        double messung, messung1, result;
        Scanner sc = new Scanner(System.in);

        System.out.print("Wählen 1 für Kreis, 2 für Rechteck oder 3 für Dreieck: ");
        wahl = sc.nextInt();

        switch(wahl) {
            case 1: { //Kreis
                System.out.println("Kreis: bitte Diameter eingeben");
                messung = sc.nextDouble();
                result = messung /2;
                result = result * result * 3.14;
                System.out.printf("Kreis fläsche ist: %.02f",result);
                break;
            }
            case 2: { //Rechteck
                System.out.println("Rechteck: bitte Breite eingeben");
                messung1 = sc.nextDouble();
                System.out.println("Rechteck: bitte Lange eingeben");
                messung = sc.nextDouble();
                result = messung1 * messung;
                System.out.printf("Rechteck fläschen ist: %.02f",result);
                break;
            }
            case 3: { //Dreieck
                System.out.println("Dreieck: bitte Breite eingeben");
                messung1 = sc.nextDouble();
                System.out.println("Dreieck: bitte Höhe eingeben");
                messung = sc.nextDouble();
                result = messung1 * messung/2;
                System.out.printf("Dreieck fläsche ist: %.02f",result);
                break;
            }
            default:
                System.out.println("Ungültige Eingabe! wähle 1 2 oder 3");
        }
    }
}
