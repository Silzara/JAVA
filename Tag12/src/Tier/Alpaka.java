package Tier;

public class Alpaka extends Tier {

    //Konstruktor
    public Alpaka(String name) {
        super(name, "Alpaka");
    }

    @Override
    public void gehorchen() {
        System.out.println(getName() + " spukt einen an. Oha !");
    }

    @Override
    public void streicheln() {
        System.out.println(getName() + " freut sich dabei.");
    }
}
