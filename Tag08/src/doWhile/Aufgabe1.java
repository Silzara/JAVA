package doWhile;

/*   Das Programm fragt zu ein neues Passwort ab.

	Das Passwort darf beinhalten:
		- kleine Buchstaben
		- grosse Buchstaben
		- Ziffern

Hinweise:
Die Länge des Passwortes ist beliebig und braucht nicht geprüft zu werden.
Wir prüfen nicht ob unerlaubte Zeichen genutzt wurden.

Anschliessend wird der Benutzer aufgefordert das Passwort zur Bestätigung nochmals einzugeben.

Stimmen die Passworte überein bekommt wird das Programm beendet.
Stimmen die Passworte nicht überein wird der Nutzer erneut zur Vergabe eines
neuen Passwortes und zur Bestätigung dieses Passwortes aufgefordert.

	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Scanner;

/**   Pseudocode
   program Aufgabe1

 {

    Scanner sc
    String kennwort, control

    Ausgabe text neue kennwort
    Eingabe kennwort sc
    Ausgabe text control
    Eingabe control

    do
           Ausgabe neue kennwort
           Eingabe kennwort sc
           Ausgabe kennwort wieder
           Eingabe control
    while(!control.equals(kennwort))
           Ausgabe neue kennwort richtig

 }

 */

public class Aufgabe1 {
    public static void main(String[] args) {

        String kennwort, control;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Gib eine neue Kennwort an ");
            kennwort = sc.nextLine();
            System.out.println("Gib deine Kennwort noch mal ");
            control = sc.nextLine();

        }while(!control.equals(kennwort));
        System.out.println("Neue Kennwort ist richtig!");
    }
}
