package While;

import java.util.Scanner;

/*   Schreibtischtest_07_01
FRAGE:
Welche Ausgabe erscheint, wenn der User für x ...

a) 3
b) 4
c) 5
d) 12

... eingibt?
Programm ST_07_01

{
	Eingabe: x
	IF(x % 3 == 0){
		Ausgabe: 'A'
	}ELSE{
		Ausgabe: 'B'
	}IF(x Modulo 4 == 0){
		Ausgabe: 'X'
	}ELSE{
		Ausgabe: 'Y'
	}
}
 */

/**
 *
 a) A Y
 b) B X
 c) B Y
 d) A X

 */

public class Aufgabe1 {
    public static void main(String[] args) {

        int x;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        x = sc.nextInt();

        if (x % 3 == 0) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
        if (x % 4 == 0) {
            System.out.println("X");
        } else {
            System.out.println("Y");
        }
    }
}