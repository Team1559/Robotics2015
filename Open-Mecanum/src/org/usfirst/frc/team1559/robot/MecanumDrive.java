package org.usfirst.frc.team1559.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;

public class MecanumDrive {

	Talon leftFront, leftRear;
	Talon rightFront, rightRear;
	Joystick joy;
	
	//use these to set
	double lf;
	double lr;
	double rf;
	double rr;
	
	
	public MecanumDrive(Joystick j, Talon lf, Talon lr, Talon  rf, Talon rr){
		
		joy = j;
		leftFront = lf;
		leftRear = lr;
		rightFront = rf;
		rightRear = rr;
				
		this.lf = 0.0; //accesses the double values for driving calculations
		this.lr = 0.0;
		this.rf = 0.0;
		this.rr = 0.0;
	}
	
	/*
	 * Use for autonomous mode, or directly moving the chassis
	 * 
	 * Parameters:
	 * double speed:
	 * 		scaled speed between -1.0 and 1.0
	 * 		i.e. 1.0 is max forward
	 * 			-1.0 is max reverse
	 * 
	 * double angle:
	 * 		angle between -360 and 360. Used for translating at an angle
	 * 		i.e. 45 moves the chassis at a 45 degree angle, maintaining orientation
	 * 			
	 * double distance:
	 * 		distance in inches, actual distance is measured by pedometer unit -?
	 * 
	 * boolean closedLoop:
	 * 		should be true most of the time, checks Gyro angle against desired angle
	 * 		TRUE: do check
	 * 		FALSE: you don't speak english, don't check
	 */
	public void move(double speed, double angle, double distance, boolean closedLoop){
		
		
		
	}
	
	/*
	 * Just rotate...angle in degrees
	 */
	public void rotate(double angle){
		
		
		
	}
	
	/*
	 * Should be called iteratively, to drive the robot based on joystick input
	 * 
	 * CONTROLS:
	 * 	Translate: Joystick X-axis, Y-axis
	 * 	Rotate: Joystick Z-axis, or twist (configurable)
	 */
	public void driveOpen(){
		
		
		
	}
	
	/*
	 * CONTROL THE ROBOT, MAKING IT CHECK THE DESIRED ANGLE AGAINST THE GYROSCOPE
	 * Should be called iteratively, to drive the robot based on joystick input
	 * 
	 * CONTROLS:
	 * 	Translate: Joystick X-axis, Y-axis
	 * 	Rotate: Joystick Z-axis, or twist (configurable)
	 */
	public void driveClosed(){
		
		
		
	}
	
	/*
	 * Set each Talon to an arbitrary value...or something preconfigured...or whatever...
	 * Math is done before this method is called. 
	 */
	public void setMotors(double rFront, double rRear, double lFront, double lRear){
		
		leftFront.set(lFront);
		leftRear.set(lRear);
		rightFront.set(rFront);
		rightRear.set(rRear);
		
	}
	
}
