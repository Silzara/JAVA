package Verzweigung;

/*   Folgende Aufgabe wird Ihnen gestellt:
	Eine Gruppe von Personen plant einen gemeinsamen Kinobesuch.

	Das zu erstellende Programm soll die Gesamtkosten ermitteln und fragt zu diesem Zweck

	-	den Einzelpreis pro Ticket und
	-	die Anzahl der zu dieser Gruppe gehörenden Personen ab.

	Ferner soll berücksichtigt werden, dass bei einer Gruppe von mehr als 4 Personen ein Rabatt von 10% gewährt wird.

	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Scanner;

/**  Pseudocode
   programm Aufgabe2

 {
 double preis, ticket
 Scanner sc

 Ausgabe text preis
 Eingabe preis
 Ausgabe text ticket
 Eingabe ticket

 if(ticket > 4)
      Ausgabe preis = text preis*0.9*ticket
 else
      Ausgabe preis = text preis*ticket

 }

 */

public class Aufgabe2 {
    public static void main(String[] args) {

        //Variablen
        double preis, ticket;

        //Scanner hinzufügen
        Scanner sc = new Scanner(System.in);

        //Eingaben
        System.out.print("Geben Sie bitte den Einzelpreis pro Ticket ein: ");
        preis = sc.nextDouble();
        System.out.print("Geben Sie bitte die Anzahl der zu dieser Gruppe gehörenden Personen ein: ");
        ticket = sc.nextDouble();

        //Ausgaben & Rechnung
        if (ticket > 4) {
            preis = preis * 0.9 * ticket;
            System.out.println("Es wird ein Rabatt von 10% gewährt."+preis);
        } else {
            preis = preis * ticket;
            System.out.println("Es wird kein Rabatt gewährt."+preis);
        }
    }
}
