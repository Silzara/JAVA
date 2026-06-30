package Verschiedenes;

public class Main {
    public static void main(String[] args) {

        //Adressen und Referenzen
        //Stack und Heap
        //Klassen und Instanzmember

        int anzahl = 0;
        int test;

        Auto auto1 = new Auto("gelb");
        Auto auto2 = new Auto("grün");
        Auto auto3 = new Auto("rosa");
        Auto auto4 = new Auto("gelb");
        Auto auto5 = new Auto("gelb");
        Auto auto6 = new Auto("gelb");

        auto3 = auto1; //auto1 ist ein Objekt (Heap), auto3 ist eine Referenz (Stack)

        auto1.fahren(100);
        auto2.fahren(10);

        System.out.println(Auto.getAnzahlAutos());

        /**auto1.anzeigen();
        auto2.anzeigen();
        auto3.anzeigen();

        auto1.fahren(10000);
        auto3.farbe = "rosa";

        auto1.anzeigen();
        auto2.anzeigen();
        auto3.anzeigen();

        test = anzahl;

        anzahl = 3;

        System.out.println("Anzahl: " + anzahl);

        System.out.println("Test hat den Wert: " + test);
         */
    }
}
