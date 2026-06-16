package While;

import java.util.Random;

public class AufgabeLotto {
        public static void main(String[] args)
        {
            //Lotto spielen
            //1. Aufgabe - 6 Lottozahlen ziehen
            Random zufallsZahl = new Random();

            //wir "nehmen" ein Array
            int[] lottoZahlen = new int[6];
            int gezogeneZahl;

            //wir erkennen ein Problem - Zahlen wurden doppelt gezogen
            for(int i = 0; i < 6; i++)
            {
                //wenn es die erste Zahl ist - kein Vergleich notwendig
                //das "Muster" ist doch - bei jeder Zahl die gezogen wird
                //müssen wir eine Zahl MEHR vergleichen
                gezogeneZahl = zufallsZahl.nextInt(1,49+1);
                lottoZahlen[i] = gezogeneZahl;
                System.out.println("Ziehungsversuch ist: " + gezogeneZahl);
                for(int j = 0; j < i ; j++)
                {
                    if(lottoZahlen[j] == gezogeneZahl)
                    {
                        //dann haben wir die Zahl schon mal gezogen
                        System.out.println("Die Zahl wurde schon mal gezogen");
                        //dann verwerfen diese Zahl - wir brauchen noch eine
                        i--;
                    }
                    else
                    {
                        //die Zahl ist ungleich
                        System.out.println("Diese Zahlen sind nicht gleich");
                    }
                }
            }

            for(int i = 0; i < 6; i++)
            {
                System.out.println(lottoZahlen[i]);
            }
        }
}
