package section3;
import javax.swing.JOptionPane;
public class PrimeNumberER {

	public static void main(String[] args) {
		String sNumber = JOptionPane.showInputDialog("Eneter a number to be prime factorized");
		int number = Integer.parseInt(sNumber);
		int newnum = number;
		System.out.println(number);
		for (int numtwo = 2; numtwo<=newnum;numtwo++) {
			if (newnum%numtwo == 0) {
				System.out.println(numtwo);
				newnum = newnum/numtwo;
				while (newnum % numtwo == 0){
					System.out.println(numtwo);
					newnum = newnum/numtwo;
				}
			}
		}
	}

}
