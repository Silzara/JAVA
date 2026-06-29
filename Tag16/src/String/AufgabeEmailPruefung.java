package String;

/*
Sie validieren eine E-Mail-Adresse mit mehreren Prüfungen.
Schreiben Sie ein Programm, das einen E-Mail-Adresse auf Gültigkeit prüft:

	1. Muss ein @ enthalten
	2. Muss mindestens 5 Zeichen lang sein
	3. Soll in Kleinbuchstaben umgewandelt werden

Testdaten:	"Max@test.de", "fehler.de", "AB@CD"
 */

public class AufgabeEmailPruefung {
    public static void main(String[] args) {
        String test1 = "Max@test.de";
        String test2 = "fehler.de";
        String test3 = "AB@CD";
        String test4 = "ABC@";
        String test5 = "ABCD";

        System.out.println(pruefeEmail(test1));
        System.out.println(pruefeEmail(test2));
        System.out.println(pruefeEmail(test3));
        System.out.println(pruefeEmail(test4));
        System.out.println(pruefeEmail(test5));
    }

    public static String pruefeEmail(String email){
        boolean atZeichen = false;
        boolean min5 = false;

        //@ drin?
        for(int i = 0; i < email.length(); i++){
            if(email.charAt(i) == '@'){
                atZeichen = true;
                break;
            }
        }

        // 5 zeichen drin?
        if(email.length() >= 5){
            min5 = true;
        }

        // ausgabe
        if(!atZeichen && !min5){
            return "Mindestens 5 Zeichen! und keine @";
        }else if(!min5){
            return "Mindestens 5 Zeichen!";
        }else if(!atZeichen){
            return "Keine @ zeichen";
        }
        
        // umwandeln zu Kleinbuchstaben
        return email.toLowerCase();
    }
}
