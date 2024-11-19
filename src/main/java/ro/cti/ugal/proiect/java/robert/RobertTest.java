package ro.cti.ugal.proiect.java.robert;

public class RobertTest {
    public static void main(String[] args) {
        BecLed b = new BecLed(2.5f, 10, 5, 6, 5, 6, (short)7, 8.2f);
        System.out.println(b);
        Neon n = new Neon(10, 12, (short)1, 4.5f, 5.5f, "Mercury", 8, 30, "Glass", false);
        System.out.println(n);
    }
}
