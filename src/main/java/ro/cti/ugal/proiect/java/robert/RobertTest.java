package ro.cti.ugal.proiect.java.robert;

public class RobertTest {
    public static void main(String[] args) {
        BecLed b = new BecLed(2.5f, 10, 5, 6);
        System.out.println(b);
        Neon n = new Neon(10.5f, "Argon & Mercury", 8, 30, "lead glass", true);
        System.out.println(n);
    }
}
