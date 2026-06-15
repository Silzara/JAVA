package Verzweigung;

/*   FachpraktischeAnwendung_04_03
Der Kunde beschreibt Ihnen die gewünschte Funktionsweise des zu erstellenden Programmes, indem er Ihnen die folgenden
Beispiele für die Konsolen-Ein- und Ausgabe zur Verfügung stellt:
Hinweise:
-	Natürlich können Sie auch mehrere if-Anweisungen hintereinander ausführen zu lassen.
-	Bei einer if-Anweisung kann auf den else-Block verzichtet werden, sofern im else-Fall nichts geschehen soll

 Geben Sie bitte eine ganze Zahl ein: -5
 Ihre Eingabe -5 ist eine negative Zahl

 Geben Sie bitte eine ganze Zahl ein: 0
 Ihre Eingabe ist Null

 Geben Sie bitte eine ganze Zahl ein: 7
 Ihre Eingabe 7 ist eine positive Zahl

 Geben Sie bitte eine ganze Zahl ein: 32
 Ihre Eingabe 32 ist eine positive Zahl
 Ihre Eingabe 32 liegt sogar oberhalb von 10!

 */

import java.util.Scanner;

/**   Pseudocode
   program Aufgabe7

 int x
 Scanner sc

 Ausgabe text x
 Eingabe x

 if(x < 0)
     Ausgabe x ist eine negative Zahl
 else if (x == 0)
     Ausgabe x ist Null
 else if (x < 10)
     Ausgabe x ist eine positive Zahl
 else
     Ausgabe x ist eine positive Zahl
     Ausgabe x liegt sogar oberhalb von 10!

 */

public class Aufgabe7 {
    public static void main(String[] args) {

        //Variablen & Scanner
        int x;
        Scanner sc = new Scanner(System.in);

        //Eingaben
        System.out.println("Geben Sie bitte eine ganze Zahl ein:");
        x = sc.nextInt();

        //Ausgaben
        if(x<0){
            System.out.println("Ihre Eingabe "+x+" ist eine negative Zahl");
        }else if(x == 0){
            System.out.println("Ihre Eingabe ist Null");
        }else if(x < 10){
            System.out.println("Ihre Eingabe "+x+" ist eine positive Zahl");
        }else{
            System.out.println("Ihre Eingabe "+x+" ist eine positive Zahl");
            System.out.println("Ihre Eingabe "+x+" liegt sogar oberhalb von 10!");
        }
    }
}
