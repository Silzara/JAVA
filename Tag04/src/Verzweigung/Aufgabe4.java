package Verzweigung;

/*   Folgende Aufgabe wird Ihnen gestellt:
	Das Programm soll entscheiden, ob ein Prüfling mindestens die Hälfte der maximalen Gesamtpunktzahl erreichte (und die Prüfung bestanden hat)
	oder ob es weniger Punkte waren (und er durchfiel).

	Zu diesem Zweck werden Gesamtpunktzahl und erreichte Punktzahl abgefragt.
	Anschließend soll der erreichte Prozentsatz ausgegeben werden, verbunden mit dem entsprechenden Zusatz „bestanden“ (oder „nicht bestanden“).

	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Scanner;

/**   Pseudocode
   programm Aufgabe4

 {

 double punkte, max
 Scanner sc

 Ausgabe text max
 Eingabe max
 Ausgabe text punkte
 Eingabe punkte

 if(punkte >= max/2)
      Ausgabe text bestanden +(punkte/max)*100%
 else
      Ausgabe text nicht bestanden +(punkte/max)*100%

 }

 */
public class Aufgabe4 {
    public static void main(String[] args) {

        double punkte,max;
        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie bitte die maximale Gesamtpunktzahl ein: ");
        max = sc.nextDouble();
        System.out.println("Geben Sie bitte die erreichte Punktzahl ein: ");
        punkte = sc.nextDouble();

        if (punkte >= max/2) {
            System.out.printf("Bestanden! sie haben %.0f%% Punkten erreicht.\n", (punkte/max)*100);
        } else {
            System.out.printf("Nicht bestanden, sie haben %.0f%% Punkten erreicht.\n", (punkte/max)*100);
        }
        System.out.println("   /\\_/\\   ");
        System.out.println("  / o o \\  ");
        System.out.println(" (   \"   ) ");
        System.out.println("  \\~(*)~/  ");
        System.out.println("   // \\\\   ");
    }
}
