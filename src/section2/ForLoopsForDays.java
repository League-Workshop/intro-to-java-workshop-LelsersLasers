package section2;
import org.jointheleague.graphical.robot.Robot;
public class ForLoopsForDays {
	
	
	public static void main(String[] args) {
		Robot robo = new Robot("mini");
		Robot robo2 = new Robot ("batman");
		robo2.moveTo(robo.getX(), robo.getY());
		robo2.penDown();
		robo.moveTo(300, 300);
		robo.setSpeed(100);
		robo.penDown();
		for(int num = 0; num<500; num++) {
			robo.move(num);
			robo.turn(25);
			robo.setRandomPenColor();
			robo2.setAngle(robo.getX()/robo2.getX() * robo.getY()/robo2.getY());
			robo2.move(10);
		}
	}
}