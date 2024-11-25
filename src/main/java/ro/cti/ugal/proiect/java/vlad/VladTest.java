package ro.cti.ugal.proiect.java.vlad;

import java.util.ArrayList;
import ro.cti.ugal.proiect.java.SursaIluminat;

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
            
            BecEconomic bec_economic = new BecEconomic(4, 1, 2.5, "Electronic", false, 1800, 4000, (short)26, 0.8f);
            System.out.println(bec_economic);
            
            BecEconomic copie_economic = new BecEconomic(bec_economic);
            System.out.println(copie_economic);
            
            ArrayList<SursaIluminat> lista_surse_iluminat = new ArrayList<>();
            for(int i = 0; i < 10; i++) {
                lista_surse_iluminat.add(new BecClasic(tungsten, 
                        5.6e-8 + (1e-10 * i), 
                        0.0045 + (1e-5 * i), 
                        2700 + (100 * i), 
                        15
                ));
                
                lista_surse_iluminat.add(new BecEconomic(4, 
                        1, 
                        2.5, 
                        (i % 2 == 0) ? "Electronic" : "Magnetic", 
                        (i % 2 == 0), 
                        1800 + (i * 100), 
                        4000 + (i * 100), 
                        (short)(26 + i), 
                        0.8f
                ));
            }
            
            for(SursaIluminat i : lista_surse_iluminat) {
                System.out.println(i);
            }
    }
}
