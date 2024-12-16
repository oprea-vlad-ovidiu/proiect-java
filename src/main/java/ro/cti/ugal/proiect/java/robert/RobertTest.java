package ro.cti.ugal.proiect.java.robert;

import ro.cti.ugal.proiect.java.SursaIluminat;

public class RobertTest {

    public static void main(String[] args) {
        BecLed b = new BecLed(2.5f, 10, 5, 6, 5, 6, (short)7, 8.2f);
        System.out.println(b);
        Neon n = new Neon(10, 12, (short)1, 4.5f, 5.5f, "Mercury", 8, 30, "Glass", false);
        System.out.println(n);
        BecLed[] led = new BecLed[10];
        Neon[] neon = new Neon[10];
        SursaIluminat[] sursa = new SursaIluminat[10];
        //creearea instantelor din vectorul led
        led[0] = new BecLed(5.8f, 9, 3, 7, 1, 5, (short)8, 1.2f);
        led[1] = new BecLed(6.1f, 8, 4, 6, 2, 4, (short) 7, 1.5f);
        led[2] = new BecLed(4.5f, 7, 2, 8, 3, 3, (short) 6, 1.8f);
        led[3] = new BecLed(5.0f, 10, 5, 5, 1, 6, (short) 9, 1.3f);
        led[4] = new BecLed(6.7f, 11, 3, 9, 2, 7, (short) 10, 1.6f);
        led[5] = new BecLed(4.8f, 12, 4, 7, 3, 8, (short) 5, 1.4f);
        led[6] = new BecLed(5.3f, 9, 2, 6, 1, 5, (short) 4, 1.7f);
        led[7] = new BecLed(6.0f, 10, 5, 8, 2, 6, (short) 8, 1.2f);
        led[8] = new BecLed(5.9f, 8, 3, 7, 3, 4, (short) 7, 1.5f);
        led[9] = new BecLed(5.2f, 11, 4, 6, 2, 7, (short) 9, 1.9f);
        //creearea instantelor din vectorul neon
        neon[0] = new Neon(8, 15, (short) 2, 3.8f, 60.0f, "Argon", 10, 25, "Plastic", true);
        neon[1] = new Neon(12, 10, (short) 3, 5.0f, 6.2f, "Krypton", 9, 28, "Glass", false);
        neon[2] = new Neon(9, 14, (short) 1, 4.2f, 400.8f, "Xenon", 11, 22, "Metal", true);
        neon[3] = new Neon(10, 13, (short) 4, 3.5f, 5.0f, "Neon", 12, 20, "Ceramic", false);
        neon[4] = new Neon(neon[1]);
        neon[5] = new Neon(13, 16, (short) 1, 3.9f, 260.3f, "Oxygen", 8, 30, "Plastic", false);
        neon[6] = new Neon();
        neon[7] = new Neon(14, 17, (short) 4, 5.1f, 6.4f, "Helium", 10, 24, "Metal", false);
        neon[8] = new Neon(9, 13, (short) 2, 3.7f, 4.9f, "Argon", 12, 27, "Ceramic", true);
        neon[9] = new Neon(10, 12, (short) 1, 4.6f, 300.8f, "Mercury", 11, 29, "Glass", false);
        //crearea instantelor din vectorul sursa
        sursa[0] = new SursaIluminat();
        sursa[1] = new SursaIluminat(1000, 3000, (short)12, 85.0f);
        sursa[2] = new SursaIluminat(1200, 4000, (short)15, 92.0f);
        sursa[3] = new SursaIluminat(600, 3500, (short)8, 80.0f);
        sursa[4] = new SursaIluminat(900, 5000, (short)10, 95.0f);
        sursa[5] = new SursaIluminat(700, 6500, (short)7, 70.0f);
        sursa[6] = new SursaIluminat(1100, 2700, (short)14, 88.0f);
        sursa[7] = new SursaIluminat(750, 3200, (short)9, 82.0f);
        sursa[8] = new SursaIluminat(950, 2800, (short)11, 87.0f);
        sursa[9] = new SursaIluminat(1250, 4500, (short)16, 90.5f);
        System.out.println("");
        
        
        
        displayNeon(neon); //apelare metoda pentru iterarea si afisarea vectorului neon
        displayBecLed(led); //apelare metoda pentru iterarea si afisarea vectorului led
        //PrintNonOxygenNeon(neon); 
        //EficientaEnergetica(led);
        
       
    }
    
