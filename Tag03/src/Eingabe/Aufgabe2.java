package Eingabe;

/*   Aufgabe_03_02
Zu Beginn des Programmes wird der Variablen a der Wert 1 zugewiesen. Daraufhin erscheint die Ausgabe:
„Geben Sie bitte das “ a „. Zeichen ein: “
Woraufhin der User ein beliebiges Zeichen eingeben kann.
Anschließend wird a um 1 erhöht und es folgt erneut die Ausgabe:
	„Geben Sie bitte das “ a „. Zeichen ein: “
Auch hier kann der User wieder ein beliebiges Zeichen eingeben.
Ein letztes Mal wird a um 1 erhöht und auch noch ein drittes Zeichen abgefragt.

Zum Schluss werden alle drei Zeichen übereinander ausgegeben (jedes also in einer eigenen Zeile) und das Programm endet.

Konsolenausgabe (eingegebene Daten sind nur Beispiele)
Geben Sie bitte das 1. Zeichen ein: h
Geben Sie bitte das 2. Zeichen ein: R
Geben Sie bitte das 3. Zeichen ein: B
h
R
B

Aufgabenstellung:
Erstellen Sie bitte zunächst den entsprechenden Pseudocode und übersetzen Sie diesen bitte erst anschließend in einen geeigneten Quellcode.

Hinweis:
Zum Einlesen eines einzelnen Zeichens nutzen Sie bitte:
Wenn ihr Scanner Objekt sc heisst
sc.next().charAt(0);

 */

import java.util.Scanner;

/**   Pseudocode
programm Aufgabe2

 {

 int a = 1
 char x, y, z
 Scanner sc

 Ausgabe text a
 Eingabe x
 a++
 Ausgabe text a
 Eingabe y
 a++;
 Ausgabe text a
 Eingabe z
 Ausgabe x \n, y \n, z \n

 }

 */


public class Aufgabe2 {
    public static void main(String[] args) {

        //Variablen
        int a = 1;
        char x,y,z;

        //Scanner hinzufügen
        Scanner sc = new Scanner(System.in);

        //Eingaben
        System.out.print("Geben Sie bitte das " + a + ". Zeichen ein: ");
        x = sc.next().charAt(0);
        a++;
        System.out.print("Geben Sie bitte das " + a + ". Zeichen ein: ");
        y = sc.next().charAt(0);
        a++;
        System.out.print("Geben Sie bitte das " + a + ". Zeichen ein: ");
        z = sc.next().charAt(0);

        //Ausgaben
        System.out.println(x + "\n" + y + "\n" + z);
    }
}
