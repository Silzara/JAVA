package switchCase;

/*
Sie sollen 10 Leuchten verwalten. Jede Leuchte kann die Zustände EIN (Wert 1) oder AUS (Wert -1) haben.
Zu Beginn des Programms sind alle Leuchten ausgeschaltet.
Nun hat der Benutzer über ein Menü die Möglichkeiten das Programm zu verlassen oder auf den Schalter
einer Leuchte zu drücken. War die Leuchte vorher im Zustand EIN, dann hat sie anschließend den Zustand AUS
und umgekehrt. Wenn der Benutzer das Menü verlässt, dann soll ihm der Zustand jeder Leuchte ausgegeben werden.

	Bitte erstellen Sie:
	- den entsprechenden Pseudocode
	- anschliessend ein lauffaehiges JAVA Programm
 */

import java.util.Scanner;

/**   Pseudocode
 program Ausgabe5

 {

 String ein, aus
 int start 0, end 0, light1 0, light2 0, light3 0, light4 0, light5 0, light6 0, light7 0, light8 0, light9 0, light10 0
 Scanner sc

    Ausgabe text für licht 1 bis 10 und 11 exit
    Eingabe start sc
    DO
       SWITCH(start)
          case 1 bis 10
             IF lightX 0
                lightX = 1
                Ausgabe lichtX ein
                Eingabe start sc
             else
                lightX = 0
                Ausgabe lichtX aus
                Eingabe start sc
             ENDIF
          default
             Ausgabe error
             Eingabe start sc
          case 11
             end = 1
             Ausgabe text für licht 1 bis 10
       ENDSWITCH
    WHILE(end = 0)

}

 */

public class Ausgabe5 {
    static void main(String[] args) {

        String ein = "ein", aus = "aus";
        int start = 0;
        int end = 0;
        int light1 = 0, light2 = 0, light3 = 0, light4 = 0, light5 = 0, light6 = 0, light7 = 0, light8 = 0, light9 = 0, light10 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("1 kontroliert licht 1");
        System.out.println("2 kontroliert licht 2");
        System.out.println("3 kontroliert licht 3");
        System.out.println("4 kontroliert licht 4");
        System.out.println("5 kontroliert licht 5");
        System.out.println("6 kontroliert licht 6");
        System.out.println("7 kontroliert licht 7");
        System.out.println("8 kontroliert licht 8");
        System.out.println("9 kontroliert licht 9");
        System.out.println("10 kontroliert licht 10");
        System.out.println("11 ist exit");
        System.out.println("WÄndern Sie die Anzahl der Lichter nach Belieben.");
        start = sc.nextInt();

        do {
            switch (start) {
                case 1: {
                    if (light1 == 0) {
                        light1 = 1;
                        System.out.println("light 1 ist ein");
                        start = sc.nextInt();
                    } else {
                        light1 = 0;
                        System.out.println("light 1 ist aus");
                        start = sc.nextInt();
                    }
                    break;
                }
                case 2: {
                    if (light2 == 0) {
                        light2 = 1;
                        System.out.println("light 2 ist ein");
                        start = sc.nextInt();
                    } else {
                        light2 = 0;
                        System.out.println("light 2 ist aus");
                        start = sc.nextInt();
                    }
                    break;
                }
                case 3: {
                    if (light3 == 0) {
                        light3 = 1;
                        System.out.println("light 3 ist ein");
                        start = sc.nextInt();
                    } else {
                        light3 = 0;
                        System.out.println("light 3 ist aus");
                        start = sc.nextInt();
                    }
                    break;
                }
                case 4: {
                    if (light4 == 0) {
                        light4 = 1;
                        System.out.println("light 4 ist ein");
                        start = sc.nextInt();
                    } else {
                        light4 = 0;
                        System.out.println("light 4 ist aus");
                        start = sc.nextInt();
                    }
                    break;
                }
                case 5: {
                    if (light5 == 0) {
                        light5 = 1;
                        System.out.println("light 5 ist ein");
                        start = sc.nextInt();
                    } else {
                        light5 = 0;
                        System.out.println("light 5 ist aus");
                        start = sc.nextInt();
                    }
                    break;
                }
                case 6: {
                    if (light6 == 0) {
                        light6 = 1;
                        System.out.println("light 6 ist ein");
                        start = sc.nextInt();
                    } else {
                        light6 = 0;
                        System.out.println("light 6 ist aus");
                        start = sc.nextInt();
                    }
                    break;
                }
                case 7: {
                    if (light7 == 0) {
                        light7 = 1;
                        System.out.println("light 7 ist ein");
                        start = sc.nextInt();
                    } else {
                        light7 = 0;
                        System.out.println("light 7 ist aus");
                        start = sc.nextInt();
                    }
                    break;
                }
                case 8: {
                    if (light8 == 0) {
                        light8 = 1;
                        System.out.println("light 8 ist ein");
                        start = sc.nextInt();
                    } else {
                        light8 = 0;
                        System.out.println("light 8 ist aus");
                        start = sc.nextInt();
                    }
                    break;
                }
                case 9: {
                    if (light9 == 0) {
                        light9 = 1;
                        System.out.println("light 9 ist ein");
                        start = sc.nextInt();
                    } else {
                        light9 = 0;
                        System.out.println("light 9 ist aus");
                        start = sc.nextInt();
                    }
                    break;
                }
                case 10: {
                    if (light10 == 0) {
                        light10 = 1;
                        System.out.println("light 10 ist ein");
                        start = sc.nextInt();
                    } else {
                        light10 = 0;
                        System.out.println("light 10 ist aus");
                        start = sc.nextInt();
                    }
                    break;
                }
                case 11: {
                    end = 1;
                    System.out.println("Exit");
                    System.out.printf("licht 1 ist %s\n", light1 == 1 ? ein : aus);
                    System.out.printf("licht 2 ist %s\n", light2 == 1 ? ein : aus);
                    System.out.printf("licht 3 ist %s\n", light3 == 1 ? ein : aus);
                    System.out.printf("licht 4 ist %s\n", light4 == 1 ? ein : aus);
                    System.out.printf("licht 5 ist %s\n", light5 == 1 ? ein : aus);
                    System.out.printf("licht 6 ist %s\n", light6 == 1 ? ein : aus);
                    System.out.printf("licht 7 ist %s\n", light7 == 1 ? ein : aus);
                    System.out.printf("licht 8 ist %s\n", light8 == 1 ? ein : aus);
                    System.out.printf("licht 9 ist %s\n", light9 == 1 ? ein : aus);
                    System.out.printf("licht 10 ist %s\n", light10 == 1 ? ein : aus);
                    break;
                }
                default:
                    System.out.println("Wahl 1-10 für lichten und 11 für exit");
                    start = sc.nextInt();
                    break;
            }
        } while (end == 0);
    }
}
