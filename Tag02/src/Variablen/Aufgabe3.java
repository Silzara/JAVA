package Variablen;

/*  Folgende Aufgabenstellung:

	Zu Beginn des Programmes wird der Variable kantenlaengeKubus der Wert 3.75 zugewiesen.
	Anschließend werden Oberfläche und Volumen des Kubus berechnet und in die Variablen oberflaeche und volumen abgespeichert.
	Dann soll die folgende Ausgabe (entsprechend des dargestellten Layouts) ausgegeben werden:

	*****************************************
	*       Ergebnisse für Kantenlänge x    *
	*****************************************

	Oberfläche: oberflaeche
	Volumen: volumen

	(Alle Zahlenwerte auf 2 Nachkommastellen genau)

	Hinweise:

	Die entsprechenden Formeln bitte recherchieren.
	Für die Ausgabe von Oberfläche z.B.

	Schreibweise mit printf und Platzhalter im Literal für
	eine Variable mit 2 Nachkommastellen

	System.out.printf("Oberfläche: %.2f\n", oberflaeche);

	Bitte zuersten den Pseudocode und dann ein lauffähiges JAVA Programm erstellen.
 */

/**  Pseudocode
    program Aufgabe3

 {

 double kantenlaengeKubus = 3.75
 double oberflaeche
 double volumen

 oberflaeche = 6 * kantenlaengeKubus * kantenlaengeKubus
 volumen = kantenlaengeKubus * kantenlaengeKubus * kantenlaengeKubus

 Ausgabe: "*****************************************"
 Ausgabe: "* Ergebnisse für Kantenlänge 3.75 *"
 Ausgabe: "*****************************************"

      Ausgabe: "Oberfläche: "und oberflaeche (mit 2 Nachkommastellen)
      Ausgabe: "Volumen: "und volumen (mit 2 Nachkommastellen)

 }
 */

public class Aufgabe3 {
    public static void main(String[] args) {

        double kantenlaengeKubus = 3.75;
        double oberflaeche; // potenz 2 mal 6
        double volumen; //potenz 3

        oberflaeche = 6 * kantenlaengeKubus * kantenlaengeKubus;
        volumen = kantenlaengeKubus * kantenlaengeKubus * kantenlaengeKubus;

        //Ausgabe1
        System.out.println("\n*****************************************");
        System.out.printf("* Ergebnisse für Kantenlänge %.2f *\n", kantenlaengeKubus);
        System.out.println("*****************************************\n");

        //Ausgabe2
        System.out.printf("Oberfläche: %.2f\n", oberflaeche);
        System.out.printf("Volumen: %.2f\n", volumen);
    }

}
