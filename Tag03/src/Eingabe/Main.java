package Eingabe;

import java.util.Scanner;

/**
  Pseudocode
  programm Alter

  {

  Eingabe: aktuellesJahr
  Eingabe: geburtsJahr
  alter = aktuelleJahr - geburtsJahr
  Ausgabe: alter

  }
 */

public class Main {
    static void main(String[] args) {

        //um Eingaben vararbeiten zü können benötigen wir "Scanner"
        Scanner sc = new Scanner(System.in);

        //Variablen
        int aktuellesJahr, geburtsJahr = 0, alter;

        //Eingabe (EVA Prinzip)
        System.out.print("Geben Sie bitte das aktuelle Jahr ein: ");
        aktuellesJahr = sc.nextInt();

        System.out.println("Geben Sie bitte Ihr Geburtsjahr ein: ");
        aktuellesJahr = sc.nextInt();

        //Verarbeitung
        alter = aktuellesJahr - geburtsJahr;

        //Ausgabe
        System.out.println("Sie sind " + alter + " Jahre alt.");


    }
}
