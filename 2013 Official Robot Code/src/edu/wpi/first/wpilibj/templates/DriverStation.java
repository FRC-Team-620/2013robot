/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;

/**
 *
 * @author Warbots
 */
public class DriverStation {
    private static DriverStation _instance = new DriverStation();
    Joystick driveLeft = new Joystick(1);
    Joystick driveRight = new Joystick(2);
    Joystick mechControl = new Joystick(3);
    
    public static DriverStation getInstance() {
        return _instance;
    }
    
    public Joystick getJoystick (int index) throws IndexOutOfBoundsException {
        switch(index) {
            case 1:
               return driveLeft;
            case 2: 
                return driveRight;
            case 3:
                return mechControl;
            default: throw new IndexOutOfBoundsException(); 
        }
        
    }
}
