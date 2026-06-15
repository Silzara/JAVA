package Modulo;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

//        int zahl1, zahl2;
//
//        zahl1 = 11;
//        zahl2 = 4;
//
//        //möglische Rechenarten
//        System.out.printf("\nAddition: %d",zahl1+zahl2);
//        System.out.printf("\nSubtraction: %d",zahl1-zahl2);
//        System.out.printf("\nMultiplication: %d",zahl1*zahl2);
//        System.out.printf("\nDivision: %d",zahl1/zahl2);
//        System.out.printf("\nModulo: %d",zahl1%zahl2);
//
//        System.out.println("Modulo gibt den ganzzahligen Rest der Division aus");
//
//        for(int i = 1; i < 50; i++){
//            System.out.printf("\n%d Modula 11 = %d", i, i % 11);
//        }


        //ofc wollen oder müssen wir mit mehreren Werte, Variablen arbeiten
        //Messwerte, Temperaturen werden ermittelt und sollen ausgewertet werden
        //drei Messwerte, morgens mittags abends - ganze Zahlen reichen
        //von zwei Tagen bitte
        //doch bitte für zwei Wochen
        int messwert1, messwert2, messwert3;
        int messwert4, messwert5, messwert6;
        //wie haben eine Menge von gleichen Werten, gleich im Sinne - alles int
        //Lösung: array
        //was ist ein array?
        //Menge von gleichen Werten, z.B. 10 Messwerte - gesppeichert unter einem Name
        int[] messWerte = new int[10]; //hiermit erzeugen wir ein Array mit 10 "Plätzen" für Integer

        //wie "Kommt" man an einen messWert "ran" ?

        //zum Testen das Array mit Werten füllen
        for(int i = 0; i < 10; i++){

            messWerte[i] = i*2%3;
        }

        for(int i = 0; i < 10; i++){
            System.out.println("Messwerte[" + i + "] = " +messWerte[i]);
        }
    }
}