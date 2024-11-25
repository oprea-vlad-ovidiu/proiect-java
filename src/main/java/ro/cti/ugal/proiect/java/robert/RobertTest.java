package ro.cti.ugal.proiect.java.robert;

public class RobertTest {
    public static void main(String[] args) {
        BecLed b = new BecLed(2.5f, 10, 5, 6, 5, 6, (short)7, 8.2f);
        System.out.println(b);
        Neon n = new Neon(10, 12, (short)1, 4.5f, 5.5f, "Mercury", 8, 30, "Glass", false);
        System.out.println(n);
        BecLed[] led = new BecLed[10];
        Neon[] neon = new Neon[10];
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
        neon[0] = new Neon(8, 15, (short) 2, 3.8f, 4.0f, "Argon", 10, 25, "Plastic", true);
        neon[1] = new Neon(12, 10, (short) 3, 5.0f, 6.2f, "Krypton", 9, 28, "Glass", false);
        neon[2] = new Neon(9, 14, (short) 1, 4.2f, 4.8f, "Xenon", 11, 22, "Metal", true);
        neon[3] = new Neon(10, 13, (short) 4, 3.5f, 5.0f, "Neon", 12, 20, "Ceramic", false);
        neon[4] = new Neon(11, 11, (short) 2, 4.8f, 5.7f, "Hydrogen", 13, 18, "Glass", true);
        neon[5] = new Neon(13, 16, (short) 1, 3.9f, 4.3f, "Oxygen", 8, 30, "Plastic", false);
        neon[6] = new Neon(7, 12, (short) 3, 4.5f, 6.0f, "Nitrogen", 14, 26, "Glass", true);
        neon[7] = new Neon(14, 17, (short) 4, 5.1f, 6.4f, "Helium", 10, 24, "Metal", false);
        neon[8] = new Neon(9, 13, (short) 2, 3.7f, 4.9f, "Argon", 12, 27, "Ceramic", true);
        neon[9] = new Neon(10, 12, (short) 1, 4.6f, 5.8f, "Mercury", 11, 29, "Glass", false);
        
    }
}
