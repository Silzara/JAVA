package Tier;

public class Main {

    public static void main(String[] args) {
        Tier tier1 = new Tier("Jack", "Alpaka");

        tier1.gehorchen();

        tier1.tierart = "Blauwall";

        System.out.println(tier1.getName() + " ist nun ein " + tier1.getTierart());

    }
}
