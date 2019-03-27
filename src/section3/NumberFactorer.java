package section3;
import javax.swing.JOptionPane;
public class NumberFactorer {

	public static void main(String[] args) {
		String sNumber = JOptionPane.showInputDialog("Eneter number to be factored:");
		int number = Integer.parseInt(sNumber);
		int newnum = number;
		int divised = 0;
		for (int numtwo = 1; numtwo<newnum;numtwo++) {
			divised = number/numtwo;
			if (number % numtwo == 0) {
				System.out.println(numtwo + " and "+divised);
				newnum = divised;
			}
		}

	}

}
