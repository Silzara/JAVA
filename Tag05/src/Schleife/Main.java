package Schleife;

public class Main {
    public static void main(String[] args) {

//        //Zufall - Zufallszahlen
//        //notwendige Vorbereitung um eine Zufallszahl erzeugen und nutzen zu können
//        Random zufall = new Random();
//
//        int zufallsZahl;
//
//        for(int i = 0; i < 10; i++) {
//            //wir wollen einen Würfel simulieren
//            //Syntag: ... nextInt(untereGrenze, obereGrenze+1)
//            zufallsZahl = zufall.nextInt(1, 20 + 1);
//            System.out.println(zufallsZahl);
//        }

        int zahl1, zahl2, hilf;

        zahl1 = 10;
        zahl2 = 15;

        //die Zahlen sollen getauscht werden

        hilf = zahl1;
        zahl1 = zahl2;
        zahl2 = hilf;

        System.out.println(zahl1);
        System.out.println(zahl2);

        //und nun ohne Hifsvariable
        zahl1 = 0;
        zahl2 = 5;

        zahl1 = zahl1 + zahl2;   // 0 = 0 + 5
        zahl2 = zahl1 - zahl2;   // 5 = 0 - 5
        zahl1 = zahl1 - zahl2;   // 0 = 0 - -5

        System.out.println(zahl1);
        System.out.println(zahl2);
    }
}
