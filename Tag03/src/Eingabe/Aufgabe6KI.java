package Eingabe;

/*   Übung 6: Brutto-Preis-Rechner (Thema: double & printf)
Aufgabenstellung:

Lies einen Nettopreis (z. B. 19.90) über die Konsole ein.
Lies einen Mehrwertsteuersatz in Prozent ein (z. B. 19.0).
Berechne den Bruttopreis mit der Formel: Brutto = Netto * (1 + Steuersatz / 100)
Gib das Ergebnis mit System.out.printf aus, sodass es auf zwei Nachkommastellen gerundet ist (nutze %f)

Anforderung: Achte auf die korrekte Verwendung des Punktes bei Kommazahlen in Java
 */

import java.util.Scanner;

/**   Pseudocode
 programm Aufgabe6KI

 {

 double netto, steuer, brutto
 Scanner sc

 Ausgabe text netto
 eingabe netto
 Ausgabe text steuer
 eingabe steuer

 brutto = netto * (1 + steuer / 100)
 Ausgabe text brutto

 }

 */
public class Aufgabe6KI {
    public static void main(String[] args) {

        double netto, steuer, brutto;
        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie den Nettopreis ein: ");
        netto = sc.nextDouble();
        System.out.println("Geben Sie den Mehrwertsteuersatz in Prozent ein: ");
        steuer = sc.nextDouble();

        brutto = netto * (1 + steuer / 100);
        System.out.printf("Der Bruttopreis beträgt: %.2f%n",
                brutto);
    }
}
