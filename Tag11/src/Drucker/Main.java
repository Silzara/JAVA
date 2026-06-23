package Drucker;

public class Main {
    public static void main(String[] args) {

        Drucker hpLaserJet = new Drucker("HP LaserJet", 10);
        hpLaserJet.zeigeStatus();
        hpLaserJet.drucken(3);
        hpLaserJet.zeigeStatus();
        hpLaserJet.einschalten();
        hpLaserJet.drucken(4);
        hpLaserJet.zeigeStatus();
        hpLaserJet.drucken(20);
        hpLaserJet.zeigeStatus();
        hpLaserJet.papierNachfuellen(10);
        hpLaserJet.zeigeStatus();

    }
}
