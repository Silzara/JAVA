package Schleife;

/*   Folgende Aufgabe wird Ihnen gestellt:

Der User kann eingeben in welchem Zahlenbereich seine Zufallszahlen erzeugt
werden sollen (also z.B. von min bis max).

Dann gibt der User die Anzahl der Zufallszahlen, die erzeugt werden sollen, ein.

Danach werden in einer Schleife die gewünschte Anzahl an Zufallszahlen in diesem
Zahlenbereich erzeugt und ausgegeben.

	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Random;
import java.util.Scanner;

/**   Pseudocode
   program Aufgabe2

 {

   int min, max, x
   Scanner sc
   Random random

   Ausgabe text min
   Eingabe min
   Ausgabe text max
   Eingabe max
   Ausgabe text x
   Eingabe x

   for(int i=1; i ≤ x; i++)
        Ausgabe random.nextInt(min, max+1);

 }

 */

public class Aufgabe2 {
    public static void main(String[] args) {

        int min, max, x;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //Ausgaben & Eingaben
        System.out.print("Random Min: ");
        min = sc.nextInt();
        System.out.println("Random Max: ");
        max = sc.nextInt();
        System.out.println("Anzahl der Zufallszahlen: ");
        x = sc.nextInt();

        for(int i=1; i<=x; i++){
            System.out.println(random.nextInt(min, max+1));
        }
    }
}
