package Tier;

public class Hund extends Tier implements Blubbern {

    //Konstruktor
    public Hund(String name) {
        super(name, "Hund");
    }

    @Override
    public void gehorchen() {
        System.out.println(getName() + " wackelt mit dem Schwanz und gehorcht !!!!");
    }

    @Override
    public void streicheln() {
        System.out.println(getName() + " freut sich wie Bolle\n");
    }

    @Override
    public void blubbern(){
        System.out.println(getName() + " hält die Nase unter Wasser und blubbert");
    }
}
