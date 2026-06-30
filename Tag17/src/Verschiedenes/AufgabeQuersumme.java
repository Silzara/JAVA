package Verschiedenes;

/*
Eine Niven-Zahl ist eine ganze positive Zahl, die durch ihre Quersumme ohne Rest teilbar ist.
	Beispiel: 777 => Quersumme ist 7 + 7 + 7 = 21 =>  777 = 21 * 37
    Damit ist 777 eine Niven-Zahl

Sie sollen ein Programm entwerfen, dass vom Benutzer eine ganze Zahl als Eingabe erhält und anschließend ausgibt,
ob es sich um eine Niven Zahl handelt oder nicht.
Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Scanner;

/**   Pseudocode
   program AufgabeQuersumme

 {
      Main()
          Scanner sc
          Eingabe int zahl sc

          Ausgabe text istNivenZahl(zahl)

      zahlLength(int)
          int length 1, modulo 10

          DO
                modulo *= 10
                length++
          WHILE(modulo <= zahl)

      istNivenZahl(int)
          int summe 0, temp 0, zahlOrig = zahl, zahlLength = zahlLength(zahl)
          IF(zahl <= 0)
                  Ausgabe false
          ENDIF
          FOR i bis zahlLength
               temp = zahl % 10
               summe += temp
               zahl = zahl / 10
          ENDFOR
          IF zahlOrig % summe == 0
               Ausgabe true
          ENDIF
          Ausgabe false
 }

 */

public class AufgabeQuersumme {

    //Main()
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int zahl = sc.nextInt();

        System.out.println(istNivenZahl(zahl));
    }

    // zahlLength()
    public static int zahlLength(int zahl){

        int length = 1;
        int modulo = 10;

        do{
            modulo *= 10;
            length++;
        }while(modulo <= zahl);
        return length;
    }

    // istNivenZahl()
    public static boolean istNivenZahl(int zahl) {

        int summe = 0, temp = 0, zahlOrig = zahl;
        int zahlLength = zahlLength(zahl);

        //Error für negativen Zahlen oder 0
        if(zahl <=0) {
            return false;
        }

        for(int i=0; i < zahlLength; i++){
            temp = zahl % 10;
            summe += temp;
            zahl = zahl / 10;
        }

        if((zahlOrig % summe) == 0){
            return true;
        }
        return false;
    }
}
