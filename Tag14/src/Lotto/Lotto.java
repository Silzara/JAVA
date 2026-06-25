package Lotto;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

    //Konstruktor
    public Lotto(){

    }

    /**
     * Start neueticket()
     * @return int[] array mit 6 unique zufall zahlen zwischen 1 und 49
     */
    public int [] neueticket(){

        //Variable
        Random rand = new Random();
        int lottoticketsize = 0;
        int randomlottozahl;
        int[] duplicatezahlen = new int[49];
        int [] lottoticket = new int[6];

        do{
            randomlottozahl = rand.nextInt(1,50);
            if(duplicatezahlen[randomlottozahl-1]==0) {
                lottoticket[lottoticketsize] = randomlottozahl;
                duplicatezahlen[randomlottozahl - 1] = 1;
                lottoticketsize++;
            }
        }while(lottoticketsize < 6);
        //System.out.println(Arrays.toString(lottoticket));
        return lottoticket;
    }
}
