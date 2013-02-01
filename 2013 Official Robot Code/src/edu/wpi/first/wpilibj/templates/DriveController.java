package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.RobotDrive;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Warbots
 */
public class DriveController {
 
    RobotDrive robot = null;
    public DriveController(int leftChannel, int rightChannel) {
        robot = new RobotDrive(leftChannel, rightChannel);//changable
    } 
    
    public DriveController() {
        robot = new RobotDrive(1,2); //default
    }
    
       private boolean setDeadZone(double deadzonevalue, double value){ //deadzone values
        if (Math.abs(value)<=deadzonevalue){ 
           return true;
        }
        else if(Math.abs(value)>deadzonevalue){
            return false;
        }
         return false;
       }
    
    
    public void tankControl(double lForward, double Rforward) {
        tankControl(0.0, lForward, Rforward, 1.0);
    }
    
    public void tankControl(double deadzone, double lForward, double Rforward, double sensitivity) {
      double left=0,right =0;
      System.out.println(lForward + " , " + Rforward); //prints out debug
      if(setDeadZone(deadzone, lForward)) {
          left = 0; //deadzone
      }
      else {
          left = lForward;
      }
      if(setDeadZone(deadzone, Rforward)) {
          right = 0;
      }
      else {
          right = Rforward;
      }
      robot.tankDrive((left*sensitivity), (right*sensitivity)); //controls tank drive
    }
    
    public void driveDistance(double distance, double speed) {
        //TODO: PID or feedback loop that use encoders to travel a set distance at a set speed and brake.
    }



}
