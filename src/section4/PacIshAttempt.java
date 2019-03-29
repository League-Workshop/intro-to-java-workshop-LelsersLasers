package section4;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.Random;
import org.jointheleague.graphical.robot.Robot;

public class PacIshAttempt implements KeyEventDispatcher{
	
	 boolean gameOn = true;
	 int pacY;
	 int pacX;
	 int coinX;
	 int coinY;
	 int score = 0;
	public  void startUp() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		draw();
		pacY = new Random().nextInt(7) + 2;
		pacX = new Random().nextInt(16) + 2;
		coinY = new Random().nextInt(7) + 2;
		coinX = new Random().nextInt(16) + 2;
		mainRun();
	}
	
	public void mainRun() {
		draw();
		while (gameOn) {
			logic();
			draw();
		}
	}
	public  void draw() {
		for (int y = 1; y<=9; y++) {
			for (int x = 1; x<=18; x++) {
					
				if(x == pacX && y == pacY) {
					System.out.print("O");
				}
				else if(x == coinX && y == coinY) {
					System.out.print("C");
				}
				else if (x<18 && y == 1) {
					System.out.print("#");
				}
				else if (x == 18) {
					System.out.println("#");
				}
				else if (x<18 && y == 9) {
					System.out.print("#");
				}
				else if (1<y && y<9 && x==1) {
						System.out.print("#");
				}
				else if (1<y && y<9 && x==18) {
						System.out.print("#");
				}
				else {
					System.out.print(" ");
				}
			}
		}
		System.out.println("Score; " + score);
	}

	public  void logic() {
		if (pacY == coinY && pacX == coinX) {
			score = score + 100;
		}
	}
	
	
	public  void turnRight() {
		pacX = pacX + 1;
	}
	public  void turnLeft() {
		pacX = pacX - 1;
	}
	public  void goUp() {
		pacY = pacY - 1;
	}
	public  void goDown() {
		pacY = pacY + 1;
	}
	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					turnRight();
			}
			else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				turnLeft();
			}
			else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				goDown();
			}
			else if (e.getKeyCode() == 38) {
				goUp();
			}	
		}
		return false;
	}
	
	
	
	public static void main(String[] args) { 
		new PacIshAttempt().startUp();
		/*startUp();
		draw();
		while (gameOn) {
			logic();
			draw();
		}*/
		
	}
}
