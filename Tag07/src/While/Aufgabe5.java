package While;

/*
Würfle so lange (1..6), bis die Summe der Würfe mindestens 50 erreicht oder maximal 30 Würfe gemacht wurden.
	•	Speichere die Würfe in einem int[] mit Platz für 30 Werte.
	•	Gib Anzahl der Würfe, die Gesamtsumme und die Folge der Würfe aus.
Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Random;

/**   Pseudocode
   program Aufgabe5

 {

   int gros 30, wurfle, i 0, finfzig 0
   int [] wurfe [gros]
   Random rand

   while(finfzig < 50 && i < 30)
         wurfle=rand(1 bis 6)
         funfzig += wurfle
         wurfe[i] = wurfle
         i++;
   endwhile

   for(int j 0, j < i, h++)
       Ausgabe text + j + text + wurfe[j]
   endfor

   Ausgabe Summe & Anzahl

 }

 */

public class Aufgabe5 {
    public static void main(String[] args) {

        int gros = 30, wurfle, i=0,funfzig = 0;
        int [] wurfe  =  new int [gros];
        Random rand = new Random();

        while(funfzig < 50 && i < 30){
            wurfle = rand.nextInt(1,7);
            funfzig += wurfle;
            wurfe[i] = wurfle;
            i++;
        }
        for(int j = 0; j < i; j++){
            System.out.println("Würfel "+j + " hat: "+wurfe[j]);
        }
        System.out.println("Gesamt Summe: "+funfzig);
        System.out.println("Anzahl der Rollen "+i);
    }
}
