package Auto;

/*   Aufgabe Konto
Selbstlernaufgabe: Klasse „Konto“ (OOP-Grundlagen in Java)
Erstellen Sie eine Klasse Konto und setzen Sie dabei die grundlegenden Konzepte der objektorientierten Programmierung um.

1. Attribute
Definieren Sie folgende Attribute:
    Name des Kontoinhabers (String)
    Kontostand (double)
Beide Attribute sind privat.

2. Konstruktor
Erstellen Sie einen Konstruktor, der:
    den Namen des Kontoinhabers übernimmt
    einen Startkontostand setzt

3. Methoden
Implementieren Sie folgende Methoden:
    einzahlen(double betrag)
    Erhöht den Kontostand um den übergebenen Betrag.
    auszahlen(double betrag)
    Verringert den Kontostand um den Betrag.
Falls nicht ausreichend Guthaben vorhanden ist, geben Sie eine Meldung aus und führen Sie keine Auszahlung durch.

zeigeKontostand()
Gibt den Namen des Kontoinhabers sowie den aktuellen Kontostand aus.

4. Testprogramm
Erstellen Sie eine separate Klasse mit einer main-Methode.
Führen Sie darin folgende Schritte durch:
    Konto anlegen:
    Inhaber: Max Mustermann
    Startguthaben: 1000

    Kontostand ausgeben
    Erwartung: 1000

    500 einzahlen
    Erwartung: 1500

    200 auszahlen
    Erwartung: 1300

    Versuch, 2000 auszuzahlen
    Erwartung: Fehlermeldung, Kontostand bleibt unverändert

    Kontostand erneut ausgeben
    Erwartung: 1300
5. Zusatz (optional)
    Verhindern Sie negative Beträge bei Ein- und Auszahlung
    Geben Sie in solchen Fällen eine entsprechende Meldung aus
 */
public class Konto {

    //Variablen
    private String kontoinhaber;
    private double kontostand;
    final private String error = "Falsche eingabe, nur positive Werte erlaubt!";

    public Konto(String kontoinhaber, double kontostand) {
        this.kontoinhaber = kontoinhaber;
        this.kontostand = kontostand;
    }

    //Setter & Getter
    public void einzahlen(double betrag){
        if(betrag > 0) {
            kontostand = kontostand + betrag;
        }else System.out.println(error);
    }

    public void auszahlen(double betrag){
        if (betrag <= 0) {
            System.out.println(error);
        } else if (betrag > kontostand) {
            System.out.println("Fehler: Nicht genug Guthaben.");
        } else {
            kontostand -= betrag;
        }
    }

    public void zeigeKontostand(){
        System.out.println(("Kontostand: " + kontoinhaber + " hat " + kontostand + " €"));
    }
}
