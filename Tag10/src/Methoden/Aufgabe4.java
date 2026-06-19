package Methoden;

/*
Schreiben Sie bitte zunächst die folgende Funktion:

	Name: ………….... zufall
	Übergabewerte: … 2 Integer min und max
	Funktionalität: ..…. ermittelt einen Zufallswert (zwischen beiderseits einschließlich min und max)
	Rückgabewert: ….. den ermittelten Zufallswert

Testen Sie die Funktion bitte durch das folgende Hauptprogramm:
Das Programm startet mit einer Schleife.

	Im ersten Durchlauf wird mit der obigen Funktion eine Zufallszahl zwischen
	(beiderseits einschließlich) 1 und 100
	ermittelt, der Rückgabewert in der Variable zahl
	abgespeichert und auf der Konsole ausgegeben.

In allen anderen Durchläufen wird mittels der Funktion ein Zufallswert zwischen
(beiderseits einschließlich) zahl und 100
ermittelt, erneut in zahl abgespeichert und ebenfalls ausgegeben.
Schleife und Programm enden, sobald zahl den Wert 100 annimmt.

	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Random;

/**   Pseudocode
   program Aufgabe4

 {

      zufall(int min, max)
             Random rand
             return rand(min bis max)

      main()
             Eingabe int zahl
             Ausgabe sout zufall zufal(1 bis 100) //nicht 101 weil meine Methode gut ist!
                   do
                          zahl = zufall
                          Ausgabe zahl
                          zufall = zufall(zahl bis 100)
                          Ausgabe text zufall
                   while(zufall < 100)
             Ausgabe zufall
 }

 */

public class Aufgabe4 {

    //Start zufall(int min int max)
    public static int zufall(int zahl, int max) {
        Random rand = new Random();
        return rand.nextInt(zahl,max+1) ;

    }//end zufall()

    //Start main()
    public static void main(String[] args) {

        int zahl;
        int zufall = zufall(1,100);
              do{
                  zahl = zufall;
                  System.out.println(zahl);
                  zufall=zufall(zahl, 100);
              }while(zufall < 100);
        System.out.println(zufall); // solte immer 100 sein
    }//end main()
}
