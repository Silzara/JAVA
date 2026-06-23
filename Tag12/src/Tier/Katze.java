package Tier;

public class Katze extends Tier{

    //wir wollen die "Funktionalität von Tier nutzen (also der Klasse Tier)
    //und dann bei Bedarf anpassen auf die Besonderheiten der Katze

    //Konstruktor
    public Katze(String name) {
        super(name, "Katze");
    }

    @Override
    public void gehorchen() {
        System.out.println(getName() + " schaut interessiert und gehorcht vielleicht.");
    }

    @Override
    public void streicheln() {
        System.out.println(getName()    + " lässt sich gerne streicheln und schnurrt\n");
    }

}
