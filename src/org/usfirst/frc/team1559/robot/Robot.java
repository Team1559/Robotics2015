
package org.usfirst.frc.team1559.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
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
	Joystick joy;
	Arduino arduino;
    public void robotInit() {
    	joy = new Joystick(0);
    	arduino = new Arduino(0,1,2);
    }

    /**
     * This function is called periodically during autonomous
     */
    public void disabledPeriodic() {

    }
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopInit() {

    }
    public void teleopPeriodic() {
    	if (joy.getRawButton(1)){
    		arduino.Write(1);
    	}
    	else if (joy.getRawButton(2)){
    		arduino.Write(2);
    	}
    	else if (joy.getRawButton(3)){
    		arduino.Write(3);
    	}
    	else {
    		arduino.Write(0);
    	}
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
