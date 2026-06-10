package Variablen;
/*  Folgende Aufgabenstellung:

Erstellen Sie eine Variable 'alter' mit dem Wert 10.
Daraufhin wird die String-Variable 'alterString' mit "jung" gefüllt und beides ausgegeben.

Danach wird 'alter' der Wert 80 zugewiesen und die Variable 'alterString' mit "alt" gefüllt und beides ausgegeben.

Bitte zuerst den Pseudocode und dann das JAVA Programm erstellen
 */

/**  Pseudocode
 program Aufgabe2

 {

 int alter 10
 String alterString jung
 Ausgabe: alter
 Ausgabe: alterString

     alter = 80
     alterString = "alt"
     Ausgabe: alter
     Ausgabe: alterString

 }
 */
public class Aufgabe2 {
    static void main(String[] args) {

        int alter = 10;
        String alterString = "jung";

        //Ausgabe 1
        System.out.println(alter);
        System.out.println(alterString);

        alter = 80;
        alterString = "alt";

        //Ausgabe 2
        System.out.println(alter);
        System.out.println(alterString);
    }
}
