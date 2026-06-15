package Schleife;

/*   Das Programm soll die Gesamtfläche einer Wohnung ermitteln.
	Zu Beginn wird hierfür einmalig die Anzahl der Räume abgefragt.

Anschließend startet eine Schleife, in der der User pro Durchlauf die Länge und Breite
eines Raumes eingeben kann. Nachdem dies für alle Räume geschah, endet die Schleife und
auf der Konsole wird die Gesamtfläche der Wohnung ausgegeben.
Anschließend endet auch das Programm.

	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Scanner;

/**   Pseudocode
   program Aufgabe1

 {

    int rooms, length, width, area
    Scanner sc

    Ausgabe text rooms
    Eingabe rooms

    for(i=1;i < rooms;i++)
              Ausgabe text length & width
              Eingabe length & width
              area += length * width
    Ausgabe text area
 }

 */

public class Aufgabe1 {
    public static void main(String[] args) {


        int rooms, length, width, area =0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie die Anzahl der Räume ein: ");
        rooms = sc.nextInt();

        //Ausgaben
        for (int i = 1; i <= rooms; i++) {
            System.out.println("Geben Sie die Länge des Raumes " + i + " ein: ");
            length = sc.nextInt();
            System.out.println("Geben Sie die Breite des Raumes " + i + " ein: ");
            width = sc.nextInt();
            area += length * width;
        }
        System.out.println("Die Gesamtfläche der Wohnung beträgt: " + area);
    }
}
