package doWhile;

/*   Das Programm fragt zu Beginn einmalig zwei ganze Zahlen ab,
	die für die Breite und Länge eines Rechteckes stehen.

Anschließend startet eine Schleife, in der pro Durchlauf das Produkt
der beiden Zahlen (also die Fläche des Rechteckes) abgefragt wird.
Die Schleife wird solange wiederholt, solange die Eingabe NICHT der Fläche entspricht.

Nach der Schleife wird ausgegeben, wie viele Versuche der User benötigte,
bis er die korrekte Fläche eingab.

	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Scanner;

/**   Pseudocode
   program Aufgabe2

 {

     int breite, lange, flache, zahl, size 100, i 0
     int [] versuch size
     Scanner sc

     Ausgabe text 2 zahle aus
     Eingabe breite sc && lange sc
     flache = lange * breite

     do
         Ausgabe text für flasche Eingabe
         Eingabe zahl sc
         versuch[i] = zahl
         i++
                 if zahl < flache
                       Ausgabe zu klein!
                 else if zahl == flache
                       Ausgabe Richtig!
                 else
                       Ausgabe zu groß!
                 endif
     while(zahl != flache)

     Ausgabe for versuch[] && i

 }

 */

public class Aufgabe2 {
    public static void main(String[] args) {

        int breite, lange, flache, zahl;
                int i = 0, size = 100;
        int [] versuch = new int[size];
        Scanner sc = new Scanner(System.in);

        System.out.println("Gibt 2 zahle aus für breite und länge");
        breite = sc.nextInt();
        lange = sc.nextInt();

        flache = lange * breite;

        do{
            System.out.println("Geben sie die Fläsche");
            zahl = sc.nextInt();
            versuch[i]=zahl;
            i++;
            if(zahl < flache){
                System.out.println("zu klein!");
            }else if (zahl == flache){
                System.out.println("Richtig!");
            }
            else{
                System.out.println("zu groß!");
            }
        }while(zahl != flache);

        System.out.println("Du hast " + i + " Versuche gebraucht.");
        for(int j=0; j < i; j++){
            System.out.println("Versuch " + (j+1) + ": " + versuch[j]);
        }
    }
}
