package Methoden;

import java.util.Scanner;

public class Main {

    ////////////////////////////////////////////////////////////////////////////////////
    public static void ausgabeZahl(int zahl, int wieOft) {
        for(int i = 0; i < wieOft; i++) {
            System.out.println(zahl);
        }
    }
    //////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);
        int eingabe,anzahl;

        System.out.print("Bitte ein Zahl eingeben: ");
        eingabe = sc.nextInt();

        System.out.print("Bitte die Anzahl eingeben");
        anzahl = sc.nextInt();

        //Methodenaufruf
        ausgabeZahl(eingabe, anzahl);

        System.out.println("Wird sind wieder im Hauptprogramm");
    }
    /////////////////////////////////////////////////////////////////////


}
