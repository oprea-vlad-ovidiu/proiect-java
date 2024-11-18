package ro.cti.ugal.proiect.java.vlad;

public class VladTest {
    public static void main(String[] args) {
            BecClasic bec_gol = new BecClasic();
            System.out.println(bec_gol);
            
            Material tungsten = new Material("Tungsten", 5.6e-8, 0.0045);
            BecClasic bec = new BecClasic(tungsten, 0.58, 4.6e-5, 2700, 15);
            System.out.println(bec);
               
            BecClasic copie = new BecClasic(bec);
            System.out.println(copie);
    }
}
