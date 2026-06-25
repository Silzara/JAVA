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

 */

public class Main {
    public static void main(String[] args) {

        Lotto lotto = new Lotto();

        int[] winningLotto = lotto.neueticket();
        System.out.println(Arrays.toString(winningLotto));
        int[] tryLotto = new int[6];
        long tries = 0, found;

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
