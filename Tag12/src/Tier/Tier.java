package Tier;

public abstract class Tier {

    //folgende Idee:
    //wir haben Member();
    //Attribute: Namen, Tierart
    //Methoden: gehorchen, streicheln

    //nach dem erstellen der Kklassen für Katze Hund usw
    //möchten wir kein "Tier" mehr zulassen
    //Tier soll nur noch ein "Bauplan" sein - aber es soll kein Objekt Tier mehr geben

    //Attribute
    private String name;
    public String tierart;

    //Konstruktor
    public Tier(String name, String tierart) {
        this.name = name;
        this.tierart = tierart;
    }

    //Methode um Tiernamen anzeigen zu können, notwendig wegen Private !
    public String getName() {
        return name;
    }

    //Methode um die Tierart anzeigen zu können, notwendig wegen Private !
    public String getTierart() {
        return tierart;
    }

    public abstract void gehorchen();

    public abstract void streicheln();

}
