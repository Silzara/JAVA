package Variablen;

/*   Übung 4: Währungsumrechner (Datentyp double und Berechnungen)
Aufgabenstellung:
Erstelle eine Variable euroBetrag vom Typ double und weise ihr den Wert 50.0 zu
Erstelle eine weitere Variable wechselkurs (Wert: 1.09 für USD)
.
Berechne den Betrag in Dollar (euroBetrag * wechselkurs) und speichere ihn in der Variablen dollarBetrag
Gib das Ergebnis mit einem passenden Text auf der Konsole aus
Zusatz: Ändere den euroBetrag auf 100.0, berechne den dollarBetrag neu und gib ihn erneut aus
.
Anforderung: Erstelle zuerst den Pseudocode und dann das Java-Programm in der main-Methode
 */

/**   Pseudocode
  Program Aufgabe4KI

  {//Program Start

  double euroBetrag = 50.5
  double wechselkurs = 1.09
  double dollarBetrag = euroBetrag * wechselkurs

  Ausgabe Text + dollarBetrag
  dollarBetrag += 100
  dollarBetrag = euroBetrag * wechselkurs
  Ausgabe Text + dollarBetrag

  }//Program End
 */

public class Aufgabe4KI {
    static void main(String[] args) {

        double euroBetrag = 50.5;
        double wechselkurs = 1.09;
        double dollarBetrag = euroBetrag * wechselkurs;

        System.out.println("Für " + euroBetrag + "€ bekommen sie " + dollarBetrag + "$"); //Ausgabe 1
        euroBetrag = 100;
        dollarBetrag = euroBetrag * wechselkurs;
        System.out.println("Für " + euroBetrag + "€ bekommen sie " + dollarBetrag + "$"); //Ausgabe 2

    }
}
