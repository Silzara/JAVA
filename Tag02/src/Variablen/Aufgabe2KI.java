package Variablen;

/*  Übung 2: Punktestand-Logik (Zuweisungen und Überschreiben)
Aufgabenstellung:
Deklariere und initialisiere eine Ganzzahl-Variable score mit dem Wert 0
.
Gib den aktuellen Punktestand aus.
Erhöhe den score um 50 Punkte durch eine neue Zuweisung (Nutze: score = score + 50)
.
Gib den neuen Stand aus.
Verdopple den aktuellen Punktestand durch eine Multiplikation und gib das Endergebnis aus
Erstelle zuerst den Pseudocode und dann das Java Programm
 */

/**   Pseudocode
 Program Aufgabe5KI

 {//Program Start

 int score = 0

 Ausgabe score
 score+=50
 Ausgabe score
 score*=2
 Ausgabe score

 }//Program End
 */

public class Aufgabe2KI {
    public static void main(String[] args) {

        int score = 0;
        System.out.println("Punktestand: "+score);
        score+=50;
        System.out.println("Punktestand: "+score);
        score*=2;
        System.out.println("Punktestand: "+score);
    }
}
