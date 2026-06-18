package switchCase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //wir sollen das Ergebnis bei einem Fußballspiel "auswerten"
        //der Nutzer gibt ein ob es ein zwei oder drei Punkte "gab"
        //dann soll eine Ausgabe erfolgen ob es ein Sieg eine Niederlage oder ein Unentschieden ist

        Scanner sc = new Scanner(System.in);

        //Variablen
        int ergebnis;

        System.out.println("Bitte geben Sie die vergeben Punkte ein: ");
        ergebnis = sc.nextInt();

        switch(ergebnis){
            case 1:
                System.out.println("Unentschieden");
            case 2:
                System.out.println("Sieg");
            case 0:
                System.out.println("Niederlage");
        }
        switch(ergebnis){
            case 1 ->
                System.out.println("Unentschieden");
            case 2 ->
                System.out.println("Sieg");
            case 0 ->
                System.out.println("Niederlage");
        }

    }
}
