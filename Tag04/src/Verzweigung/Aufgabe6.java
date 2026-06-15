package Verzweigung;

/*   FachpraktischeAnwendung_04_02
Der Kunde beschreibt Ihnen die gewünschte Funktionsweise des zu erstellenden Programmes, indem er Ihnen die folgenden
Beispiele für die Konsolen-Ein- und Ausgabe zur Verfügung stellt:

 Geben Sie bitte ein beliebiges Zeichen ein: +
 Geben Sie bitte nocheinmal das SELBE Zeichein ein: +
 Hervorragend! Sie scheinen mir ein echter Zeichensatz-Experte zu sein!

 Geben Sie bitte ein beliebiges Zeichen ein: x
 Geben Sie bitte nocheinmal das SELBE Zeichein ein: y
 Sind Sie sicher, dass x und y identische Zeichen sind?

 */

import java.util.Scanner;

/**   Pseudocode
   program Aufgabe6

 {

 char a, b
 Scanner sc

 Ausgabe text a
 Eingabe a
 Ausgabe text b
 Eingabe b

 if(a == b)
     Ausgabe text a & b gleich
 else
     Ausgabe text a & b ungleich

 }

 */
public class Aufgabe6 {
    public static void main(String[] args) {

        char a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie bitte ein beliebiges Zeichen ein: ");
        a = sc.next().charAt(0);
        System.out.println("Geben Sie bitte nocheinmal das SELBE Zeichen ein: ");
        b = sc.next().charAt(0);

        if(a == b){
            System.out.println("Hervorragend! Sie scheinen mir ein echter Zeichensatz-Experte zu sein!");
        } else {
            System.out.println("Sind Sie sicher, dass " + a + " und " + b + " identische Zeichen sind?");
        }
    }
}
