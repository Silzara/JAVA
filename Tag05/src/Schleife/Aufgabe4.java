package Schleife;

/*   Münzwurf-Serienanalyse

 Schreibe ein Programm, das:
	1) die Anzahl der Würfe einliest,
	2) in einer for-Schleife so viele Münzwürfe simuliert (0 = Zahl, 1 = Kopf),
	3) jeden Wurf ausgibt und per if/else eine laufende Serie von aufeinanderfolgenden Köpfen ermittelt,
	4) am Ende die längste Kopf-Serie sowie die Anzahl Köpfe und Zahlen ausgibt.

	Freiwillige Zusatzaufgabe:
	5) Zusätzlich wird die längste Zahl-Serie ausgegeben

	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Random;
import java.util.Scanner;

/**   Pseudocode
   program Aufgabe4

 {

 int heads, tails, toss, serie, headsmax
 Scanner sc
 Random rand

 Ausgabe text wuerfe
 Eingabe wuerfe sc

 for(int i = 1, i <= toss, i++)
              int randomToss=(rand.nextInt(0,1+1))
          if(randomToss == 1)
                  heads++;
                  headsmax++
          else if(headsmax > serie)
                  tails++;
                  serie=headsmax;
                  headsmax=0;
          else
              tails++;
              headsmax=0;

 Ausgabe text toss
 Ausgabe text heads + tails
 Ausgabe text serie

 }

 */

public class Aufgabe4 {
    public static void main(String[] args) {

        int heads = 0, tails = 0, toss, serie = 0, headsmax =0;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Geben Sie die Anzahl der Münzwürfe ein: ");
        toss = sc.nextInt();

        for(int i = 1; i <= toss; i++){
            int randomToss=(rand.nextInt(0, 1+1));
           if(randomToss==1) {
               heads++;
               headsmax++;
           }else if (headsmax > serie) {
               tails++;
               serie=headsmax;
               headsmax=0;
           }else {
               tails++;
               headsmax=0;
           }
        }

        System.out.println("Die Anzahl der Münzwürfe beträgt: " + toss);
        System.out.println("Head has: "+heads +" and Tails had: "+tails);
        System.out.println("consecutive heads: "+serie);
    }
}
