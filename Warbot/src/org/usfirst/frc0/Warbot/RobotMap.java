// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.


package org.usfirst.frc0.Warbot;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.can.*;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANJaguar chassisLeftFront;
    public static CANJaguar chassisLeftBack;
    public static CANJaguar chassisRightFront;
    public static CANJaguar chassisRightBack;
    public static RobotDrive chassisRobotDrive;
    public static Gyro chassisGyro;
    public static AnalogChannel chassisLeftUltrasonic;
    public static AnalogChannel chassisRightUltrasonic;
    public static SpeedController elevatorMotor;
    public static AnalogChannel elevatorPot;
    public static SpeedController shooterMotor1;
    public static SpeedController shooterMotor2;
    public static SpeedController shooterMotor3;
    public static SpeedController pickupBeltMotor;
    public static SpeedController pickupShaftMotor;
    public static SpeedController climberMotor;
    public static DigitalInput climberLimit;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        try { 
            chassisLeftFront = new CANJaguar(7);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
	
        
        try { 
            chassisLeftBack = new CANJaguar(6);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
	
        
        try { 
            chassisRightFront = new CANJaguar(5);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
	
        
        try { 
            chassisRightBack = new CANJaguar(2);
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
	
        
        chassisRobotDrive = new RobotDrive(chassisLeftFront, chassisLeftBack,
              chassisRightFront, chassisRightBack);
	
        chassisRobotDrive.setSafetyEnabled(true);
        chassisRobotDrive.setExpiration(0.1);
        chassisRobotDrive.setSensitivity(0.5);
        chassisRobotDrive.setMaxOutput(1.0);

        chassisRobotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        chassisRobotDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        chassisGyro = new Gyro(1, 1);
	LiveWindow.addSensor("Chassis", "Gyro", chassisGyro);
        chassisGyro.setSensitivity(0.007);
        chassisLeftUltrasonic = new AnalogChannel(1, 2);
	LiveWindow.addSensor("Chassis", "Left Ultrasonic", chassisLeftUltrasonic);
        
        chassisRightUltrasonic = new AnalogChannel(1, 3);
	LiveWindow.addSensor("Chassis", "Right Ultrasonic", chassisRightUltrasonic);
        
        elevatorMotor = new Jaguar(1, 1);
	LiveWindow.addActuator("Elevator", "Motor", (Jaguar) elevatorMotor);
        
        elevatorPot = new AnalogChannel(1, 4);
	LiveWindow.addSensor("Elevator", "Pot", elevatorPot);
        
        shooterMotor1 = new Victor(1, 5);
	LiveWindow.addActuator("Shooter", "Motor 1", (Victor) shooterMotor1);
        
        shooterMotor2 = new Victor(1, 7);
	LiveWindow.addActuator("Shooter", "Motor 2", (Victor) shooterMotor2);
        
        shooterMotor3 = new Victor(1, 8);
	LiveWindow.addActuator("Shooter", "Motor 3", (Victor) shooterMotor3);
        
        pickupBeltMotor = new Jaguar(1, 4);
	LiveWindow.addActuator("Pickup Belt", "Motor", (Jaguar) pickupBeltMotor);
        
        pickupShaftMotor = new Jaguar(1, 3);
	LiveWindow.addActuator("Pickup Shaft", "Motor", (Jaguar) pickupShaftMotor);
        
        climberMotor = new Jaguar(1, 2);
	LiveWindow.addActuator("Climber", "Motor", (Jaguar) climberMotor);
        
        climberLimit = new DigitalInput(1, 5);
	LiveWindow.addSensor("Climber", "Limit", climberLimit);
        
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
