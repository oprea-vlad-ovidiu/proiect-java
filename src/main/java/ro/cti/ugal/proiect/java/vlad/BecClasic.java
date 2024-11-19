package ro.cti.ugal.proiect.java.vlad;

import ro.cti.ugal.proiect.java.InterfataIluminat;
import ro.cti.ugal.proiect.java.SursaIluminat;

public class BecClasic extends SursaIluminat implements InterfataIluminat {
    public Material materialFilament;
    public double lungimeFilament;
    public double diametruFilament;
    
    public BecClasic() {
        super();
        materialFilament = null;
        lungimeFilament = 0.0;
        diametruFilament = 0.0;
    }
    
    public BecClasic(Material materialFilament, double lungimeFilament, double diametruFilament, double temperaturaOperationala, double eficientaLuminoasa) {
        super();
        this.materialFilament = materialFilament;
        this.lungimeFilament = lungimeFilament;
        this.diametruFilament = diametruFilament;
        
        double rezistentaFilament = materialFilament.getRezistenta(lungimeFilament, diametruFilament, temperaturaOperationala);
        double putereConsumata = Math.pow(120, 2) / rezistentaFilament;     // Cat consuma filamentul in watt. 120VAC @ 60Hz
        
        this.luminozitate = (int)(eficientaLuminoasa * putereConsumata);
        this.temperaturaCuloare = (int)temperaturaOperationala;
        this.indiceRedareCuloare = 0.9f;
        this.consum = (short)(int)putereConsumata;
    }
    
    public BecClasic(BecClasic o) {
        super(o);
        this.materialFilament = o.materialFilament;
        this.lungimeFilament = o.lungimeFilament;
        this.diametruFilament = o.diametruFilament;
    }
    
    public String toString(int tabLevel) {
        return toString().replace("\n", "\n" + "\t".repeat(tabLevel));
    }
    
    @Override
    public String toString() {
        return super.toString() + 
                "Filament: \n" +
                (materialFilament != null ? "\tMaterial: " + this.materialFilament.nume + "\n" : "\tMaterial: n\\a\n") +
                "\tLungime: " + this.lungimeFilament + "m\n" +
                "\tDiametru: " + this.diametruFilament + "m\n";
    }

    @Override
    public boolean Porneste() {
        System.out.println("Becul clasic a fost pornit!");
        return true;
    }

    @Override
    public int GetConsum() {
        return this.consum;
    }
}
