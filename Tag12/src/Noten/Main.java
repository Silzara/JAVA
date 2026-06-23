package Noten;

import java.util.Scanner;

/*   Programmiere ein Java-Programm, das Noten von Schülern verwaltet:
1. Erstelle ein **eindimensionales Array** für **5 Noten**: `int[] noten = new int[5];`.
2. Schreibe eine Methode `notenEinlesen()`, die mit einer **`for`**-Schleife **5 Noten**vom
Benutzer einliest und im Array speichert.
  - Vor jeder Eingabe soll stehen: `„Note 1 eingeben:“`, `„Note 2 eingeben:“`
 usw. (nutze die Schleifenvariable).
3. Schreibe eine Methode `notenAusgeben()`, die mit einer **`for`**-Schleife
alle Noten zeilenweise ausgibt: `Note 1: …`, `Note 2: …`
4. Schreibe eine Methode `berechneSumme()`, die mit einer **`for`**-Schleife
die **Summe** aller Noten berechnet und als `int` zurückgibt.
5. Schreibe eine Methode `berechneDurchschnitt()`, die zuerst `berechneSumme()` aufruft,
daraus den **Durchschnitt** als `int` berechnet (ganzzahlig, einfache Division) und zurückgibt.
6. Schreibe eine Methode `zaehleBestanden()`, die mit einer **`for`**-Schleife zählt,
wie viele Noten **größer oder gleich 4** sind (Bestanden) und das Ergebnis zurückgibt.
7. In `main` rufst du die Methoden in sinnvoller Reihenfolge auf und gibst am Ende aus:
		- `Summe: …`
		- `Durchschnitt (ganzzahlig): …`
		- `Anzahl bestanden: …`
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] noten = new int[5];
        noteEinlesen(noten, sc);
        noteAusgeben(noten);
        System.out.println("Summe ist: "+berechneSumme(noten));
        System.out.println("Durschnitt ist: "+berechneDurschnitt(noten));
        System.out.println("Bestanden: "+zaehleBestanden(noten));

    }

    public static void noteEinlesen(int [] noten, Scanner sc) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Note "+ (i+1) + " eingeben");
             int note = sc.nextInt();
             noten[i] = note;
        }
    }

    public static void noteAusgeben(int [] noten) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Note "+ (i+1) + ": " + noten[i]);
        }

    }

    public static int berechneSumme(int [] noten){
        int result = 0;
        for (int i = 0; i < 5; i++) {
            result += noten[i];
        }
        return result;
    }

    public static int berechneDurschnitt(int [] noten){
        int result = berechneSumme(noten)/5;
        return result;
    }

    public static int zaehleBestanden(int [] noten) {
        int zaehler = 0;
        for (int i = 0; i < 5; i++) {
            if (noten[i] <= 4) {
                zaehler++;
            }
        }
        return zaehler;
    }
}
