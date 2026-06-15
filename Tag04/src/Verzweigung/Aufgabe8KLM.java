package Verzweigung;

/*   Temperatur-Warner (Thema: Einfache Verzweigung)

Fordere den User auf, die aktuelle Temperatur in Grad Celsius einzugeben.
Wenn die Temperatur über 30 Grad liegt, gib aus: „Es ist sehr heiß, denk an Sonnenschutz!“
Andernfalls (bei 30 Grad oder weniger) gib aus: „Die Temperatur ist angenehm.“
Anforderung: Erstelle erst den Pseudocode und dann das Java-Programm

Eingabe: 32
Ausgabe: Es ist sehr heiß, denk an Sonnenschutz!

Eingabe: 20
Ausgabe: Die Temperatur ist angenehm.

 */

import java.util.Scanner;

/**   Peudocode
   program Aufgabe8KLM

 {

 int x
 Scanner sc

 Ausgabe text x
 Eingabe x

 if(x > 30)
      Ausgabe text ...Sonneschutz!
 else
      Ausgabe text ...angenehm.

 }

 */

public class Aufgabe8KLM {
    public static void main(String[] args) {

        //Variablen & Scanner
        int x;
        Scanner sc = new Scanner(System.in);

        //Eingaben
        System.out.println("Geben Sie die aktuelle Temperatur in Grad Celsius ein:");
        x = sc.nextInt();

        //Ausgaben
        if(x > 30){
            System.out.println("Es ist sehr heiß, denk an Sonnenschutz!");
        }else{
            System.out.println("Die Temperatur ist angenehm.");
        }
    }
}
