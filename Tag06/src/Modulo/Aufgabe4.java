package Modulo;

/*   In einem Kino ist eine Sitzreihe mit 45 Sitzen vorhanden.
Ein belegter Sitz bekommt eine 1. Ein freier Sitz eine 0.
Nun sollen die meisten freien Sitze nebeneinander ermittelt werden.

Erzeuge dazu ein Array mit 45 ganzen Zufallszahlen zwischen 0 und 1.
Zeige die zufaellig erzeugten Zahlen an und zaehle die meisten freien Sitze nebeneinander und gib die Anzahl aus.

	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm

 */

import java.util.Random;

/**
 * Pseudocode
 * program Aufgabe4
 * <p>
 * {
 * <p>
 * int [] sitzreihe 45
 * int leer 0
 * int result 0
 * Random rand
 * <p>
 * for(0 bis 44)
 * sitzreihe[] = random(0 oder 1)
 * if sitzreihe[] == 0
 * leer++
 * else
 * if (leer > result)
 * result = leer
 * leer = 0
 * else
 * leer = 0
 * endif
 * endif
 * Ausgabe Stuhle i = sitzreihe[]
 * endfor
 * Check 44 0 war
 * Ausgabe text freie platz + result
 * <p>
 * }
 */

public class Aufgabe4 {
    public static void main(String[] args) {

        int[] sitzreihe = new int[45];
        int leer = 0;
        int result = 0;
        Random rand = new Random();

        for (int i = 0; i < 45; i++) {
            sitzreihe[i] = rand.nextInt(0, 1 + 1);
            if (sitzreihe[i] == 0) {
                leer++;
            } else {
                if (leer > result) {
                    result = leer;
                    leer = 0;
                } else {
                    leer = 0;
                }
            }
            System.out.println("Stuhle " + i + " is " + sitzreihe[i] + " ");
        }

        //Check ob am 44 0 größer war
        if (leer > result) {
            result = leer;
        }
        System.out.println("Meist freie platz neben ein anderen: " + result);
    }
}

