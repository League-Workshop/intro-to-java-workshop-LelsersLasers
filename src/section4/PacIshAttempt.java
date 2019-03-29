package section4;
import java.awt.KeyEventDispatcher;

import java.io.IOException;

public class PacIshAttempt {
	
	static boolean gameOn = true;
	
	public static void startUp() {
		
	}
	
	
	public static void draw() {
		for (int y = 1; y<=9; y++) {
			for (int x = 1; x<=18; x++) {
				if (x<18 && y == 1) {
					System.out.print("#");
				}
				if (x == 18) {
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
	}

	public static void move() {
		
	}
	public static void logic() {
		
	}
	public static void aiMove() {
		
	}
	
	
	public static void main(String[] args) { 
		
		startUp();
		draw();
		while (gameOn) {
			move();
			logic();
			aiMove();
			}
		
	}
}
