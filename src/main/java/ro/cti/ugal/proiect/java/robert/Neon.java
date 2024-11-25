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
public class Neon extends SursaIluminat{
    
    private float gasVoltage;
    private String gasType;
    private int tubeDiameter, tubeLength;
    private String tubeMaterial;
    private boolean dimmable;
    
    public Neon()
    {
        super();
        this.gasVoltage = 0.0f;
        this.gasType = "none";
        this.tubeDiameter = 0;
        this.tubeLength = 0;
        this.tubeMaterial = "none";
        this.dimmable = false;
        
    }
    
    public Neon(int luminozitate, int temperaturaCuloare, short consum, 
            float indiceRedareCuloare, float gasVoltage, String gasType, 
            int tubeD, int tubeL, String tubeMat, boolean dimmable)
    {
        super(luminozitate, temperaturaCuloare, consum, indiceRedareCuloare);
        this.gasVoltage = gasVoltage;
        this.gasType = gasType;
        this.tubeDiameter = tubeD;
        this.tubeLength = tubeL;
        this.tubeMaterial = tubeMat;
        this.dimmable = dimmable;
    }
    
    public Neon(Neon other) {
        super(other);
        this.gasVoltage = other.gasVoltage;
    }
    
    public float getGasVoltage() {
        return gasVoltage;
    }

    public String getGasType() {
        return gasType;
    }

    public int getTubeDiameter() {
        return tubeDiameter;
    }

    public int getTubeLength() {
        return tubeLength;
    }

    public String getTubeMaterial() {
        return tubeMaterial;
    }

    public boolean isDimmable() {
        return dimmable;
    }

    public void setGasVoltage(float gasVoltage) {
        this.gasVoltage = gasVoltage;
    }

    public void setGasType(String gasType) {
        this.gasType = gasType;
    }

    public void setTubeDiameter(int tubeDiameter) {
        this.tubeDiameter = tubeDiameter;
    }

    public void setTubeLength(int tubeLength) {
        this.tubeLength = tubeLength;
    }

    public void setTubeMaterial(String tubeMaterial) {
        this.tubeMaterial = tubeMaterial;
    }

    public void setDimmable(boolean dimmable) {
        this.dimmable = dimmable;
    }
    
    
    
    public String toString()
    {
        
        return "gasVoltage is: "+gasVoltage+"\ngasType: "+gasType+"\ntubeDiameter: "+tubeDiameter+"\ntubeLEngth: "+tubeLength+"\ntubeMaterial:"+tubeMaterial+"\ndimmable: "+dimmable;
        
    }
    
    
}
