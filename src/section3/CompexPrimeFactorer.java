package section3;
import javax.swing.JOptionPane;
public class CompexPrimeFactorer {

	public static void main(String[] args) {
		String sNumber = JOptionPane.showInputDialog("Eneter a number to be prime factorized");
		int number = Integer.parseInt(sNumber);
		int newnum = number;
		int expocount = 0;
		System.out.println(number);
		for (int numtwo = 2; numtwo<=newnum;numtwo++) {
			if (newnum%numtwo == 0) {
				newnum = newnum/numtwo;
				if (newnum%numtwo == 0) {
					System.out.print(numtwo);
					expocount = 2;
				}
				else {
					System.out.println(numtwo);
				}
				while (newnum % numtwo == 0){
					newnum = newnum/numtwo;
					
					
					
					
					
					if (newnum%numtwo == 0) {
						expocount = expocount + 1;
					}
					else if (expocount > 1) {
						System.out.println("^" + expocount);
					}
					else {
						System.out.println(numtwo);
					}
					
					
					
					
					
					
				}
			}
		}
	}

}
