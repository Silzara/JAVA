package Tier;

public class Main {

    public static void main(String[] args) {

        //Katze katze1 = new Katze("Mauzi");
        //Hund hund1 = new Hund("Rex");
        //Piranha piranha1 = new Piranha("Hans");

        //Polymorphie
        //wir wollen mehrere Tiere, Objekte Tier erzeugen, von spezifischen Tierarten
        //wir nutzen ein Array

        Tier[] tiere = new Tier[5];

        tiere[0] = new Katze("Mauzi");
        tiere[1] = new Hund("Red");
        tiere[2] = new Piranha("Zahnhans");
        tiere[3] = new Piranha("Zahnbert");
        tiere[4] = new Alpaka("Jack");

        Piranha bubbles = new Piranha("Bubbles");

        for(int i = 0; i < 5; i++){
            System.out.println(tiere[i].getTierart() + " mit dem Namen: " + tiere[i].getName());
            tiere[i].gehorchen();
            tiere[i].streicheln();
            System.out.println();
        }

        bubbles.bluebbern();

        //tiere[1].

    }
}
