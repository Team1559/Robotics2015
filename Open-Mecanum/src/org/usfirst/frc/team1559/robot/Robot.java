
package org.usfirst.frc.team1559.robot;

import edu.wpi.first.wpilibj.Gyro;
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
    MecanumDrive md;
    boolean state = true;
    Gyro g;
    
    public void robotInit() {
        joy1 = new Joystick(0);
        joy2 = new Joystick(1);
        lf = new Talon(9);
        rf = new Talon(6);
        lr = new Talon(7);
        rr = new Talon(8);
        md = new MecanumDrive(joy1, lf, lr, rf, rr);
        g = new Gyro(4); //analog input
        g.reset();
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
    	
    	md.drive(joy1.getX(), joy1.getY(), joy1.getTwist(), g.getAngle());

    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
