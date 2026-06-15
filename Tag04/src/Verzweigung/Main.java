package Verzweigung;

import java.util.Scanner;

/*
    programm Alter

    {

    //Wrweiterung um eine präzise Berechnung
    //wir brauchen die Information ob der Nutzer schon Gerburtstag hatte
    Eingabe aktuellesJahr, geburtsJahr
    Ausgabe Halten sie schon Geburtstag
    Eingabe schonGerburtsGehabt // Wingabe soll 'j' oder 'n'
    wenn schonGeburtstagGehabt == 'j'
        dann ein Jahr höher - Formel folgt
    sonst
    alter = aktuellesJahr - geburtsJahr
    Ausgabe alter

    }

 */

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Variablen
        int aktuellesJahr, geburtsJahr, alter;
        char schonGeburstagGehabt;

        System.out.print("Geben Sie bitte das aktuelle Jahr ein: ");
        aktuellesJahr = sc.nextInt();

        System.out.print("Geben Sie bitte das Geburtsjahr ein: ");
        geburtsJahr = sc.nextInt();

        System.out.println("Haben Sie dieses Jahr schon Geburtstag gehabt? (j/n)");
        schonGeburstagGehabt = sc.next().charAt(0);

        if (schonGeburstagGehabt == 'j') {

            //hatte schon Geburtstag
            alter = aktuellesJahr - geburtsJahr;

        } else if (schonGeburstagGehabt == 'n') {
            //hatte noch nicht GeburtsJahr
            alter = aktuellesJahr - geburtsJahr - 1;
        }  else {
            alter =1;
            System.out.println();
        }

        System.out.println("Ihr Alter ist: " + alter);
    }
}
