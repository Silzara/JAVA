package Methoden;

/*
Aus dem Hauptprogramm soll eine Methode / Funktion
gesamtPreis
aufgerufen werden.

	Der Methode übergeben Sie die Parameter
	Einzelpreis, Stückzahl, Rabatt.

Berechnet wird der Gesamtpreis.
Die Formel lautet:
Gesamtpreis = Einzelpreis * Stückzahl * Rabatt

Der Gesamtpreis soll in der Methode ausgegeben werden.
Ausgabe mit zwei Nachkommastellen.


	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Scanner;

/**   Pseudocode
   program Aufgabe2

 {

     gesamtPreis(double einzelpreis, stuckzahl, rabat)
          Ausgabe text Gesamtpreis = Einzelpreis * Stückzahl * Rabatt

     main()
          double einzelpreis, stuckzahl, rabat
          Scanner sc

          Eingabe einzelpreis, stuckzahl, rabat
          gesamtPreis(einzelpreis, stuckzahl, rabat)
 }

 */

public class Aufgabe2 {

    //Methode gesamtPreis()
    public static void gesamtPreis(double einzelpreis, double stuckzahl, double rabat){
        System.out.printf("Gesamtpreis ist: %.02f\n",einzelpreis*stuckzahl*rabat);

    }//end Methode gesamtPreis()

    //Start main()
    public static void main(String[] args) {

        double einzelpreis, stuckzahl, rabat;
        Scanner sc = new Scanner(System.in);

        //Eingabe
        einzelpreis = sc.nextDouble();
        stuckzahl = sc.nextDouble();
        rabat = sc.nextDouble();

        gesamtPreis(einzelpreis, stuckzahl, rabat);

    }//end main()
}
