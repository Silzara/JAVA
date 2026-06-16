package While;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Eingabe - Scanner benötigt
        Scanner sc = new Scanner(System.in);

        //Variablen
        int zahl;

        //EVA - Eingabe
        System.out.print("Bitte geben Sie bitte eine ganze Zahl ein: ");
        zahl = sc.nextInt();

        //Verarbeitung
        while(zahl > 1){
            zahl = zahl / 2;
            //EVA
            System.out.println("Zahl: " + zahl);
        }

        System.out.println("Nun sind wir wieder aus der Schleife raus. Sie ist beendet!!!!!");
    }
}
