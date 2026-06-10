package Eingabe;

/*   Übung 5: Notendurchschnitt (Thema: EVA & Arithmetik)
Aufgabenstellung:

Fordere den User auf, drei verschiedene Testnoten (Ganzzahlen) einzugeben.
Speichere die Noten in drei Variablen (note1, note2, note3)

Berechne den Durchschnitt dieser drei Noten. Achtung: Das Ergebnis soll eine Kommazahl (double) sein

Gib den Durchschnitt mit einem erklärenden Satz auf der Konsole aus.
Anforderung: Erstelle zuerst den Pseudocode
und dann das lauffähige Programm in der main-Methode
 */

import java.util.Scanner;

/**   Pseudocode
   programm Aufgabe5KI

 {

    int note1, note2, note3
    double result
    Scanner sc

    Ausgabe text note1
    Eingabe note1
    Ausgabe text note2
    Eingabe note2
    Ausgabe text note3
    Eingabe note3

    result = (note1 + note2 +note3)/3

    Ausgabe text result

 }

 */
public class Aufgabe5KI     {
    public static void main(String[] args) {

        //Variablen
        int note1, note2, note3;
        double result;

        //Scanner hinzufügen
        Scanner sc = new Scanner(System.in);

        //Eingabe
        System.out.println("Geben Sie die erste Note ein: ");
        note1 = sc.nextInt();
        System.out.println("Geben Sie die zweite Note ein: ");
        note2 = sc.nextInt();
        System.out.println("Geben Sie die dritte Note ein: ");
        note3 = sc.nextInt();

        //Rechnung & Ausgaben
        result = (note1 + note2 + note3) / 3.0;
        System.out.printf("Der Durchschnitt der Noten %d, %d und %d beträgt %.2f.%n",
                note1, note2, note3, result);
    }

}
