package Tier;

public class Main {

    public static void main(String[] args) {

        Katze katze1 = new Katze("Mauzi");
        Hund hund1 = new Hund("Rex");
        Piranha piranha1 = new Piranha("Hans");


        katze1.gehorchen();
        katze1.striecheln();

        hund1.gehorchen();
        hund1.striecheln();

        piranha1.gehorchen();
        piranha1.striecheln();


//        tier1.tierart = "Blauwall";
//        System.out.println(tier1.getName() + " ist nun ein " + tier1.getTierart());


    }
}
