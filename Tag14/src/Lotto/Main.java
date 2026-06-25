package Lotto;

/*   Lohnt sich Lottospielen?
Erstellen Sie bitte ein Programm das dies beantwortet.
(6 aus 49) ist gemeint
Brainstorming:
    Welche Elemente, Dinge die wir "coden" müssen, erkennen Sie?
    - Idee - was kostet einmal Lottospielen?
    - wie oft müssen wir spielen um zu gewinnen
    - wir geben einen Tipp ab - der Computer zieht 6 Zahlen
    - wie hoch sind denn die Gewinne so für 2 oder 3 richtige?

Bitte Pseudocode und lauffähiges JAVA Programm erstellen.
 */

import java.util.Arrays;

/**   Pseudocode
 program LottoZahlen

 {
      Lotto()
         neueteticket()
              int[] = rand(0 bis 6) unique zahlen
      Main()
          Lotto lotto = new Lotto()
          int winningLotto = lotto.neueteticket()
          int[] tryLotto
          long tries 0, found;

              do
                   found 0
                   tryLotto = lotto.neueticket()
                   tries++
                         for i < 6
                             for j < 6
                                  IF tryLotto[i] == winninglotto[j]
                                      found++
                                      break
                                  ENDIF
                             ENDFOR
                         ENDFOR
              while(found nicht 6)
          Ausgabe text winningLotto +tries
 }


 Gewinnklasse	Anzahl Richtige	Gewinne	Quoten
 1	6 Richtige + SZ	0 ×	unbesetzt
 2	6 Richtige	   2 ×	2.234.452,70 €
 3	5 Richtige + SZ	43 ×	13.938,30 €
 4	5 Richtige	348 ×	5.133,60 €
 5	4 Richtige + SZ	2.053 ×	241,40 €
 6	4 Richtige	19.267 ×	61,00 €
 7	3 Richtige + SZ	41.153 ×	24,30 €
 8	3 Richtige	374.198 ×	12,60 €
 9	2 Richtige + SZ	314.351 ×	6,00 €

 */

public class Main {
    public static void main(String[] args) {

        Lotto lotto = new Lotto();

        int[] winningLotto = lotto.neueticket();
        System.out.println(Arrays.toString(winningLotto));
        int[] tryLotto = new int[6];
        long tries = 0, found;

        double tipp = 1.70;
        int gewin = 500000000;
        System.out.println(gewin);

        do {
            found =0;
            tryLotto = lotto.neueticket();
            tries++;
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (tryLotto[i] == winningLotto[j]) {
                        found++;
                        break;
                    }
                }
            }
        } while (found != 6) ;
        System.out.println("Winning Lotto: " + Arrays.toString(winningLotto) + " found after " + tries+" tries");
    }
}
