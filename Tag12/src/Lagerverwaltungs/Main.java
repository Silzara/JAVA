package Lagerverwaltungs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variablen
        Scanner sc = new Scanner(System.in);
        int wahl,menge;
        int [] bestand =  {0,0,0,0,0};
        String [] artikel = {"Schrauben","Nägel","Muttern","Unterlegscheiben","Dübel"};

        //Eingabe & Ausgabe
        do{
            switch(wahl=sc.nextInt()){
                case 1:{
                    zeigeLager(artikel, bestand);
                    sc.nextLine();
                    break;
                }
                case 2:{
                    System.out.println("Geben Artikelnummer: (0-4)");
                    int artikelnummer = sc.nextInt();
                    if(artikelnummer >= 0 && artikelnummer < 5){
                        System.out.println("**Menge**");
                        menge=sc.nextInt();
                        if(menge>=0){
                            bestand[artikelnummer] = bestand[artikelnummer]+menge;
                        }else {
                            System.out.println("Nur positive werte!");
                            break;
                        }
                    }else{
                        System.out.println("Ungültige Artikelnummer!");
                        break;
                    }
                    System.out.println("Artikelnummer: "+artikel[artikelnummer]+ "erhöht mit Menge: "+bestand[artikelnummer]);
                    sc.nextLine();
                    break;
                }
                case 3:{
                    System.out.println("Geben Artikelnummer: (0-4)");
                    int artikelnummer = sc.nextInt();
                    if(artikelnummer >= 0 && artikelnummer < 5){
                        System.out.println("**Menge**");
                        menge=sc.nextInt();
                        if(bestand[artikelnummer] >= menge){
                            bestand[artikelnummer] =bestand[artikelnummer]- menge;
                        }else {
                            System.out.println("Nicht genug inventar!");
                            break;
                        }
                    }else{
                        System.out.println("Ungültige Artikelnummer!");
                        break;
                    }
                    System.out.println("Artikelnummer: "+artikel[artikelnummer]+ "verringert mit Menge: "+bestand[artikelnummer]);
                    sc.nextLine();
                    break;
                }
                case 4:{
                    System.out.println("Geben Artikelnummer: (0-4)");
                    int artikelnummer = sc.nextInt();
                    if(artikelnummer >= 0 && artikelnummer < 5){
                        if(bestand[artikelnummer] == 0){
                            System.out.println("Artikel ist leer.");
                        }else{
                            System.out.println("Artikel ist vorhanden.");
                        }
                    }else{
                        System.out.println("Ungültige Artikelnummer!");
                        break;
                    }
                    sc.nextLine();
                    break;
                }
                case 0:{
                    System.out.println("Beenden");
                    sc.nextLine();
                    break;
                }
                default:{
                    System.out.println("1 für info, 2 für erhöhung, 3 für verringerung und 4 für 0 Prüfung");
                    sc.nextLine();
                    break;
                }
            }

        }while(wahl != 0);
    }

    //start zeigeLager()
    public static void zeigeLager(String [] artikel, int [] bestand) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ": "+artikel[i]+" - Bestand:"+bestand[i]);
        }
    }//end zeigeLager()
}
