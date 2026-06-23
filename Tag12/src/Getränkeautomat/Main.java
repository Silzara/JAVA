package Getränkeautomat;

/*   Programmiere ein Java-Programm mit folgenden Anforderungen:
1. Erstelle eine Methode `main`, die das Programm startet.
2. Lege eine Variable für das **Guthaben** an, z.B. `int guthaben = 10;
3. Erstelle eine **eigene Methode** `zeigeMenue()`, die nur das Menü in der Konsole ausgibt (ohne Logik). Rufe sie aus `main` auf. Das Menü soll sein:
   - `1` – Wasser (Preis: 2 Euro)
   - `2` – Limonade (Preis: 3 Euro)
   - `3` – Kaffee (Preis: 4 Euro)
   - `0` – Beenden

4. Frage den Benutzer so lange nach einer Auswahl, **bis** er `0` eingibt. Verwende dafür eine **`do-while`**-Schleife.
5. Nutze **`switch case`**, um je nach Auswahl zu reagieren:

   - Bei gültiger Auswahl: Prüfe mit **`if/else`**, ob genug Guthaben vorhanden ist.
   - Wenn ja: Ziehe den Preis vom Guthaben ab (explizit: `guthaben = guthaben - preis;`) und gib aus: `„Getränk ausgegeben. Restguthaben: … Euro.“
   - Wenn nein: gib aus: `„Nicht genug Guthaben!“
   - Bei `0`: gib aus: `„Programm beendet. Restguthaben: … Euro.“
   - Bei ungültiger Eingabe: gib aus: `„Ungültige Auswahl!“`

	 Beispielablauf (Auszug)
--- Getränkeautomat ---
1 - Wasser (2 Euro)
2 - Limonade (3 Euro)
3 - Kaffee (4 Euro)
0 - Beenden
Guthaben: 10 Euro
Deine Auswahl: 2
Getränk ausgegeben. Restguthaben: 7 Euro

Deine Auswahl: 3
Getränk ausgegeben. Restguthaben: 3 Euro

Deine Auswahl: 3
Nicht genug Guthaben!

Deine Auswahl: 0
Programm beendet. Restguthaben: 3 Euro
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int zahl=1;
        int guthaben = 10;

        zeigeMenu();
        System.out.println("Guthaben: " + guthaben +" Euro");

        do {
            zahl = sc.nextInt();
            if(zahl > 3 || zahl < 0){
                System.out.println("Ungültige Auswahl!");
            }else {
                switch(zahl){
                    case 1: {
                        if(guthaben > 1){
                            guthaben =  guthaben - 2;
                            System.out.println("Wasser ausgegeben. Restguthaben: " + guthaben +"€");
                        }else{
                            System.out.println("Nicht genug Geld für Wasser!");
                        }
                        break;
                    }
                    case 2: {
                        if(guthaben > 2){
                            guthaben =  guthaben - 3;
                            System.out.println("Limonade ausgegeben. Restguthaben: " + guthaben +"€");
                        }else{
                            System.out.println("Nicht genug Geld für Limonade!");
                        }
                        break;
                    }
                    case 3: {
                        if(guthaben > 3){
                            guthaben =  guthaben - 4;
                            System.out.println("Kaffee ausgegeben. Restguthaben: " + guthaben +"€");
                        }else{
                            System.out.println("Nicht genug Geld für Kaffee!");
                        }
                        break;
                    }
                }
            }
        }while (zahl != 0);
        System.out.println("Program beendet. Restguthaben: " + guthaben+"€");
    }

    public static void zeigeMenu(){
        System.out.println("1 – Wasser (Preis: 2 Euro)");
        System.out.println("2 – Limonade (Preis: 3 Euro) ");
        System.out.println("3 – Kaffee (Preis: 4 Euro)  ");
        System.out.println("0 – Beenden");
    }
}
