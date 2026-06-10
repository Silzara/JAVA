package Eingabe;

/*   Aufgabe_03_03
Das Programm fordert eine Datums-Eingabe, indem einzeln Tag, Monat und Jahr abgefragt werden. Anschließend soll die folgende Ausgabe erscheinen:

Deutsche Datumsdarstellung: ………. tt.mm.jjjj
Amerikanische Datumsdarstellung: .... jjjj-mm-tt

Bemerkungen:
-	Anstelle von z.B. „tt“ soll selbstverständlich die entsprechende User-Eingabe erscheinen.
-	Einstellige Zahlen (z.B. 3) können in printf durch das Typ-Symbol „%02d“ zweistellig (also mit einer führenden 0) ausgegeben werden. Die einstellige Zahl 3 wird dann entsprechend in der Form 03 dargestellt.

Konsolenausgabe (eingegebene Daten sind nur Beispiele)
 Geben Sie bitte den Tag ein: 3
 Geben Sie bitte den Monat ein: 5
 Geben Sie bitte das Jahr ein: 2020

       Deutsche Datumsdarstellung:.........03.05.2020
       Amerikanische Datumsdarstellung:....2020-05-03

Aufgabenstellung:
Erstellen Sie bitte zunächst einen entsprechenden Pseudocode und übersetzen Sie diesen bitte erst anschließend in einen geeigneten Quellcode.
 */

import java.util.Scanner;

/**   Pseudocode
 programm Aufgabe3

 {

 int tag, monat, jahr
 Scanner sc

 Ausgabe text tag
 Eingabe tag
 Ausgabe text monat
 Eingabe monat
 Ausgabe text jahr
 Eingabe jahr

 Ausgabe tag. monat. jahr
 Ausgabe jahr- monat- tag

 }

 */

public class Aufgabe3 {
    static void main(String[] args) {

        //Variablen
        int tag, monat, jahr;

        //Scanner hinzufügen
        Scanner sc = new Scanner(System.in);

        //Eingaben
        System.out.print("Geben Sie bitte den Tag ein: ");
        tag = sc.nextInt();
        System.out.print("Geben Sie bitte den Monat ein: ");
        monat = sc.nextInt();
        System.out.print("Geben Sie bitte das Jahr ein: ");
        jahr = sc.nextInt();

        //Ausgaben
        System.out.printf("Deutsche Datumsdarstellung: %02d.%02d.%d\n",
                tag, monat, jahr);
        System.out.printf("Amerikanische Datumsdarstellung: %d-%02d-%02d\n",
                jahr, monat, tag);

    }
}
