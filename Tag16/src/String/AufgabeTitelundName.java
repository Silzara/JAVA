package String;

/*
Schreiben Sie ein Programm, das einen String in zwei Teile zerlegt, Titel und Name.
Von "Dr. Maria Schmidt" soll extrahiert werden:

	- Titel: Alles vor dem ersten Leerzeichen
	- Rest: Alles nach dem ersten Leerzeichen

Hinweis: Was passiert wenn kein Leerzeichen vorhanden ist? (z.B. nur Maria als String vorliegt?)
 */

public class AufgabeTitelundName {
    public static void main(String[] args) {

        String test = "Dr. Maria Schmidt";
        String [] name;
        name = pruefeTitle(test);
        System.out.println(name[0]);
        System.out.println(name[1]);

    }

    public static String [] pruefeTitle(String string){
        String [] result = new String[2];
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == ' '){
                result[0] = string.substring(0, i);
                result[1] = string.substring(i+1, string.length());
                break;
            }
        }
        return result;
    }
}
