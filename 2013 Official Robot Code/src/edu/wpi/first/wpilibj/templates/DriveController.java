package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;

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
    
    public void driveDistance(int distance, double speed) { //TODO: check surroundings using ultrasonic sensors
       robot.tankDrive(0,0);
       Encoder encoder1 = Sensors.encoder1;
       Encoder encoder2 = Sensors.encoder2;
       encoder1.reset();
       encoder2.reset();
       double cDistance = 0; //current distance
       while((Math.abs(distance) - Math.abs(cDistance)) < 0.5) { //<-- tweak final stop value
           
           if( (distance - cDistance) <= distance*0.75) {
             double cSpeed = (distance - cDistance)/distance; //handles stopping
             robot.tankDrive(cSpeed, cSpeed);
           }
           
           else {
             robot.tankDrive(speed, speed);
           }
           cDistance = (encoder1.getDistance()+encoder2.getDistance())/2;
           Timer.delay(0.05);
       }
       robot.tankDrive(0,0); //STAHP
       encoder1.reset();
       encoder2.reset();
    }
    
    public void rotate(double angle) {
        robot.tankDrive(0,0);
        double cAngle = 0;
        
        Sensors.gyro.reset();
        while(Math.abs(cAngle) < angle) {
            if(angle > 0) {
                robot.tankDrive(0.3, -0.3);
             }
            else {
                robot.tankDrive(-0.3, 0.3);
            }
            cAngle = Sensors.gyro.getAngle();
        }
        
        robot.tankDrive(0,0);
        
        Sensors.gyro.reset();
    }


}
