package ro.cti.ugal.proiect.java.vlad;

import ro.cti.ugal.proiect.java.SursaIluminat;

public class BecClasic extends SursaIluminat{
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
        this.indiceRedareCuloare = 0.9;
        this.consum = (int)putereConsumata;
    }
    
    public BecClasic(BecClasic o) {
        super(o);
        this.materialFilament = o.materialFilament;
        this.lungimeFilament = o.lungimeFilament;
        this.diametruFilament = o.diametruFilament;
    }
    
    @Override
    public String toString() {
        return super.toString() + 
                "Filament: \n" +
                (materialFilament != null ? "\tMaterial: " + this.materialFilament.nume + "\n" : "\tMaterial: n\\a\n") +
                "\tLungime: " + this.lungimeFilament + "m\n" +
                "\tDiametru: " + this.diametruFilament + "m\n";
    }
}
