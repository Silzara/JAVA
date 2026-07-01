package Aufgaben;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

    static char [] arrayX = {'*','*','*','*','*','*','*'};

    // showHangman()*********************************************************************************
    public static char[] showHangman(char [] array, char zahl){
        for(int j = 0; j < arrayX.length; j++){
            if(zahl == array[j]){
                arrayX[j] = array[j];
            }
        }
        return arrayX;
    }//end showHangman()

    //start druckeHangmanBlock()*********************************************************************
    public static void druckeHangmanBlock() {
        String[] h = {
                        "███ ███",
                        "███ ███",
                        "███ ███",
                        "███████",
                        "███ ███",
                        "███ ███",
                        "███ ███"};
        String[] a = {
                        "  ███  ",
                        " ██ ██ ",
                        "██   ██",
                        "███████",
                        "██   ██",
                        "██   ██",
                        "██   ██"};
        String[] n = {
                        "██   ██",
                        "███  ██",
                        "████ ██",
                        "██ ████",
                        "██  ███",
                        "██   ██",
                        "██   ██"};
        String[] g = {
                        " █████ ",
                        "██     ",
                        "██     ",
                        "██  ███",
                        "██   ██",
                        "██   ██",
                        " █████ "};
        String[] m = {
                        "██   ██",
                        "███ ███",
                        "███████",
                        "██ █ ██",
                        "██   ██",
                        "██   ██",
                        "██   ██"};


        // Wort HANGMAN zusammenbauen: H A N G M A N
        for (int zeile = 0; zeile < 7; zeile++)
        {
            String zeileText = "\u001B[32m" + h[zeile] + " " + a[zeile] + " " + n[zeile] + " "
                    + g[zeile] + " " + m[zeile] + " " + a[zeile] + " " + n[zeile] + "\u001B[0m";
            System.out.println(zeileText);
        }
    }//end druckeHangmanBlock()

    //start maennschenZeichnen()*********************************************************************
    public static void maennchenZeichnen(String hangme[], int fehler) {
        int zeilen = 8;
        //System.out.print("\u001B[31m" + " " + zahlen[j] + "\u001B[0m");

        System.out.println("\u001B[32m" + "      ┌────────┐" + "\u001B[0m");

        for(int index = 0; index < fehler; index++)
        {
            System.out.println(hangme[index]);
        }

        for(int i = 0; i < zeilen - fehler; i++)
        {
            System.out.println("\u001B[32m" + "      │      " + "\u001B[0m");
        }
        System.out.println("\u001B[32m" + "──────┴──────" + "\u001B[0m");
    }//end maennschenZeichnen()

    //start stringToCharArray()**********************************************************************
     public static char [] stringToCharArray(String wort){
         int bla = 0;
         int size = wort.length();
         char [] array = new char[size];
         for(int i = 0; i < size; i++){
             char temp;
             temp = wort.charAt(bla);
             array[i] = wort.charAt(bla);
             bla++;
         }
        return array;
    }//end stringToCharArray()

    //start checkDuplicate()*************************************************************************
    public static boolean checkDuplicate(char input){
        for (int i = 0; i < arrayX.length; i++) {
            if (input == arrayX[i]) {
                System.out.println(input + " " + arrayX[i]);
            }
        }
        return false;
    }//end checkDuplicate()

    //start main()
    static void main(String[] args) {

        //array tiere 7 Buchstaben length 25
        String[] tiereMitSiebenBuchstaben = {"giraffe", "leopard", "pinguin", "seelöwe", "hamster", "känguru", "walross",
                "rebhuhn", "kranich", "kolibri", "muschel", "koralle", "makrele", "sardine", "gazelle", "schakal",
                "pelikan", "seehund", "seeigel", "rentier", "libelle", "piranha", "seehase", "gorilla", "nashorn"};

        //array 8 fehler positionen
        String[] hangme = {
                "\u001B[32m" + "      │        │" + "\u001B[0m",
                "\u001B[32m" + "      │        │" + "\u001B[0m",
                "\u001B[32m" + "      │       " + "\u001B[37m" + "███" + "\u001B[0m",
                "\u001B[32m" + "      │        │" + "\u001B[0m",
                "\u001B[32m" + "      │      " + "\u001B[35m" + "└─┼─┘" + "\u001B[0m",
                "\u001B[32m" + "      │        │" + "\u001B[0m",
                "\u001B[32m" + "      │      " + "\u001B[36m" + "┌─┴─┐" + "\u001B[0m",
                "\u001B[32m" + "      │      " + "\u001B[36m" + "│   │" + "\u001B[0m"};

        //Zufall wort von tiere array generieren
        Random rand = new Random();
        String secretwort = tiereMitSiebenBuchstaben[rand.nextInt(0, 25)];

        //Zufall wort im char array [7] speichern
        char[] zufallwort = stringToCharArray(secretwort);
        System.out.println(stringToCharArray(Arrays.toString(zufallwort))); // über HANGMAN text

        //end
        druckeHangmanBlock(); //HANGMAN text
        maennchenZeichnen(hangme, 0); // int 0 start (3 ist kopf)--> 8 max
        //

    }//end main()
}
