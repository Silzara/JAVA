package Verzweigung;

/*   Folgende Aufgabe wird Ihnen gestellt:
	Das Programm fragt zunächst 2 Buchstaben ab. Anschließend wird der User aufgefordert, eine der beiden Auswahlen zu treffen:

	Auswahl 1:
	Die beiden Buchstaben werden nebeneinander auf der Konsole ausgegeben

	Beispiel: Der User hat a und b eingegeben. Die Ausgabe ist dann:
	ab

	Auswahl 2:
	Die beiden Buchstaben werden übereinander auf der Konsole ausgegeben

	Beispiel: Der User hat a und b eingegeben. Die Ausgabe ist dann:
	a
	b

	Bei Eingabe anderer Werte als 1 oder 2 wird der User darüber informiert (z.B. "Falsche Eingabe").
	Daraufhin endet das Programm.

	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Scanner;

/**   Pseudocode
  programm Aufgabe3

  {

  char a,b,c
  Scanner sc

  Ausgabe text a
  Eingabe a
  Ausgabe text b
  Eingabe b
  Ausgabe text c
  Eingabe c

  if(c == '1')
      Ausgabe a \n b
  else if(c == '2')
      Ausgabe a b
  else
      Ausgabe error c

 }

 */

public class Aufgabe3 {
    static void main(String[] args) {

        //Variablen
        char a, b, c;

        //Scanner hinzufügen
        Scanner sc = new Scanner(System.in);

        //Eingaben
        System.out.print("Geben Sie bitte Zeichen eins: ");
        a = sc.next().charAt(0);
        System.out.print("Geben Sie bitte Zeichen zwei: ");
        b = sc.next().charAt(0);
        System.out.print("Geben Sie bitte Auswahl (1 oder 2): ");
        c = sc.next().charAt(0);

        //Ausgaben
        if (c == '1') {
            System.out.println(a + "\n" + b);
        } else if (c == '2') {
            System.out.println(a + "" + b);
        } else {
            System.out.println("Sie haben " + c + " eingegeben, wählen nur zwischen 1 und 2.");
        }
    }
}
