/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.Timer;


public class MainController extends SimpleRobot {
    
    DriveController drive = null;
    
    public MainController() {
        drive = new DriveController();
    }
    
    public void autonomous() {
            //todo: see the readme for instructions IM NOT TYPING IT OUT AGAIN
    }

    
    public void operatorControl() {
         while(true && isOperatorControl() && isEnabled()){
           drive.tankControl(0.2, DriverStation.getInstance().getJoystick(1).getY(),
                 DriverStation.getInstance().getJoystick(2).getY(), 0.9); //sensitivity is 0.9, deadzone is 0.2
           Timer.delay(.005);
        }
    }
    
    public void test() { }
}
