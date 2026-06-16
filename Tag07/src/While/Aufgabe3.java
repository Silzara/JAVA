package While;

/*
Lies wiederholt ganze Zahlen ein, bis 0 eingegeben wird.
Berücksichtige nur positive Werte (> 0) für die Auswertung.
Gib am Ende Anzahl, Summe und den Durchschnitt der berücksichtigten Werte aus (Durchschnitt mit zwei Nachkommastellen).

Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Scanner;

/**   Pseudocode
 program Aufgabe3

 {
 
    double zahl, summe, average, sizeAverage, temp
    Scanner sc
 
    Ausgabe text input zahl
    Eingabe sc zahl & temp = zahl
       if(zahl < 0)
          Ausgabe Nur possitive werte!
          Eingabe sc zahl
       endif

    while(zahl != 0)
           Ausgabe text posittive zahl oder 0
           Eingabe sc zahl
                if(zahl <0)
                    Ausgabe Nur possitive werte!
                    Eingabe sc zahl
                endif
           summe += zahl
           sizeAverage++
    endwhile

 summe += temp
 average = summe / sizeAverage

 Ausgabe text summe
 Ausgabe text average

 }

 */

public class Aufgabe3 {
    public static void main(String[] args) {

//        double zahl = 0, summe = 0,  size=0, temp;
//        double average;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Bitte eine positive Zahl oder 0 für rechnung geben");
//        zahl = sc.nextDouble();
//        temp = zahl;
//
//        if(zahl < 0){
//            System.out.println("Nur possitive werte!");
//            zahl = sc.nextDouble();
//        }
//        while(zahl > 0 ){
//            System.out.println("Bitte eine positive Zahl oder 0 für rechnung geben");
//            zahl = sc.nextDouble();
//            if(zahl < 0){
//                System.out.println("Nur possitive werte!");
//                zahl = sc.nextDouble();
//            }
//            summe += zahl;
//            size++;
//        }
//        summe += temp;
//        average = summe / size;
//        System.out.println("Summe: " + summe);
//        System.out.printf("Average: %.2f", average);


            Scanner sc = new Scanner(System.in);

            double zahl, summe = 0, anzahl = 0, durchschnitt;

            System.out.println("Bitte positive Zahlen eingeben");

            while((zahl = sc.nextDouble()) != 0) {
                if(zahl > 0) {
                    summe += zahl;
                    anzahl++;
                } else {
                    System.out.println("Eingabe war kleiner als 0");
                }
            }
            durchschnitt = summe / anzahl;
            System.out.printf("Anzahl = %.2f; Summe = %.2f; Durchschnitt = %.2f", anzahl, summe, durchschnitt);
        }
    }

