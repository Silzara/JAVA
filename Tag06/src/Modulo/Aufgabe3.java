package Modulo;

/*   Erzeuge ein Array mit 20 kleinen Buchstaben.
	Nutze hierzu die ASCII Werte. Schaue in einer ASCII Tabelle nach um diese Technik nachzuvollziehen.

Beispiel Code

int asciiWert;
...
asciiWert = zufallsZahl.nextInt(97,123);
... = (char) asciiWert;

Zeige die zufaellig erzeugten Buchstaben an und zaehle die
Vokale und gib die Anzahl aus.

	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Random;

/**
 * Pseudocode
 * program Aufgabe3
 * <p>
 * {
 * <p>
 * char []zufallsZahl
 * int vokalen 0
 * Random rand
 * <p>
 * for(int i = 0, i < 20, i++)
 * Ausgabe zufallsZahl[i].rand
 * if(zufallsZahl[i] == a,e,i,o,u
 * Ausgabe text zufallsZahl[i]
 * vokale++
 * endif
 * endfor
 * Ausgabe text vokale
 * <p>
 * }
 */

public class Aufgabe3 {
    public static void main(String[] args) {

        char[] zufallsZahl = new char[20];
        int vokale = 0;
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            System.out.println(zufallsZahl[i] = (char) rand.nextInt(97, 122 + 1));
            if (zufallsZahl[i] == 'a' || zufallsZahl[i] == 'e' || zufallsZahl[i] == 'i' ||
                    zufallsZahl[i] == 'o' || zufallsZahl[i] == 'u') {
                System.out.println("Vokal: " + zufallsZahl[i]);
                vokale++;
            }
        }
        System.out.println("Vokalen: " + vokale);

    }
}
