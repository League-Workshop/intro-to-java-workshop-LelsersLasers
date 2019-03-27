package section3;
import javax.swing.JOptionPane;
public class CompexPrimeFactorer {

	public static void main(String[] args) {
		String sNumber = JOptionPane.showInputDialog("Eneter a number to be prime factorized");
		int number = Integer.parseInt(sNumber);
		int newnum = number;
		System.out.println(number);
		for (int numtwo = 2; numtwo<=newnum;numtwo++) {
			if (newnum%numtwo == 0) {
				newnum = newnum/numtwo;
				if (newnum%numtwo == 0) {
					System.out.print(numtwo);
				}
				else {
					System.out.println(numtwo);
				}
				while (newnum % numtwo == 0){
					newnum = newnum/numtwo;
					if (newnum%numtwo == 0) {
						System.out.print(numtwo);
					}
					else {
						System.out.println(numtwo);
					}
				}
			}
		}
	}

}
