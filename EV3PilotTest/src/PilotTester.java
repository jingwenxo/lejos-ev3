import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import lejos.robotics.RegulatedMotor;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.utility.Delay;
import lejos.utility.PilotProps;

/**
 * Test of the DifferentialPilot class.
 * 
 * Requires a wheeled vehicle with two independently controlled
 * motors to steer differentially, so it can rotate within its 
 * own footprint (i.e. turn on one spot).
 * 
 * You can run the PilotParams sample to create a property file which 
 * sets the parameters of the Pilot to the dimensions
 * and motor connections for your robot.
 * 
 * The vehicle will go through a series of manoeuvres and
 * show the tachometer readings on the screen after each
 * manoeuvre. 
 * 
 * Press ENTER to start and any button to return to the menu
 * when the program has finished.
 *
 * @author Roger Glassey and Lawrie Griffiths
 *
 */ 
public class PilotTester
{
	static RegulatedMotor leftMotor;
	static RegulatedMotor rightMotor;
		
	public static void main(String[] args ) throws Exception
	{
    	PilotProps pp = new PilotProps();
    	pp.loadPersistentValues();
    	float wheelDiameter = Float.parseFloat(pp.getProperty(PilotProps.KEY_WHEELDIAMETER, "4.0"));
    	float trackWidth = Float.parseFloat(pp.getProperty(PilotProps.KEY_TRACKWIDTH, "18.0"));
    	
    	System.out.println("Wheel diameter is " + wheelDiameter);
    	System.out.println("Track width is " +trackWidth);
    	
    	leftMotor = PilotProps.getMotor(pp.getProperty(PilotProps.KEY_LEFTMOTOR, "B"));
    	rightMotor = PilotProps.getMotor(pp.getProperty(PilotProps.KEY_RIGHTMOTOR, "C"));
    	boolean reverse = Boolean.parseBoolean(pp.getProperty(PilotProps.KEY_REVERSE,"false"));
    	
    	DifferentialPilot robot = new DifferentialPilot(wheelDiameter,trackWidth,leftMotor,rightMotor,reverse);
    	 
        // Wait for user to press ENTER
    	System.out.println("Waiting for press");
		Button.waitForAnyPress();
        robot.setAcceleration(4000);
		robot.setTravelSpeed(20); // cm/sec
		robot.setRotateSpeed(180); // deg/sec
		System.out.println("Going forwards");
		robot.forward();
		Delay.msDelay(1000);
		System.out.println("Stopping");
		robot.stop();
		System.out.println("Stopped");
		showCount(robot, 0);
		System.out.println("Going backwards");
		robot.backward();
		Delay.msDelay(1000);
		robot.stop();
		showCount(robot, 1);
		System.out.println("Travel started");
		robot.travel(10,true);
		System.out.println("Waiting for move to end");
		while(robot.isMoving())Thread.yield();
		System.out.println("Move ended");
		showCount(robot, 2);
		System.out.println("Travel back");
		robot.travel(-10);
		System.out.println("Travel back ended");
		showCount(robot, 3);
		System.out.println("Loop of rotates anti-clockwise");
		for(int i = 0; i<4; i++)
		{
			robot.rotate(90);
		}
		showCount(robot, 4);
		System.out.println("Loop of rotates clockwise");
		for(int i = 0; i<4; i++)
		{
			robot.rotate(-90,true);
			while(robot.isMoving())Thread.yield();
		}
		showCount(robot, 5);
		System.out.println("Arcs backwards and forwards, anticlockwise and clockwise");
		robot.steer(-50,180,true);
		while(robot.isMoving())Thread.yield();
		robot.steer(-50,-180);
		showCount(robot, 6);
		robot.steer(50,180);
		robot.steer(50, -180);
		showCount(robot, 7);
		System.out.println("Travel forwards");
		robot.travel(10,true);
		Delay.msDelay(500);
        robot.stop();
        System.out.println("Travel backwards");
		robot.travel(-10);
		System.out.println("Spin twice anti-clockwise");
		robot.rotate(720);
		System.out.println("Waiting for button press");
		// Exit after any button is pressed
		Button.waitForAnyPress();
	}
   
	public static void showCount(DifferentialPilot robot, int i)
	{
		LCD.drawInt(leftMotor.getTachoCount(),0,i);
		LCD.drawInt(rightMotor.getTachoCount(),7,i);
	}
}

