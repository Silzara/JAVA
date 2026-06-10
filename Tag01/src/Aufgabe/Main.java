package Aufgabe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Kommentare - ich will Hallow Welt ausgeben
        mit persönlicher BEgrüssung
        wir brauchen den Named
        */

        Scanner eingaben = new Scanner(System.in);
        String namen;

        // Ausgaben
        System.out.println("Bitte geben Sie ihren Namen ein: ");
        namen = eingaben.nextLine();
        System.out.println("Hallo Welt " + namen);

        System.out.println("Noch ein Text");

    }
}
