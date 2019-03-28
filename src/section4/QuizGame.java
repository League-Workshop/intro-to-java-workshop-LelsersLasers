package section4;
import javax.swing.JOptionPane;
public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String queOne = JOptionPane.showInputDialog(null, "sona vs braum:\nWho is more likely to get played in the pros? (lower case)");
		// 3.  Use an if statement to check if their answer is correct
		if (queOne.equals("braum")) {
			score = score + 1;
		}
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String queTwo = JOptionPane.showInputDialog(null, "lucian vs galio:\nWho is more likely to get played in the pros? (as an adc)");
		if (queTwo.equals("lucian")) {
			score = score + 1;
		}
		String queThre = JOptionPane.showInputDialog(null, "What's the minimum number of champions you need to unlock ranked?");
		if (queThre.equals("20")) {
			score = score + 1;
		}
		String queFour = JOptionPane.showInputDialog(null, "What's the FIRST level you can do anything with your runes?");
		if (queFour.equals("8")) {
			score = score + 1;
		}
		String queFive = JOptionPane.showInputDialog(null, "What is the name of the main map? (lower case)");
		if (queFive.equals("summoners rift")) {
			score = score + 1;
		}
		
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "You got a " + score + " out of 5!");
	}
}
