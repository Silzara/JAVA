package doWhile;

/*
Der Computer stellt dem User 5 Rechenaufgaben. Dazu werden zunächst die
beiden Zahlen (jeweils zwischen 1 und 10) zufällig ermittelt. Im nächsten
Schritt ermittelt der Computer zufällig, welche Rechenoperation benutzt werden soll.
	Zur Verfügung stehen:
    Addition (+)
    Subtraktion (-)
    Multiplikation (*)
    Division (/) (nur, wenn das Ergebnis ohne Nachkommastellen ist) Bsp.: 6/3 .. 8/2 .. etc..
    Modulo (%)

Nach jeder Aufgabe erhält der User eine Information.
Hat er richtig gerechnet, reicht ein "Prima" oder so :-)
Hat er falsch gerechnet, wird ein "Leider falsch" zusammen mit der richtigen Lösung ausgegeben.

Hat der User alle 5 Aufgaben bearbeitet, wird die Anzahl der korrekt bearbeiteten Aufgaben
ausgegeben.

Hinweis:
Eine Möglichkeit den jeweiligen Operator auszuwählen ist die Speicherung der Zeichen in einem Array.
Zugriff auf das Element im Array über eine Zufallszahl.

	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Random;
import java.util.Scanner;

/**   Pseudocode
   program Aufgabe5

 {

   int zahl1, zahl2, ergebnis, zufallsoperator, richtig
   int counter 0 gut 0
   char [] operator + - * / %
   Scanner sc
   Random rand

       DO
           zahl1=random(1 bis 10)
           zahl2=random(1 bis 10)
           zufallsoperator=random(0 bis 5)
                IF (zufallsoperator == /)
                      while(zahl1 % zahl2 != 0)
                             zahl1=random(1 bis 10)
                             zahl2=random(1 bis 10)
                      endwhile
                ENDIF

                Ausgabe text zahl1 + operator + zahl2 ?
                Eingabe ergebnis sc

                IF(zufallsoperator = + && ergebnis == zahl1+zahl2)
                        Ausgabe Prima
                        gut++
                else if(zufallsoperator = - && ergebnis == zahl1-zahl2)
                        Ausgabe Prima
                        gut++
                else if(zufallsoperator = * && ergebnis == zahl1*zahl2)
                        Ausgabe Prima
                        gut++
                else if(zufallsoperator = / && ergebnis == zahl1/zahl2)
                        Ausgabe Prima
                        gut++
                else if(zufallsoperator = % && ergebnis == zahl1%zahl2)
                        Ausgabe Prima
                        gut++
                else
                     IF(zufallsoperator = +)
                            richtig = zahl1 + zahl2
                     else if(zufallsoperator = -)
                            richtig = zahl1 - zahl2
                     else if(zafallsoperator = *)
                            richtig = zahl1 * zahl2
                     else if(zufallsoperator = /)
                            richtig = zahl1 / zahl2
                     else
                            richtig = zahl1 % zahl2
                     ENDIF

                Ausgabe text falsch + richtig
                ENDIF

                counter++
       WHILE(counter < 5)
       Ausgabe wie viele richtig +gut
 }

 */

public class Aufgabe5 {
    public static void main(String[] args) {

        //Variablen
        int zahl1, zahl2, ergebnis, zufallsoperator,counter =0, gut=0, richtig;
        char [] operator = {'+','-','*','/','%'};
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        do {
            zahl1 = rand.nextInt(1, 11);
            zahl2 = rand.nextInt(1, 11);
            zufallsoperator = rand.nextInt(0, 5);

            //Division ohne Nachkomastellen
            if (zufallsoperator == 3) {
                while (zahl1 % zahl2 != 0) {
                    zahl1 = rand.nextInt(1, 11);
                    zahl2 = rand.nextInt(1, 11);
                }
            }

            //Ausgabe & Eingabe
            System.out.println("Wie viel ist " + zahl1 + " " + (operator[zufallsoperator]) + " " + zahl2 + " ?");
            ergebnis = sc.nextInt();

                if (zufallsoperator == 0  && ergebnis == zahl1+zahl2 ) {
                    System.out.println("Prima");
                    gut++;
                }else if(zufallsoperator == 1  && ergebnis == zahl1-zahl2){
                    System.out.println("Prima");
                    gut++;
                }else if(zufallsoperator == 2  && ergebnis == zahl1*zahl2){
                    System.out.println("Prima");
                    gut++;
                }else if(zufallsoperator == 3  && ergebnis == zahl1/zahl2){
                    System.out.println("Prima");
                    gut++;
                }else if(zufallsoperator == 4  && ergebnis == zahl1%zahl2){
                    System.out.println("Prima");
                    gut++;
                }else {
                    // Falsche ausgabe + richtig ergebnis
                    if (zufallsoperator == 0) {
                        richtig = zahl1 + zahl2;
                    } else if (zufallsoperator == 1) {
                        richtig = zahl1 - zahl2;
                    } else if (zufallsoperator == 2) {
                        richtig = zahl1 * zahl2;
                    } else if (zufallsoperator == 3) {
                        richtig = zahl1 / zahl2;
                    } else {
                        richtig = zahl1 % zahl2;
                    }
                    System.out.println("Leider falsch, ergebnis ist " + richtig);
                }
            counter++;          //so nur 5 Übungen verlangt
        }while(counter < 5);    //so nur 5 Übungen verlangt
        //Ausgabe wie viele Richtig gemacht
        System.out.println("Du hast "+gut+" richtig gemacht");
    }
}
