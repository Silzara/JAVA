package doWhile;

/*
Frage so lange eine ganze Zahl ab, bis ein Wert im Bereich 1 bis 5 eingegeben wurde.
	•	Gib danach die Zahl als Wort aus (eins, zwei, drei, vier, fünf).

	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Scanner;

/**   Pseudocode
   program Aufgabe3

 {

 int zahl
 Scanner sc

     Ausgabe text zahl 1 bis 5
     do
         Eingabe zahl sc
             if(zahl = 1)
                   Ausgabe eins
             else if(zahl = 2)
                   Ausgabe zwei
             else if(zahl = 3)
                   Ausgabe drei
             else if(zahl = 4)
                   Ausgabe vier
             else if(zahl = 5)
                   Ausgabe funf
             else
                   Ausgabe text falsch
             endif
     while(zahl < 6 && zahl > 0)>

 }

 */

public class Aufgabe3 {
    public static void main(String[] args) {

        int zahl;
        Scanner sc = new Scanner(System.in);
        System.out.println("Eingabe zahl von 1 bis 5");
        do {
            zahl = sc.nextInt();

            if (zahl == 1) {
                System.out.println("eins");
            } else if (zahl == 2) {
                System.out.println("zwei");
            } else if (zahl == 3) {
                System.out.println("drei");
            } else if (zahl == 4) {
                System.out.println("vier");
            } else if (zahl == 5) {
                System.out.println("fünf");
            } else
                System.out.println("falsche eingabe!");

        }while(zahl < 1 || zahl > 5);

    }
}
