package String;

/*
Schreiben Sie eine Methode pruefePasswort, die ein Passwort auf die Einhaltung dieser Regeln prüft:

		1. Mindestens 8 Zeichen lang
		2. Enthält Groß- UND Kleinbuchstaben

Testfälle: "Haus1234" "haus1234" "HAUS1234" "Haus125"
 */

public class AufgabepruefePasswort {

    public static void main(String[] args) {
        String test1 = "Haus1234";
        String test2 = "haus1234";
        String test3 = "HAUS1234";
        String test4 = "Haus125";

        System.out.println(pruefePasswort(test1));
        System.out.println(pruefePasswort(test2));
        System.out.println(pruefePasswort(test3));
        System.out.println(pruefePasswort(test4));

    }

    public static boolean pruefePasswort(String passwort) {

        boolean upper = false;
        boolean lower = false;

        //Mindesten 8 Zeichen
        if (passwort.length() < 8) {
            return false;
        }

        //Groß und Klein
        for(int i = 0; i < passwort.length(); i++) {
            if(passwort.charAt(i) >= 'A' && passwort.charAt(i) <= 'Z') {
                upper = true;
            }
            if(passwort.charAt(i) >= 'a' && passwort.charAt(i) <= 'z') {
                lower = true;
            }
        }
        if(upper && lower) {
            return true;
        }else
            return false;
    }
}
