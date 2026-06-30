package Verschiedenes;

public class Auto {

    //Instanzattribute (Member)
    public String farbe;
    private int kilometerstand;

    //Klassenattribut (Member)
    private static int anzahlAutos = 0;

    //Konstruktor
    public Auto(String farbe){
        this.farbe = farbe;
        this.kilometerstand = 0;
        anzahlAutos++;
    }

    //Instanzmethode (Member)
    public void anzeigen(){
        System.out.println("Farbe: " + this.farbe);
        System.out.println("Kilometerstand: " + this.kilometerstand+"\n");
        System.out.println();
    }

    //Klassenmethode (Member)
    public static int getAnzahlAutos() {
        return anzahlAutos;
    }

    //Instantzmethode (Member)
    public void fahren (int km){
        kilometerstand += km;
    }
}
