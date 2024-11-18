package ro.cti.ugal.proiect.java.vlad;

import ro.cti.ugal.proiect.java.SursaIluminat;

public class BecClasic extends SursaIluminat{
    private Material materialFilament;
    private double lungimeFilament;
    private double diametruFilament;
    
    public BecClasic() {
        materialFilament = null;
        lungimeFilament = 0.0;
        diametruFilament = 0.0;
    }
    
    public BecClasic(Material materialFilament, double lungimeFilament, double diametruFilament, double temperaturaOperationala, double eficientaLuminoasa) {
        this.materialFilament = materialFilament;
        this.lungimeFilament = lungimeFilament;
        this.diametruFilament = diametruFilament;
        
        double rezistentaFilament = materialFilament.getRezistenta(lungimeFilament, diametruFilament, temperaturaOperationala);
        double putereConsumata = Math.pow(120, 2) / rezistentaFilament;     // Cat consuma filamentul in watt. 120VAC @ 60Hz
        double luminozitate = eficientaLuminoasa * putereConsumata;         // Cati lumeni sunt produsi.
    }
}
