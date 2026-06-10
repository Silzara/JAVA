package Variablen;

/*
Folgende Aufgabenstellung:

Zu Beginn des Programmes wird der Variable a der Wert 1 zugewiesen.
Direkt im Anschluss wird dieser Wert ausgegeben.
Daraufhin wird der Wert von 1 um 1 erhöht und erneut ausgegeben.
Erneut wird a um 1 erhöht und seir Wert anschließend - dies wiederholt sich bis a den Wert 5 hat, Dann endet das Programm.

Bitte zuerst den Pseudocode und dann ein lauffähiges JAVA Programm erstellen.

     Pseudocode

     program Aufgabe
     {//Programm Anfang

     int a

     a = 1

     Ausgabe: a

     }//Programm Ende
 */

public class Main {
    static void main(String[] args) {
        //wir wollen Daten verarbeiten
        //Variablen - die nutzen wir bitte immer an EINER Stelle und zwar oben im code
        //um Variablen nutzen zu können - was müssen wir tun?
        //Datentyp festlegen - Namen festlegen
        //Definieren - Datentyp; Deklarieren - Namen
        //initialisieren - die ERSTE Zuweisung eines Wertes
        int ganzZahl;
        int a;
        double nachKommaZahl;
        float nachKommaZahl2;
        char zeichen;
        String zeichenkette;

        //Initialisierung von ganzZahl
        ganzZahl = 42;
        nachKommaZahl = 42.1234;
        nachKommaZahl2 = 12;
        zeichen = 'S';
        zeichenkette = "fhfhfh";

       //mit variablen kann man arbeiten, bei Zahlen rechnen
        //ab der zweiten Zuweisung nennen wir es Zuweisung
        ganzZahl *= 2;
        System.out.println("int: "+ganzZahl);
        System.out.println("double: "+nachKommaZahl);
        System.out.println("float: "+nachKommaZahl2);
        System.out.println("char: "+zeichen);
        System.out.println("String: "+zeichenkette);

    }//Ende Sequenz / Anweisungsblock main
}//Ende Sequenz / Anweisungsblock Main
