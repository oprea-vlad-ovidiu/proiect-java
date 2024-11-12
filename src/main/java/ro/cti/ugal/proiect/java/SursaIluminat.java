package ro.cti.ugal.proiect.java;

public class SursaIluminat {
    public int lightBrightness;         // In lumens
    public int lightTemperature;        // In kelvin
    public int lightConsumption;        // In watts
    public double lightColorAccuracy;   // Color Rendering Index
    
    public SursaIluminat() {
        this.lightBrightness = 0;
        this.lightTemperature = 0;
        this.lightConsumption = 0;
        this.lightColorAccuracy = 0.0;
    }
}
