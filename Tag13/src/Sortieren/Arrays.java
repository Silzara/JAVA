package Sortieren;

/*
Der Nutzer kann 10 ganze Zahlen eingeben. Diese werden in einem Array gespeichert.	
Dieses Array wird mit bubble Sort sortiert.	
Anschliessend erfolgt die Ausgabe des Arrays.
	
Erstellen Sie zuerst den Pseudocode.
Dann ein lauffähiges JAVA Programm.
 */

import java.util.Scanner;

/**   Pseudocode
   program Arrays

 {
     Scanner sc
     int [] zahlen 
   
     Ausgabe text zahl x10
     Eingabe zahl sc
 
     FOR(1 bis 10)
          zahlen(1 bis 10) = zahl 
     ENDFOR
 
     bubblesort(zahlen)
     Ausgabe text zahlen

     bubblesort()
           int atempts 0
           DO
              FOR(0 bis 9)
                   IF(zahli > zahli+1)
                       int temp = zahli
                       zahli = zahli+1
                       zahli+1 = temp
                   ENDIF
              ENDFOR
              atempts++
           WHILE(atemps < 9)
 }
 
 */

public class Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] zahlen = new int[10];
        //int [] zahlen = {10,1,5,2,9,6,7,4,3,8};
        int zahl = 0;

        System.out.println("Bitte 10 Zahlen eingeben:");
        for (int j = 0; j < 10; j++){
            zahl = sc.nextInt();
            zahlen[j] = zahl;
        }
        //System.out.println("Ist: "+zahlen[5]);
        bubblesort(zahlen);
        System.out.println(java.util.Arrays.toString((zahlen)));
    }

    //start bubblesort()
    public static int [] bubblesort(int[] zahlen){
        int atempts=0;

        do {
            for (int i = 0; i < 10 - 1; i++) {
                if (zahlen[i] > zahlen[i + 1]) {
                    int temp = zahlen[i];
                    zahlen[i] = zahlen[i + 1];
                    zahlen[i + 1] = temp;
                }
            }
            atempts++;
        }while (atempts<9);
        return zahlen;
    }
}
