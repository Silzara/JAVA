package String;

/*	Postleitzahl-Check

Schreiben Sie eine Methode istPLZGueltig, die prüft:

	1. Die PLZ hat genau 5 Zeichen
	2. Jedes Zeichen ist eine Ziffer (0-9)

Testfälle: "12345"  "1234"  "12a45"  "123456"
Hinweis --> Ein Zeichen zeichen ist eine Zahl, wenn zeichen >= '0' && zeichen <= '9'
 */

public class AufgabePLZcheck {

    public static void main(String[] args) {
        String test1 = "12345";
        String test2 = "1234";
        String test3 = "12a45";
        String test4 = "123456";

        System.out.println(istPLZGueltig(test1));
        System.out.println(istPLZGueltig(test2));
        System.out.println(istPLZGueltig(test3));
        System.out.println(istPLZGueltig(test4));
    }

    public static boolean istPLZGueltig(String string){

        // 5 Zeichen genau
        if(string.length() != 5 ){
            return false;
        }
        // Zeichen sind Ziffern
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) < 48 || string.charAt(i) > 57 ){ // 48 ist '0' || 57 ist '9'
                return false;
            }
        }
        return true;
    }
}