    public RobertTest() {
    BecLed[] led = new BecLed[10];
    Neon[] neon = new Neon[10];

    // Populare array-uri cu valori implicite
    led[0] = new BecLed(5.8f, 9, 3, 7, 1, 5, (short) 8, 1.2f);
    led[1] = new BecLed(6.1f, 8, 4, 6, 2, 4, (short) 7, 1.5f);
    led[2] = new BecLed(4.5f, 7, 2, 8, 3, 3, (short) 6, 1.8f);
    led[3] = new BecLed(5.0f, 10, 5, 5, 1, 6, (short) 9, 1.3f);
    led[4] = new BecLed(6.7f, 11, 3, 9, 2, 7, (short) 10, 1.6f);
    led[5] = new BecLed(4.8f, 12, 4, 7, 3, 8, (short) 5, 1.4f);
    led[6] = new BecLed(5.3f, 9, 2, 6, 1, 5, (short) 4, 1.7f);
    led[7] = new BecLed(6.0f, 10, 5, 8, 2, 6, (short) 8, 1.2f);
    led[8] = new BecLed(5.9f, 8, 3, 7, 3, 4, (short) 7, 1.5f);
    led[9] = new BecLed(5.2f, 11, 4, 6, 2, 7, (short) 9, 1.9f);

    neon[0] = new Neon(8, 15, (short) 2, 3.8f, 60.0f, "Argon", 10, 25, "Plastic", true);
    neon[1] = new Neon(12, 10, (short) 3, 5.0f, 6.2f, "Krypton", 9, 28, "Glass", false);
    neon[2] = new Neon(9, 14, (short) 1, 4.2f, 400.8f, "Xenon", 11, 22, "Metal", true);
    neon[3] = new Neon(10, 13, (short) 4, 3.5f, 5.0f, "Neon", 12, 20, "Ceramic", false);
    neon[4] = new Neon(neon[1]);
    neon[5] = new Neon(13, 16, (short) 1, 3.9f, 260.3f, "Oxygen", 8, 30, "Plastic", false);
    neon[6] = new Neon();
    neon[7] = new Neon(14, 17, (short) 4, 5.1f, 6.4f, "Helium", 10, 24, "Metal", false);
    neon[8] = new Neon(9, 13, (short) 2, 3.7f, 4.9f, "Argon", 12, 27, "Ceramic", true);
    neon[9] = new Neon(10, 12, (short) 1, 4.6f, 300.8f, "Mercury", 11, 29, "Glass", false);
}

    
    public RobertTest(BecLed[] customLed, Neon[] customNeon) {
    BecLed[] led = customLed;
    Neon[] neon = customNeon;
}

    
    
    public static void displayNeon(Neon[] neon){ //metoda pentru iterarea si afisarea vectorului neon
        
        
        for(int i=0;i<10;i++)
        {
            System.out.println("Array neon "+ (i+1));
            System.out.println(neon[i]);
        }
        
    }
    
    public static void displayBecLed(BecLed[] led){ //metoda pentru iterarea vectorului led
        
        
        for(int i=0;i<10;i++)
        {
            System.out.println("Array led "+ (i+1));
            System.out.println(led[i]);
        }
        
    }
    public static void PrintNonOxygenNeon(Neon[] neon)
    {
        System.out.println("Filtrare neon dupa gas voltage si gas type:");
        for(int v = 0; v<10;v++)
        {
            if(neon[v].getGasVoltage()>250 || "Oxygen".contains(neon[v].getGasType()))
            {
                System.out.println(neon[v]);
            }
        }
    }
    public static void EficientaEnergetica(BecLed[] led)
    {
        System.out.println("Filtrare bec cu led dupa energy efficiency si life duration:");
        for (int k=0; k<10;k++)
        {
            if(led[k].getLifeDuration() > 5 && led[k].getEnergyEfficiency() > 220)
            {
                System.out.println(led[k]);
            }
        }
    }
}
