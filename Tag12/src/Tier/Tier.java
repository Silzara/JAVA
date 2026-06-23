package Tier;

public class Tier {

    //folgende Idee:
    //wir haben Member();
    //Attribute: Namen, Tierart
    //Methoden: gehorchen, streicheln

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

    public void gehorchen(){
        System.out.println(getName() + " gehorcht.");
    }

    public void striecheln(){
        System.out.println("Das Tier freut sich");
    }

}
