package Modulo;
/*   Erzeuge ein Array mit 30 ganzen Zufallszahlen zwischen 0 und 99.

Zeige die zufaellig erzeugten Zahlen an und zaehle die geraden
und ungeraden Zahlen und gib jeweils die Anzahl aus.

	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm

 */

import java.util.Random;

/**
 * Pseudocode
 * program Aufgabe2
 * <p>
 * {
 * <p>
 * int gerade, ungerade
 * int[] zahlen
 * Random rand
 * <p>
 * for(int i = 0, i < 30, i++)
 * zahlen[i] = rand.nextInt(0,99+1)
 * if(zahlen[i]%2 == 0)
 * gerade++
 * Ausgabe zahlen[i] gerade
 * else
 * ungerade++
 * Ausgabe zahlen[i] ungerade
 * endif
 * endfor
 * <p>
 * Ausgabe anzahl gerade
 * Ausgabe anzahl ungerade
 * <p>
 * }
 */

public class Aufgabe2 {
    public static void main(String[] args) {

        //Variablen
        int gerade = 0, ungerade = 0;
        int[] zahlen = new int[30];
        Random rand = new Random();

        for (int i = 0; i < 30; i++) {
            zahlen[i] = rand.nextInt(0, 99 + 1); // rand 0-99
            if (zahlen[i] % 2 == 0) {
                gerade++;
                System.out.println("Zahl " + zahlen[i] + " ist gerade.");
            } else {
                ungerade++;
                System.out.println("Zahl " + zahlen[i] + " ist ungerade.");
            }
        }
        System.out.println("Anzahl der geraden Zahlen: " + gerade);
        System.out.println("Anzahl der ungeraden Zahlen: " + ungerade);
    }
}
