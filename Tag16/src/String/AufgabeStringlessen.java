package String;

/*
Sie bereiten Benutzereingaben für die Verarbeitung vor.
Schreiben Sie ein Programm, das einen Namen entgegennimmt und prüft:

	1. Leerzeichen vorne/hinten entfernen
	2. Ist eine Eingabe vorhanden?
	3. Wandle alles in Kleinbuchstaben um (für spätere Vergleiche)

Testdaten:	"  Max Mustermann  ", "  ", "ANNA"
 */

public class AufgabeStringlessen {
    public static void main(String[] args) {

        String test1 = "  Max Mustermann  ";
        String test2 = "  ";
        String test3 = "ANNA";

        System.out.println(lessen(test1));
        System.out.println(lessen(test2));
        System.out.println(lessen(test3));
    }

    public static String lessen(String string){

        string = string.strip();
        if(string.compareTo("") == 0){
            return "keine eingabe";
        }
        return string.toLowerCase();
    }
}
