package Verzweigung;

/*   Folgende Aufgabe wird Ihnen gestellt:

	Der Benutzer gibt sein Alter ein. In Jahren. Als ganze Zahl.
	Dann erfolgt entweder die Ausgabe

	"Sie sind volljaehrig"

	oder

	"Sie sind noch nicht volljaehrig"

	auf der Konsole.

	Bitte erstellen Sie:
	- einen Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Scanner;

/**  Pseudocode
   programm Aufgabe1

 {

 int jahreHeute, jahreGeburt
 Scanner sc

 Ausgabe text jahreHeute
 Eingabe jahreHeute
 Ausgabe text jahreGeburt
 Eingabe jahreGeburt

 jahreHeute = jahreHeute - jahreGeburt

 if(jahreHeute >= 18)
     {
      Ausgabe text "Sie sind volljaehrig"
     }
 else
     {
      Ausgabe text "Sie sind noch nicht volljaehrig"
     }

 }

 */
public class Aufgabe1 {
    public static void main(String[] args) {

        //Variablen
        int jahreHeute, jahreGeburt;

        //Scanner hinzufügen
        Scanner sc = new Scanner(System.in);

        //Eingaben
        System.out.print("Geben Sie bitte das aktuelle Jahr ein: ");
        jahreHeute = sc.nextInt();
        System.out.print("Geben Sie bitte Ihr Geburtsjahr ein: ");
        jahreGeburt = sc.nextInt();

        //Rechnung
        jahreHeute -= jahreGeburt;

        //Ausgaben
        if (jahreHeute >= 18) {
            System.out.println("Sie sind volljaehrig");
        } else {
            System.out.println("Sie sind noch nicht volljaehrig");
        }

    }
}
