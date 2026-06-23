package Tier;

public class Piranha extends Tier {

    //Konstruktor
    public Piranha(String name) {
        super(name, "Piranha");
    }

    public void bluebbern(){
        System.out.println(getName() + " macht lustige bubbles");
    }

    @Override
    public void gehorchen() {
        System.out.println(getName() + " schwimmt rum und peilt nichts.");
    }

    @Override
    public void streicheln() {
        System.out.println(getName() + " zack Finger ab. Piranha schaut zufrieden");
    }

    public void blubbern(){
        System.out.println(getName() + " macht lustige bubbles");
    }
}
