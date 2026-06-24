package Sortieren;

import java.util.Arrays;

import static java.lang.System.console;

public class Main {
    public static void main(String[] args) {


        //Bubblesort
        //Variablen
        //int [] zahlen = new int[6]; // die Zahl in eckingen Klammern gibt NICHT den letzten Index vor
        //die Zahl in eckigen Klammern gibt die ANZAHL der Elemente des Arrays an !
        //z.B. bei 6 ganzen Zahlen haben wir die Indizes 0..5 und schreiben ... int[6] !!

        //alternative Array "befüllung"
        int[] zahlen = {2, 6, 1, 3, 5, 4 };
        int hilf;

        //to do - ist index 0 kleiner, grösser index 1
        //zahlen[0] < zahlen[1]
        //nicht tauschen --> also neues Array --> {6, 2, 1, 3, 5, 4}
        //zahlen[1] < zahlen[2]
        //tauschen --> also neues Array --> {2, 1, 6, 3, 5, 4}

        //Kontrollausgabe  start
        System.out.print("start: ");
        for(int i = 0; i < 6; i++){
            System.out.print(zahlen[i]+" ");
        }
        //line break
        System.out.println();

        // 1 dinge...
        for(int i = 0; i < 5; i++ ){
            if(zahlen[i] < zahlen[i+1]){
                //hier machen wir nix - weil kein Tauschbedarf besteht
            }else{
                //hier tauschen wir etwas - weil Tauschbedarf besteht
                //wir tauschen zahlen[i] und zahlen[i+1]
                hilf = zahlen[i];
                zahlen[i] = zahlen[i+1];
                zahlen[i+1] = hilf;
            }
        }
        //  mitte
        System.out.print("mitte: ");
        for(int i = 0; i < 6; i++){
            System.out.print(zahlen[i]+" ");
        }
        System.out.println();
        for(int i = 0; i < 5; i++ ){
            if(zahlen[i] < zahlen[i+1]){
                //hier machen wir nix - weil kein Tauschbedarf besteht
            }else{
                //hier tauschen wir etwas - weil Tauschbedarf besteht
                //wir tauschen zahlen[i] und zahlen[i+1]
                hilf = zahlen[i];
                zahlen[i] = zahlen[i+1];
                zahlen[i+1] = hilf;
            }
        }

        for(int i = 0; i < 5; i++ ){
            if(zahlen[i] < zahlen[i+1]){
                //hier machen wir nix - weil kein Tauschbedarf besteht
            }else{
                //hier tauschen wir etwas - weil Tauschbedarf besteht
                //wir tauschen zahlen[i] und zahlen[i+1]
                hilf = zahlen[i];
                zahlen[i] = zahlen[i+1];
                zahlen[i+1] = hilf;
            }
        }

        //Kontrollausgabe  start
        System.out.print(" ende: ");
        for(int i = 0; i < 6; i++){
            System.out.print(zahlen[i]+" ");
        }

        /**
        //Kontrollausgabe
        for(int i = 0; i < 6; i++){
            System.out.print(zahlen[i]+" ");
        }
         */


    }
}
