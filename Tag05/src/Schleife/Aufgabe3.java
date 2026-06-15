package Schleife;

/*   Das Programm startet mit einer Schleife,
die 6000-mal durchlaufen wird. Pro Durchlauf werden zwei Würfel-Ergebnisse zufällig ausgelost.
Nach der Schleife soll auf der Konsole ausgegeben werden, wie oft es zu Durchläufen kam,
in denen beide Würfel-Ergebnisse identisch waren.

	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Random;

/**   Pseudocode
   program Aufgabe3

 {

    int counter
    Random rand

   for(i = 1, i <= 6000; i++)
           {
           int wurfel1 = rand.nextInt(1, 6+1)
           int wurfel2 = rand.nextInt(1, 6+1)
           if(wurfel1 == wurfel2)
                counter++
           }
   Ausgabe text counter

 }

 */

public class Aufgabe3 {
    public static void main(String[] args) {

        int counter = 0;
        Random rand = new Random();

        for(int i=1;i <= 6000; i++){
            int wurfel1 = rand.nextInt(1,6+1);
            int wurfel2 = rand.nextInt(1,6+1);
            if(wurfel1==wurfel2){
                counter++;
            }
        }

        System.out.println("Durchläufen werde: "+counter);
    }
}
