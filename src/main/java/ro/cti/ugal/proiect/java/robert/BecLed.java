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
    public double energyEfficiency;
    public int lifeDuration;
    public int hexColor;
    public float heatEmitted;
    
    
    public BecLed(){
        this.energyEfficiency = 0;
        this.lifeDuration = 0;
        this.hexColor = 0x000000FF;
        this.heatEmitted = 0.0f;
    }
    
    
}
