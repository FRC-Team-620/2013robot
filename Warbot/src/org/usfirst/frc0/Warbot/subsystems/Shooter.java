// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.


package org.usfirst.frc0.Warbot.subsystems;

import org.usfirst.frc0.Warbot.RobotMap;
import org.usfirst.frc0.Warbot.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Shooter extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController motor1 = RobotMap.shooterMotor1;
    SpeedController motor2 = RobotMap.shooterMotor2;
    SpeedController motor3 = RobotMap.shooterMotor3;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    
    
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    //Method that starts the motors(duh) to an inputed speed.
    public void startMotors(double speed1, double speed2, double speed3){
     motor1.set(speed1);
     motor2.set(speed2);
     motor3.set(speed3);
    }
    //Sets the motor speed to 0, thus stopping the motors
    public void stopMotors(){
     motor1.set(0);
     motor2.set(0);
     motor3.set(0);
    }
}

