
package org.usfirst.frc.team1559.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
	Joystick joy1;
    Joystick joy2;
    Talon lf;
    Talon rf;
    Talon lr;
    Talon rr;
    RobotDrive rd;
    boolean state = false;
    
    public void robotInit() {
        joy1 = new Joystick(1);
        joy2 = new Joystick(2);
        lf = new Talon(1);
        rf = new Talon(2);
        rd = new RobotDrive(lf, rf, lr, rr);
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	if(joy1.getRawButton(7)){
    		state = !state;
    	}
    	
    	
    	if(state){
	    	rd.mecanumDrive_Polar(joy1.getY(), joy1.getX(), joy2.getTwist());
	        Timer.delay(.01); //necessary?
    	} else {
    		rd.mecanumDrive_Cartesian(joy1.getX(), joy1.getY(), joy1.getTwist(), joy2.getTwist());
	        Timer.delay(.01); //necessary?
    	}
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
