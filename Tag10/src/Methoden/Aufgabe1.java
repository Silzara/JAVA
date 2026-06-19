package Methoden;

/*
Aus dem Hauptprogramm soll eine Funktion/Methode
schreibeZufallszahl
aufgerufen werden.

	1.
	Diese Funktion erzeugt eine Zufallszahl zwischen 1 und 100 und gibt
	diese aus.

	2.
	Einer zweite Funktion mit dem Namen schreibeZufallszahlMehrfach
	übergeben Sie den Wert anzahl als Parameter.
	Auch diese rufen Sie aus dem Hauptprogramm auf.

	Diese Funktion erzeugt Zufallszahlen zwischen 1 und 100. Der Parameter
	anzahl gibt an wie oft eine Zufallzahl erzeugt und ausgegeben werden soll.

	3.
	Einer dritten Funktion mit dem Namen schreibeBuchstabenMehrfach
	übergeben Sie die Werte anzahl und buchstabe als Parameter.
	Auch diese rufen Sie aus dem Hauptprogramm auf.

	Diese Funktion gibt das Zeichen buchstabe mehrfach aus. Der Parameter
	anzahl gibt an wie oft der Buchstabe ausgegeben werden soll.

Bitte erstellen Sie:
- den entsprechenden Pseudocode
- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Random;
import java.util.Scanner;

/**   Pseudocode
   program Aufgabe1

 {

          schreibeZufallszahl()
                 Random rand
                 int x = rand(1 bis 100)
                 Ausgabe text x

          schreibeZufallszahlMehrfach(int a int b)
                 Random rand
                 FOR(int j < b)
                     a = rand(1 bis 100)
                     Ausgabe text a
                 ENDFOR

          schreibeBuchstabenMehrfach(int x char y)
                 FOR(int i < x)
                     Ausgabe y
                 ENDFOR

          main()
               Scanner sc
               int zahl sc
               int zahl2 sc
               char x sc

               schreibeZufallszahl();
               schreibeZufallszahlMehrfach(zahl,zahl2);
               schreibeBuchstabenMehrfach(zahl, x);
 }

 */

public class Aufgabe1 {

    //Methode schreibeBuchstabenMehrfach
    public static void schreibeBuchstabenMehrfach(int anzahl, char buchstabe){
        for(int i = 0; i < anzahl; i++) {
            System.out.print(buchstabe);
        }

    }//end Methode schreibeBuchstabenMehrfach

    //Methode schreibeZufallszahlMehrfach
    public static void schreibeZufallszahlMehrfach(int zufallszahl,int anzahl){
        Random rand = new Random();

        for(int j = 0 ; j < anzahl ; j++){

            zufallszahl = rand.nextInt(1,101);
            System.out.println("Zufallszahl: "+zufallszahl + " generiert");
        }
    }//end Methode schreibeZufallszahlMehrfach

    //Methode schreibeZufallszahl
    public static void schreibeZufallszahl(){

        Random rand = new Random();
        int x = rand.nextInt(1,101);
        System.out.println("Zufallszahl ist: " + x);
    }//end Methode schreibeZufallszahl

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int zahl = sc.nextInt();
        int zahl2 = sc.nextInt();
        char x = sc.next().charAt(0);

        schreibeZufallszahl();
        schreibeZufallszahlMehrfach(zahl,zahl2);
        schreibeBuchstabenMehrfach(zahl, x);
    }
}
