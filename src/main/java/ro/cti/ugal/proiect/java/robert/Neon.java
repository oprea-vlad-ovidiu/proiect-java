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
    
    public Neon()
    {
        this.gasVoltage = 0.0f;
    }
    
    public Neon(float gasVoltage)
    {
        this.gasVoltage = gasVoltage;
    }
    
    public Neon(Neon other) {
    this.gasVoltage = other.gasVoltage;
}
    
    public String toString()
    {
        
        return "gasVoltage is: "+gasVoltage;
        
    }
    
    
}
