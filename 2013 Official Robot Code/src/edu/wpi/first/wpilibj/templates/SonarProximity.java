/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.AnalogChannel;

/**
 *
 * @author Warbots
 */
public class SonarProximity {
    private AnalogChannel chan = null;
    private double sensitivity = 0.0098;
    
    public SonarProximity(int channel) {
          chan = new AnalogChannel(channel);
    }
    
     public SonarProximity() {
          chan = new AnalogChannel(2);
    }
     
     public double getProximity() {
         return (chan.getVoltage()/sensitivity);
     }
     
     public void setSensitivity(double sensitivity) {
         this.sensitivity = sensitivity;
     }
}
