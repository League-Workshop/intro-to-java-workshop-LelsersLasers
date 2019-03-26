package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot robo = new Robot();
		robo.penDown();
		robo.setPenColor(1,100,5);
		for (int num=0; num < 360; num++) {
			robo.move(1);
			robo.turn(1);
			robo.setSpeed(num);
		}
		
	}
}
