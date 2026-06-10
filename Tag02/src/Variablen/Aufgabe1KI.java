package Variablen;

/*  Übung 1: Rechteck-Berechnung (Variablen und Arithmetik)
Aufgabenstellung:
Erstelle zwei Variablen für die Seiten eines Rechtecks: laenge (Wert: 10.5) und breite (Wert: 5.0).
Berechne den Umfang des Rechtecks (Formel: 2 * (Länge + Breite)) und speichere das Ergebnis in einer Variablen umfang.
Berechne die Fläche (Formel: Länge * Breite) und speichere sie in flaeche.
Gib beide Ergebnisse mit einem erklärenden Text auf der Konsole aus.
Erstelle zuerst den Pseudocode und dann das Java Programm
 */

/**   Pseudocode
 Program Aufgabe4KI

 {//Program Start

 double laenge = 10.5
 double breite = 5.0
 double umfang = 2 * (laenge + breite)
 double flaeche = laenge * breite

 ausgabe erklärenden + umfang
 ausgabe erklärenden + flaeche

 }//Program End
 */

public class Aufgabe1KI {
    public static void main(String[] args) {

        double laenge = 10.5;
        double breite = 5.0;
        double umfang = 2 * (laenge + breite);
        double flaeche = laenge * breite;

        System.out.println("Der Umfang des Rechtecks beträgt: " + umfang);
        System.out.println("Die Fläche des Rechtecks beträgt: " + flaeche);
    }
}
