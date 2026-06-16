package While;

/*
- erstellen Sie ein lauffaehiges JAVA Programm
 */

import java.util.Scanner;

/**   Pseudocode
   program Aufgabe2

 progamm dauer{
 Eingabe: startKapital
 Eingabe: zielKapital
 Eingabe: zinssatz

 kapital = startKapital

 solange(kapital < zielKapital){
 kapital = kapital * (zinssatz + 100) / 100
 jahre++
 }

 Ausgabe: "Es hat " jahre "gedauert".
 }

 */

public class Aufgabe2 {
    public static void main(String[] args) {

        double startKapital, zielKapital, zinssatz, kapital;
        int jahre = 0;
        Scanner sc = new Scanner(System.in);

        //Eingabe
        System.out.println("Bitte geben Sie die start kapital");
        startKapital = sc.nextDouble();
        System.out.println("Bitte geben Sie die ziel kapital");
        zielKapital = sc.nextDouble();
        System.out.println("Bitte geben Sie die zins");
        zinssatz = sc.nextDouble();

        //Verarbeitung
        kapital = startKapital;
        while(kapital < zielKapital){
            kapital = kapital * (zinssatz + 100) / 100;
            jahre++;
        }

        //Asugabe
        System.out.println("Es hat "+jahre+ " jahre gedauert");
    }
}
