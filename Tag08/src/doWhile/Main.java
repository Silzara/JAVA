package doWhile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Variablen
        String eingabe1,eingabe2;

        System.out.println("Bitte eine Eingabe");
        eingabe1 = sc.nextLine();

        //wenn sie ein Passwort prüfen, damm müssen sie vergleichen
        //ich will wissen ob das Passwort auch passwort ist
        if(eingabe1.equals("passwort")){
            System.out.println("yeah!");
        }else
            System.out.println("Seufz");
    }
}
