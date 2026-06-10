package Variablen;

/*   Übung 3: Steckbrief (Datentypen und String-Verknüpfung)
Aufgabenstellung:
Erstelle eine Variable für einen Namen (String), ein Alter (int) und ein Geschlecht (char)
.
Weise dem Namen "Max", dem Alter 25 und dem Geschlecht 'm' zu.
Gib alle Informationen in einer einzigen Zeile aus (z. B. "Name: Max, Alter: 25, Geschlecht: m").
Ändere das Alter danach auf 26 und gib den aktualisierten Satz erneut aus
.
Anforderung: Erstelle zuerst den Pseudocode und dann das Java-Programm
 */

/**   Pseudocode

 {//Program Start

 string namen = Max
 int alter = 25
 char geschlecht = m

 Ausgabe Name namen + Alter alter + Geschlecht geschlecht
 alter++
 Ausgabe Name named + Alter alter + Geschlecht geschlecht

 }//Program End
 */

public class Aufgabe3KI {
    public static void main(String[] args) {

        String namen = "Max";
        int alter = 25;
        char geschlecht = 'm';

        System.out.println("Name: " + namen + ", Alter: " + alter + ", Geschlecht: " + geschlecht);
        alter++;  // alter = alter + 1;
        System.out.println("Name: " + namen + ", Alter: " + alter + ", Geschlecht: " + geschlecht);
        double test = 4.94065645841246511111111;

        System.out.println(test);

    }
}
