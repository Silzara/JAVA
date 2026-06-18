package switchCase;

/*
In einem Array Namens "geheimeWerte", die alle positiv sind, das aus 500 Elementen besteht,
befindet sich an irgendeiner Stelle im Array der Wert -999.
Aus allen Datenwerten, die sich hinter dem Array-Element mit dem Wert -999 befinden, soll die Summe errechnet werden.
Sie sollen den entsprechenden Code dazu schreiben.
Da kein Zugriff auf das Array "geheimeWerte" besteht:

	Um den Code zu testen erzeugen Sie bitte ein Array mit 500 beliebigen ganzen Zahlen.
	Überschreiben Sie ein zufällig ausgewähltes Element dieses Arrays mit der Zahl -999.
	Die Stelle dieses Elementes ist ihnen nicht bekannt (also bitte nicht die dafür notwendige Zufallszahl des Index nutzen !).

Berechnen Sie die Summe der im Array hinter der -999 liegenden Zahlen.
Geben Sie diese Summe aus.

	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Random;

/**   Pseudocode
   program Aufgabe4

 {

     int [] geheimeWerte 500
     int randZahl 0, summe 0
     Random rand

     FOR(i 0 bis 500)
         geheimeWerte[i] = i+1
     ENDFOR

     geheimeWerte[rand(0, 500)] = -999

         FOR(x 0 bis 500)
              randZahl = x;
              break;
         ENDFOR

         FOR(j randZahl+1 bis 500)
             summe += geheimWerte[j]
         ENDFOR
     Ausgabe text summe
 }

 */

public class Aufgabe4 {
    public static void main(String[] args) {

    int [] geheimeWerte = new int[500];
    int  randZahl =0, summe=0;
    Random rand = new Random();

        //Array mit positiven Zahlen füllen
        for(int i = 0; i < 500; i++){
            geheimeWerte[i] = i+1;
        }// 1 bis 500

    geheimeWerte[rand.nextInt(0,500)] = -999;

        for(int x = 0; x < 500; x++){
            if(geheimeWerte[x] == -999){
                randZahl = x;
                break;
            }
        }

        for(int j = randZahl+1; j < 500; j++){
            summe += geheimeWerte[j];
        }

        //Ausgabe
    System.out.println("text "+summe);
    }
}
