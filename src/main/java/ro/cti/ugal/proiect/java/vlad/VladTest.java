package ro.cti.ugal.proiect.java.vlad;

public class VladTest {
    public static void main(String[] args) {
            Material tungsten = new Material(5.6e-8, 0.0045);
            BecClasic bec = new BecClasic(tungsten, 0.58, 0.0023, 15000, 15);
            System.out.println(bec.lightTemperature);
    }
}
