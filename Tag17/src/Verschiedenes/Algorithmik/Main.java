package Verschiedenes.Algorithmik;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int zahl=1, zufallszahl, zufallszahl2,input;
        int guthaben = 10;

        zeigeMenu();

        do {
            zahl = sc.nextInt();
            if(zahl > 5 || zahl < 1){
                System.out.println("Ungültige Auswahl!");
            }else {
                switch(zahl){
                    case 1: {
                        zufallszahl = rand.nextInt(1,101);
                        int attempts = 0;
                        System.out.println("Guess the Zahl!");
                        do{
                            attempts++;
                            System.out.println(zufallszahl);
                            input = sc.nextInt();
                            if(input > zufallszahl){
                                System.out.println("Zu gross!");
                            }else if(input < zufallszahl){
                                System.out.println("Zu klein!");
                            }else{
                                System.out.println("Bingo!");
                            }
                        }while(input != zufallszahl);
                        System.out.println(attempts);
                        break;
                    }
                    case 2: {
                        int versuche = 3;
                        int antwort;
                        boolean korrekt = false;

                        zufallszahl = rand.nextInt(2, 10);
                        zufallszahl2 = rand.nextInt(2,10);
                        antwort = zufallszahl * zufallszahl2;

                        System.out.println(zufallszahl + " * " + zufallszahl2 + " = ?");

                        for (int i = 0; i < versuche; i++) {
                            input = sc.nextInt();

                            if (input == antwort) {
                                System.out.println("Korrekt!");
                                korrekt = true;
                                break;
                            }
                        }

                        if (!korrekt) {
                            System.out.println("Korrekt war: " + antwort);
                        }
                        break;
                    }
                    case 3: {
                        int summe = 0, i =1;

                        System.out.println("N eingeben:");
                        input = sc.nextInt();

                        if (input < 1) {
                            System.out.println("Ungültige Eingabe!");
                        } else {
                            while (i <= input) {
                                summe += i;
                                i++;
                            }
                            System.out.println("Summe von 1 bis " + input + " = " + summe);
                        }
                        break;
                    }
                    case 4: {
                        int [] zufallZahlen = new int[20]; int same=0;

                        //array mit 20 zufallzahlen
                        for (int i = 0; i < zufallZahlen.length; i++) {
                            zahl = rand.nextInt(1,101);
                            zufallZahlen[i] = zahl;
                        }
                        int min = zufallZahlen[0];

                        //min
                        for (int i = 0; i < zufallZahlen.length; i++) {
                            if (zufallZahlen[i] < min) {
                                min = zufallZahlen[i];
                            }
                        }

                        //same
                        for (int i = 0; i < zufallZahlen.length; i++) {
                            if (zufallZahlen[i] == min) {
                                same++;
                            }
                        }
                        System.out.println("Min: "+min);
                        System.out.println(min+" gefunden "+same+ " mal");
                        break;
                    }
                }
            }
        }while (zahl != 5);
        System.out.println("Program beendet.");
    }

    //zeigeMenu()
    public static void zeigeMenu(){
        System.out.println("1 – Zahlraten");
        System.out.println("2 – Multiplikationstrainer");
        System.out.println("3 – Summe von 1 bis N");
        System.out.println("4 – Minimum in fester Liste");
        System.out.println("5 – Beenden");
    }
}
