package Drucker;

public class Drucker {

    private String model;
    private int anzahl;
    private boolean zustand = false;
    final private String error = "Falsche eingabe! Nor positive Werte!";
    final private String woPapier = "Nicht genug papier";
    final private String druckerAUS = "Der Drucker ist aus!";

    public Drucker(String model, int anzahl) {
        this.model = model;
        this.anzahl = anzahl;
        zustand = false;
    }

    public void einschalten(){
        zustand = true;
    }

    public void ausschalten(){
        zustand = false;
    }

    public void papierNachfuellen(int anzahl){
        if (anzahl > 0){
            this.anzahl += anzahl;
        }else System.out.println(error);
    }

    public void drucken(int anzahl){
        if (zustand && this.anzahl >= anzahl){
            this.anzahl = this.anzahl - anzahl;
        }else if(zustand) {
            System.out.println(woPapier);
        }
        else {
            System.out.println(druckerAUS);
        }
    }
    public void zeigeStatus() {
        System.out.println(("Model: " + model + ", anzahl: " + anzahl + ", zustand: " + zustand));
    }

    public int getPapier() {
        return anzahl;
    }
}
