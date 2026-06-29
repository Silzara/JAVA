package String;

/*
Gegeben sind 3 Namen (sortiert!): "Anton", "Berta", "Caesar".
Der Benutzer gibt einen Namen ein. Ihr Programm soll sagen:

	- Kommt der gesuchte Name vor der Mitte (alphabetisch)?
	- Oder nach der Mitte?

Beispiel-Ablauf:

	- Eingabe: "Berta"
	- Programm prüft Mitte ("Berta")
	- Ausgabe: "Gefunden!"
	- Oder Eingabe: "Anton" --> Ausgabe: "Vor der Mitte"

 */

import java.util.Scanner;

public class AufgabeNamenSortierung {
    public static void main(String[] args) {

        String vor = "Anton";
        String mitte = "Berta";
        String nach = "Caesar";

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        switch (input) {
            case "Anton":
                System.out.println("Gefunden! vor Mitte");break;
            case "Berta":
                System.out.println("Gefunden! in der Mitte");break;
            case "Caesar":
                System.out.println("Gefunden! nach Mitte");break;
        }

    }
}
