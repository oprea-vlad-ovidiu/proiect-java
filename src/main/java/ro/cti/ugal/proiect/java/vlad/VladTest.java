package ro.cti.ugal.proiect.java.vlad;

public class VladTest {
    public static void main(String[] args) {
            BecClasic bec_clasic_gol = new BecClasic();
            System.out.println(bec_clasic_gol);
            
            Material tungsten = new Material("Tungsten", 5.6e-8, 0.0045);
            BecClasic bec_clasic = new BecClasic(tungsten, 0.58, 4.6e-5, 2700, 15);
            System.out.println(bec_clasic.toString(1));
               
            BecClasic copie_clasic = new BecClasic(bec_clasic);
            System.out.println(copie_clasic);
            
            BecEconomic bec_economic_gol = new BecEconomic();
            System.out.println(bec_economic_gol);
            
            BecEconomic bec_economic = new BecEconomic(4, 1, 2.5, "Electronic", false, 1800, 4000, 26, 0.8);
            System.out.println(bec_economic);
            
            BecEconomic copie_economic = new BecEconomic(bec_economic);
            System.out.println(copie_economic);
    }
}
