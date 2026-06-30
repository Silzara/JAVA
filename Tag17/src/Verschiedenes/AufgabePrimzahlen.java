package Verschiedenes;

/*
Der Nutzer kann eine Zahl eingeben.
Danach werden ihm alle Primzahlen bis einschliesslich zu seiner Eingabe angezeigt.

Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Scanner;

/**   Pseudocode
   program AufgabePrimzahlen

 {
       Main()
           Scanner sc
           int zahl = sc
           primZahlen(zahl)

       istPrime(int eingabe)
           FOR(2 bis eingabe)
                 IF(eingabe % i == 0)
                        return false
                 ENDIF
           ENDFOR
           return true

       primeZahlen(int eingabe)
           FOR(2 bis eingabe)
                 IF(istPrime(i)
                      Ausgabe text i
                 ENDIF
           ENDFOR
 }

 */

public class AufgabePrimzahlen {

    //Main()
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int zahl = sc.nextInt();

        primeZahlen(zahl);
    }

    //istPrime()
    public static boolean istPrime(int zahl){
        for (int i = 2; i < zahl/2; i++) {
            if (zahl % i == 0) {
                return false;
            }
        }
        return true;
    }

    //primeZahlen()
    public static void primeZahlen(int zahl){
        for (int i = 2; i <= zahl; i++) {
            if(istPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
