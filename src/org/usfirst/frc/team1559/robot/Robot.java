
package org.usfirst.frc.team1559.robot;

import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.Talon;

//testing test test
public class Robot extends IterativeRobot {
 
	Joystick joy1;
	Talon lf, lr, rf, rr;
	RobotDrive rd;
	Gyro g;
	int count;
	
    public void robotInit() {
    	joy1 = new Joystick(0);
    	lf = new Talon(9); //backwards
    	lr = new Talon(6); //backwards
    	rf = new Talon(8);
    	rr = new Talon(7);
    	rd = new RobotDrive(lf, lr, rf, rr);
    	rd.setInvertedMotor(MotorType.kFrontLeft, true);
    	rd.setInvertedMotor(MotorType.kRearLeft, true);
    	rd.setMaxOutput(.5);
    	g = new Gyro(1);
    	count = 0;
    }


    public void autonomousInit(){
    	
    	g.reset();
    	
    }
    
    public void autonomousPeriodic() {
    	
    	if(count > 1000){
    		rd.mecanumDrive_Cartesian(.5, 0, 0, g.getAngle());
    	}
    	    	
    }
    
    public void teleopInit(){
    	
    	g.reset();
    	
    }


    public void teleopPeriodic() {
        
    	rd.mecanumDrive_Cartesian(joy1.getX(), joy1.getY(), joy1.getRawAxis(4), g.getAngle());
//    	System.out.println(g.getAngle());
    	
    	if(joy1.getRawButton(1)){
    		
    		g.reset();
    		
    	}
    	
    	
    }
    

    public void testPeriodic() {
    
    }
    
}
