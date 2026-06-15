package Verzweigung;

/*   Passwort-Check (Thema: PIN-Abfrage)
Aufgabenstellung:
User gibt eine vierstellige PIN (int) ein.
Vergleich mit der gespeicherten PIN (z. B. 1234) mittels ==

Ausgabe über Erfolg oder Verweigerung

Beispiel für die Konsole:
Eingabe PIN: 1234
Ausgabe: Zugriff gewährt.
Eingabe PIN: 1111
Ausgabe: Falsche PIN – Zugriff verweigert.
Dein Vorgehen (nach den Quellen):
Pseudocode: Plane zuerst die falls- und sonst-Blöcke

Codieren: Setze die Planung in Java um, achte auf die korrekten Operatoren (z.B. == statt =)
Testen: Nutze die oben genannten Beispiele, um zu prüfen, ob dein Programm bei unterschiedlichen Eingaben auch wirklich unterschiedlich reagiert

 */

import java.util.Scanner;

/**  Pseudocode
  programm Aufgabe9KLM

  {

 int pin, pin2
 Scanner sc

 Ausgabe text pin
 Eingabe pin
 Ausgabe text pin2
 Eingabe pin2

 if(pin == pin2)
        Ausgabe pin gleich!
 else
        Ausgabe pin falsch!

  }

 */

public class Aufgabe9KLM {
    public static void main(String[] args) {

        int pin, pin2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Geben sie ein PIN aus");
        pin = sc.nextInt();
        System.out.println("Geben sie Ihre PIN nochmal aus");
        pin2 = sc.nextInt();

        if(pin == pin2){
            System.out.println("PIN ist gleich!");
        }else {
            System.out.println("PIN ist falsch!");
        }
    }
}
