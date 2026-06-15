package Schleife;

/*   Aufgabe: Temperatur-Analyse
Schreibe ein Programm, das:
	1.	Den Benutzer auffordert 12 Temperaturen (in °C) einzugeben.

	2.	Jede Temperatur soll überprüft werden:
		-	Wenn die Temperatur größer als 30 ist:
				Gib aus: „Sehr heißer Tag.“
		-	Wenn die Temperatur zwischen 20 und 30 liegt:
				Prüfe zusätzlich:
				Wenn die Temperatur genau 25 ist, gib aus: „Perfektes Wetter!“
				Sonst: „Angenehm warm.“
		-	Wenn die Temperatur zwischen 10 und 19 liegt:
				Gib aus: „Kühl.“
		-	Wenn die Temperatur kleiner als 10 ist:
				Prüfe zusätzlich:
				Wenn die Temperatur unter 0 ist, gib aus: „Eisig kalt!“
				Sonst: „Sehr kalt.“

	3.	Am Ende soll das Programm die Durchschnittstemperatur ausgeben.

	4.	Außerdem soll gezählt werden:
		-	Wie viele Tage waren heiß (>30)?
		-	Wie viele Tage waren kalt (<10)?
		-	Wie viele Tage waren perfekt (=25)?
 */

import java.util.Scanner;

/**   Pseudocode
   program Aufgabe5

 {

     int temperatur, durch, heis, kalt, perfekt
     Scanner sc

for(i=1; i <= 12; i++)
 {
    Ausgabe text temperatur
    Eingabe temperatur sc

    if(temperatur > 30)
        Ausgabe text "Sehr heißer Tag."
        heis++
    else if(temperatur >= 20 && temperatur <= 30)
        if(temperatur == 25)
            Ausgabe text "Perfektes Wetter!"
            perfekt++
        else
            Ausgabe text "Angenehm warm."
    else if(temperatur >= 10 && temperatur < 20)
        Ausgabe text "Kühl."
    else
        if(temperatur < 0)
            Ausgabe text "Eisig kalt!"
            kalt++
        else
            Ausgabe text "Sehr kalt."
            kalt++

    durch += temperatur
 }
 Ausgabe durch/12
 Ausgabe heis
 Ausgabe kalt
 Ausgabe perfekt

 }

 */

public class Aufgabe5 {
    static void main(String[] args) {

        int temp, durch=0, heis = 0, kalt = 0, perfekt = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 12; i++){
            System.out.println("Geben Sie die Temperaturen der 12 Tage ein: ");
            temp = sc.nextInt();
            if(temp > 30){
                System.out.println("Sehr heißer Tag.");
                heis++;
            }
            else if(temp >= 20 && temp <= 30){
                if(temp == 25){
                    System.out.println("Perfektes Wetter!");
                    perfekt++;
                }
                else{
                    System.out.println("Angenehm warm.");
                }
            }
            else if(temp >= 10 && temp <= 19){
                System.out.println("Kühl.");
            }
            else{
                if(temp < 10 && temp == 0){
                    System.out.println("Eisig kalt!");
                    kalt++;
                }
                else{
                    System.out.println("Sehr kalt.");
                    kalt++;
                }
            }
            durch += temp;
        }
        System.out.println("Durchschnittstemperatur: " + durch/12);
        System.out.println("Anzahl heißer Tage: " + heis);
        System.out.println("Anzahl kalter Tage: " + kalt);
        System.out.println("Anzahl perfekter Tage: " + perfekt);
    }
}
