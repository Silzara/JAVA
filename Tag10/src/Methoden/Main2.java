package Methoden;

import java.util.Scanner;

public class Main2 {
    //****************************************************************
    public static int sucheMinimum(int zahl1, int zahl2){
        int minimum;

        //Minimum wird ermittelt
        if(zahl1 <= zahl2){
            minimum = zahl1;
        }else{
            minimum = zahl2;
        }
        return minimum;
    }
    //****************************************************************
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eingabe1, eingabe2;
        int ergebnis;

        System.out.print("Bitte die erste Zahl eingeben:");
        eingabe1 = scanner.nextInt();
        System.out.print("Bitte die zweite Zahl eingeben:");
        eingabe2 = scanner.nextInt();

        ergebnis = sucheMinimum(eingabe1, eingabe2);
        System.out.println("Die kleinere Zahl ist: " + ergebnis);
    }
    //**************************************************************
}
