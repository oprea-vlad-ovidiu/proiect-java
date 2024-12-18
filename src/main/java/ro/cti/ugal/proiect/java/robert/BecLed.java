/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.cti.ugal.proiect.java.robert;

import ro.cti.ugal.proiect.java.SursaIluminat;

/**
 *
 * @author Robert
 */



public class BecLed extends SursaIluminat {
    public float     energyEfficiency;
    public int lifeDuration;
    public int hexColor;
    public float heatEmitted;
    
    
    public BecLed(){
        super();
        this.energyEfficiency = 0;
        this.lifeDuration = 0;
        this.hexColor = 0x000000FF;
        this.heatEmitted = 0.0f;
    }
    public BecLed(float eF, int lD, int hC, float hE, int luminozitate, 
                int temperaturaCuloare, short consum, float indiceRedareCuloare)
    {
        super(luminozitate, temperaturaCuloare, consum, indiceRedareCuloare);
        this.energyEfficiency = eF;
        this.lifeDuration = lD;
        this.hexColor = hC;
        this.heatEmitted = hE;
    }
    
    public BecLed(BecLed other) {
    this.energyEfficiency = other.energyEfficiency;
    this.lifeDuration = other.lifeDuration;
    this.hexColor = other.hexColor;
    this.heatEmitted = other.heatEmitted;
}

    public float getEnergyEfficiency() {
        return energyEfficiency;
    }

    public int getLifeDuration() {
        return lifeDuration;
    }

    public int getHexColor() {
        return hexColor;
    }

    public float getHeatEmitted() {
        return heatEmitted;
    }

    public void setEnergyEfficiency(float energyEfficiency) {
        this.energyEfficiency = energyEfficiency;
    }

    public void setLifeDuration(int lifeDuration) {
        this.lifeDuration = lifeDuration;
    }

    public void setHexColor(int hexColor) {
        this.hexColor = hexColor;
    }

    public void setHeatEmitted(float heatEmitted) {
        this.heatEmitted = heatEmitted;
    }
    
    
    
    public String toString()
    {
        return "Energy Eficiency: "+energyEfficiency + "\nLife duration: "+lifeDuration + "\nLed Color: "+hexColor+"\nHeat: "+heatEmitted;
    }
    
}
