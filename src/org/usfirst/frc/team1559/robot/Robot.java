
package org.usfirst.frc.team1559.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot
{
	Joystick joy;
	boolean pressed = false;
	Lifter lifter;
	
    public void robotInit() {
    	joy = new Joystick(0);
    	lifter = new Lifter(15);
    }
    
    public void autonomousInit() {
    	
    }
    
    public void autonomousPeriodic() {
		
    }

    public void teleopInit() {
    	lifter.setHome();
    }
    
    public void teleopPeriodic()
    {
    	SmartDashboard.putNumber("Encoder Pos.", lifter.getPosition() - lifter.getHome());
        SmartDashboard.putNumber("Encoder Spd.", lifter.getSpeed());
        
        if(joy.getRawButton(10) && !pressed) {
        	lifter.liftTote(1);
        	pressed = true;
        }
        else if(joy.getRawButton(11) && !pressed) {
        	lifter.liftTote(2);
            pressed = true;
        }
        else if(joy.getRawButton(7) && !pressed) {
        	lifter.goHome();
        }
        else {
        	pressed = false;
        }
    }

    public void testInit() {
    	
    }
    
    public void testPeriodic() {
    	
    }
    
    public void disabledInit() {
    	
    }
    
    public void disabled() {
    	
    }
}