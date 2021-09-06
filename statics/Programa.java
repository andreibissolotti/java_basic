package statics;

public class Programa {
    
    public static void main(String[] args) {
        final Cachorro pitbull = new Cachorro();
        pitbull.zoologia = "Bípede";

        final Cachorro viraLata = new Cachorro();

        System.out.println(pitbull.zoologia);
        System.out.println(viraLata.zoologia);


        Cachorro.late();
    }
}
