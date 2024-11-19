package ro.cti.ugal.proiect.java.vlad;

import ro.cti.ugal.proiect.java.InterfataIluminat;
import ro.cti.ugal.proiect.java.SursaIluminat;

public class BecEconomic extends SursaIluminat implements InterfataIluminat{
    public double continutMercur;   // Toate becurile CFL contin mercur.
    public double continutArgon;    // Toate becurile CFL contin argon.
    public double durataIncalzire;  // Pasul 1 din pronirea unui bec este incalzirea catodului si anodului.
    public String tipBalast;        // Magnetic(mai vechi) sau electric.
    public boolean reglabil;        // Daca becul permite luminozitate reglabila.
    
    public BecEconomic() {
        super();
        this.continutMercur = 0;
        this.continutArgon = 0;
        this.durataIncalzire = 0;
        this.tipBalast = "n\\a";
        this.reglabil = false;
    }
    
    public BecEconomic(double continutMercur, double continutArgon, double durataIncalzire, 
            String tipBalast, boolean reglabil, int luminozitate, int temperaturaCuloare, short consum, 
            float indiceRedareCuloare) {
        super(luminozitate, temperaturaCuloare, consum, indiceRedareCuloare);
        
        this.continutMercur = continutMercur;
        this.continutArgon = continutArgon;
        this.durataIncalzire = durataIncalzire;
        this.tipBalast = tipBalast;
        this.reglabil = reglabil;
    }
    
    public BecEconomic(BecEconomic o) {
        super(o);
        
        this.continutMercur = o.continutMercur;
        this.continutArgon = o.continutArgon;
        this.durataIncalzire = o.durataIncalzire;
        this.tipBalast = o.tipBalast;
        this.reglabil = o.reglabil;
    }
    
    @Override
    public String toString() {
        return super.toString() + 
                "Continu Mercur: " + continutMercur + "mg\n" +
                "Continut Argon: " + continutArgon + "mg\n" +
                "Durata incalzire: " + durataIncalzire + "s\n" +
                "Tip balast: " + tipBalast + "\n" +
                "Reglabil: " + (reglabil ? "Da" : "Nu") + "\n";
    }

    @Override
    public boolean Porneste() {
        System.out.println("Becul Economic a fost pornit!");
        return true;
    }

    @Override
    public int GetConsum() {
        return this.consum;
    }
}
