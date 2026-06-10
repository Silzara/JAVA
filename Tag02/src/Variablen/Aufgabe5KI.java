package Variablen;

/*   Übung 5: Produkt-Info (Datentypen-Mix und Strings)
Aufgabenstellung:
Deklariere und initialisiere folgende Variablen für ein Produkt

Ein Name (String): "Kaffeetasse"
Eine Artikelnummer (int): 1024
Ein Preis (double): 12.95
Verfügbarkeit (char): 'J' (für Ja)
Gib alle Informationen in einem übersichtlichen Block auf der Konsole aus

Erhöhe den Preis um 2.00 Euro durch eine Zuweisung (preis = preis + 2.0) und gib den neuen Preis aus
Nutze für eine der Ausgaben System.out.printf, um den Preis und den Namen in einer Zeile anzuzeigen
Anforderung: Erstelle zuerst den Pseudocode und danach den Quellcode innerhalb einer Klasse namens Main
 */

/**   Pseudocode
    Program Aufgabe5KI

    {//Program Start

 String produkt = Kaffeetasse
 int id = 1024
 double preis = 12.95
 char verfugbar = J

 Ausgabe id + produkt + preis + verfugbar
 preis = preis + 2.0
 Ausgabe printf id + produkt + preis
    }//Program End

 */

public class Aufgabe5KI {
    public static void main(String[] args) {

        String produkt = "Kaffeetasse";
        int id = 1024;
        double preis = 12.95;
        char verfugbar = 'J';

        System.out.println("Produkt-ID: " + id+ " Produkt:"+produkt +" preis:"+ preis +" verfugbar?:"+ verfugbar);
        preis = preis + 2.0;
        System.out.printf("Produkt-ID: %d Produkt:%s Preis:%.2f verfugbar?:%c\n", id, produkt, preis, verfugbar);
    }
}
