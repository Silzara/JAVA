package Verzweigung;
/*   FachpraktischeAnwendung_04_01
Der Kunde beschreibt Ihnen die gewünschte Funktionsweise des zu erstellenden Programmes, indem er Ihnen die folgenden
Beispiele für die Konsolen-Ein- und Ausgabe zur Verfügung stellt:

  Geben Sie bitte eine erste ganze Zahl ein: 5
  Geben Sie bitte eine zweite Zahl ein: 1
  Das Maximum aus 5 und 1 ist 5
  Geben Sie bitte eine erste ganze Zahl ein: 2
  Geben Sie bitte eine zweite ganze Zahl ein: 4
  Das Maximum aus 2 und 4 ist 4
  Geben Sie bitte eine erste ganze Zahl ein: 7
  Geben Sie bitte eine zweite ganze Zahl ein : 7
  Das Maximum aus 7 und 7 ist 7

Aufgabenstellung:
Erstellen Sie bitte zuerst den Pseudocode und dann einen geeigneten Quellcode.
 */

import java.util.Scanner;

/**   Pseudocode
   program Aufgabe5

 {

   int a,b
   Scanner sc

   Ausgabe text a
   Eingabe a
   Ausgabe text b
   Eingabe b

   if(a < b)
       Ausgabe Maximum b
   else
       Ausgabe Maximum a

 }

 */

public class Aufgabe5 {
    public static void main(String[] args) {

        //Variablen
        int a,b;
        Scanner sc=new Scanner(System.in);

        //Eingaben
        System.out.println("Geben Sie bitte eine erste ganze Zahl ein: ");
        a = sc.nextInt();
        System.out.println("Geben Sie bitte eine zweite ganze Zahl ein: ");
        b = sc.nextInt();

        //Ausgaben
        if(a < b) {
            System.out.println("Das Maximum aus "+a+" und "+b+" ist "+b);
        }else {
            System.out.println("Das Maximum aus " + a + " und " + b + " ist " + a);
        }
    }
}
