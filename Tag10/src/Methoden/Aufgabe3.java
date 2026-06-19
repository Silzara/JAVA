package Methoden;

/*
Aus dem Hauptprogramm soll eine Methode zur Berechnung
der Kreisfläche aufgerufen werden.

Der Methode übergeben Sie den Parameter Radius.

In der Methode wird die Fläche des Kreises berechnet.
Das Ergebnis wird ans Hauptprogramm zurückgegeben.

Im Hauptprogramm geben Sie das Ergebnis aus.

	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.math.BigDecimal;
import java.util.Scanner;

/**   Pseudocode
   program Aufagabe3

 {
         kreisFlasche(double radius)
                radius = radius * radius * 3.14
                Ausgabe text radius
         main()
                Scanner sc
                Eingabe double eingabe

                kreisFlasche(eingabe)
 }

 */

public class Aufgabe3 {

    public static double kreisFlasche(double radius) {
        radius = radius * radius * 3.1416 ;
        return radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double eingabe = sc.nextInt();

        System.out.printf("Kreis fläsche ist: %.02f!\n",kreisFlasche(eingabe));
    }
}
