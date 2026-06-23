package Tier;

public class Hund extends Tier {

    //Konstruktor
    public Hund(String name) {
        super(name, "Hund");
    }

    @Override
    public void gehorchen() {
        System.out.println(getName() + " wackelt mit dem Schwanz und gehorcht !!!!");
    }

    @Override
    public void striecheln() {
        System.out.println(getName() + " freut sich wie Bolle\n");
    }
}
