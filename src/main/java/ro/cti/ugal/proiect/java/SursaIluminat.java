package ro.cti.ugal.proiect.java;

public class SursaIluminat {
    public int luminozitate;            // In lumens
    public int temperaturaCuloare;      // In Kelvin, culoarea luminii emisa de bec.
    public short consum;                  // In watts
    public float indiceRedareCuloare;  // Procent - [0.0, 1.0]
    
    public SursaIluminat() {
        this.luminozitate = 0;
        this.temperaturaCuloare = 0;
        this.consum = 0;
        this.indiceRedareCuloare = 0.0f;
    }
    
    public SursaIluminat(int luminozitate, int temperaturaCuloare, short consum, float indiceRedareCuloare) {
        this.luminozitate = luminozitate;
        this.temperaturaCuloare = temperaturaCuloare;
        this.consum = consum;
        this.indiceRedareCuloare = Math.clamp(indiceRedareCuloare, 0.0f, 1.0f);
    }
    
    public SursaIluminat(SursaIluminat o) {
        this.luminozitate = o.luminozitate;
        this.temperaturaCuloare = o.temperaturaCuloare;
        this.consum = o.consum;
        this.indiceRedareCuloare = o.indiceRedareCuloare;
    }
    
    @Override
    public String toString() {
        return  "Luminozitate: " + this.luminozitate + " lm\n" +
                "Temperatura culoare: " + this.temperaturaCuloare + "K\n" +
                "Consum: " + this.consum + "W\n" +
                "Indice redare culoare: " + this.indiceRedareCuloare * 100 + "%\n";
    }
}
