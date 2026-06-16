package Modulo;

/*  Ein Würfel ("normaler" Würfel mit den Zahlen 1 bis 6) wird

	20mal geworfen.
	Diese 20 Würfe speichern Sie in einem Array.
	Sie ermitteln die Summe aller Würfe und die Anzahl der gewürfelten Sechsen.
	Die Würfe, Summe und Zahl der Sechsen geben Sie auf der Konsole aus.

	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Random;

/**
 * Pseudocode
 * program Aufgabe1
 * <p>
 * {
 * <p>
 * int wurfel
 * int summe 0
 * int sechs 0
 * int worfen [] new int [20]
 * Random rand
 * <p>
 * for(i = 0, i < 20, i++)
 * wurfel = random(1 bis 6)
 * worfen[i] = wurfel
 * summe += wurfel
 * if(worfen[i] == 6)
 * sechs++;
 * endif
 * endfor
 * <p>
 * Ausgabe worfen[] + summe + sechs
 * <p>
 * }
 */

public class Aufgabe1 {
    public static void main(String[] args) {

        //Variablen
        int wurfel, summe = 0, sechs = 0;
        int worfen[] = new int[20];
        Random rand = new Random();

        System.out.print("worfen[] = "); //Ausgabe worfen[] =

        for (int i = 0; i < 20; i++) {
            wurfel = rand.nextInt(1, 6 + 1);
            worfen[i] = wurfel;
            summe = summe + wurfel;
            if (worfen[i] == 6) {
                sechs++;
            }
            System.out.print(worfen[i] + " "); //Ausgabe wert von worfen[0] bis worfen[19]
        }

        //Ausgaben
        System.out.printf("\n");
        System.out.printf("Wurfel summe ist: %d und wurfel ⚅ kamm %d mal", summe, sechs);
    }
}
