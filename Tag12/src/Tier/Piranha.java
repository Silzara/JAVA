package Tier;

public class Piranha extends Tier {

    //Konstruktor
    public Piranha(String name) {
        super(name, "Piranha");
    }

    @Override
    public void gehorchen() {
        System.out.println(getName() + " schwimmt rum und peilt nichts.");
    }

    @Override
    public void striecheln() {
        System.out.println(getName() + " zack Finger ab. Piranha schaut zufrieden");
    }
}
