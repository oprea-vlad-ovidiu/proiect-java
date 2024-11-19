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
    
    public float gasVoltage;
    public String gasType;
    public int tubeDiameter, tubeLength;
    public String tubeMaterial;
    public boolean dimmable;
    
    public Neon()
    {
        this.gasVoltage = 0.0f;
        this.gasType = "none";
        this.tubeDiameter = 0;
        this.tubeLength = 0;
        this.tubeMaterial = "none";
        this.dimmable = false;
        
    }
    
    public Neon(float gasVoltage, String gasType, int tubeD, int tubeL, String tubeMat, boolean dimmable)
    {
        this.gasVoltage = gasVoltage;
        this.gasType = gasType;
        this.tubeDiameter = tubeD;
        this.tubeLength = tubeL;
        this.tubeMaterial = tubeMat;
        this.dimmable = dimmable;
    }
    
    public Neon(Neon other) {
    this.gasVoltage = other.gasVoltage;
}
    
    public String toString()
    {
        
        return "gasVoltage is: "+gasVoltage;
        
    }
    
    
}
