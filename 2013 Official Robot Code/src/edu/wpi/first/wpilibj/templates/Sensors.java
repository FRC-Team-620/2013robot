/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Gyro;

/**
 *
 * @author Warbots
 */
public class Sensors {
    //manage sensor pins
    
    //sensors on digital pins
        //encoders
             public static Encoder encoder1 = new Encoder(1,2);
             public static Encoder encoder2 = new Encoder(3,4);
    
    //sensors on analog pins
             //gyro
    public static Gyro gyro = new Gyro(new AnalogChannel(1));
             //ultrasonic proximity sensors
    public static SonarProximity sonar1 = new SonarProximity(2); //front? 
    public static SonarProximity sonar2 = new SonarProximity(3); //back? //TODO: set the use of these
    
}
