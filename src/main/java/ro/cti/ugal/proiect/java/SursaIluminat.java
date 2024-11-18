package ro.cti.ugal.proiect.java;

public class SursaIluminat {
    public int lightBrightness;         // In lumens
    public int lightTemperature;        // In kelvin
    public int lightConsumption;        // In watts
    public double lightColorAccuracy;   // Color Rendering Index [0.0, 1.0]
    
    public SursaIluminat() {
        this.lightBrightness = 0;
        this.lightTemperature = 0;
        this.lightConsumption = 0;
        this.lightColorAccuracy = 0.0;
    }
    
    public SursaIluminat(int lightBrightness, int lightTemperature, int lightConsumption, double lightColorAccuracy) {
        this.lightBrightness = lightBrightness;
        this.lightTemperature = lightTemperature;
        this.lightConsumption = lightConsumption;
        this.lightColorAccuracy = Math.clamp(lightColorAccuracy, 0.0, 1.0);
    }
}
