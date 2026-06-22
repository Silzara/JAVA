package Auto;

public class Auto {

    //Das ist unsere Klasse Auto
    //HIER wollen wir nun die Variablen für das Auto definieren …
    //Attribute und Methoden nennt man Member
    //ein Auto der Klasse Auto ist ein sogenanntes Objekt oder auch Instantz
    //dieses Objekt wird nun "konstruiert" bzw erzeugt eine Instantz einsteht
    //durch den Standardkonstruktor - der ist nicht sichtbar !

    //Attribute
    private String marke;
    private String farbe;
    private int geschwindigkeit, tankinhalt;

    //normalerweise nutzt man einen eigenen Konstruktor
    public Auto(String marke, String farbe, int geschwindigkeit, int tankinhalt) {
        this.marke=marke;
        this.farbe = farbe;
        this.geschwindigkeit = geschwindigkeit;
        this.tankinhalt = tankinhalt;

        if(this.marke.equals("Ferrari")) {
            farbe = " rot ";
        }
    }

    //Statusmeldung
    //Methode

    public void status(){
//        System.out.println("Das Auto der Marke " + marke + " mit der Farbe " + farbe);
//        System.out.println("fährt mit " + geschwindigkeit + " und hat noch " + tankinhalt);
        System.out.println("Auto " + marke + " farbe " + farbe + " fährt " + geschwindigkeit + " mit " + tankinhalt);

    }
    //beschleunigen
    public void bescleunigen(){
        if(this.tankinhalt > 0) {
            this.geschwindigkeit = this.geschwindigkeit + 10;
            tankinhalt = tankinhalt - 10;
        }else{
            System.out.println("tank is leer!");
        }
    }
    public void bremse(){
        this.geschwindigkeit = this.geschwindigkeit -10;
    }

    //getter und setter - zugriff aud Attribute
    public int getTankinhalt() {
        return tankinhalt;
    }

    public String getFarbe() {
        return farbe;
    }
    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }
    public String getMarke() {
        return marke;
    }
    public String toString() {
        return "hehe";
    }

    public void setFarbe(String farbe) {
        if(!this.marke.equals("Ferrari")) {
            this.farbe = farbe;
        }
    }
}
