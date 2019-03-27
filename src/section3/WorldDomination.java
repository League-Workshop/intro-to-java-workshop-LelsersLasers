package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String badPerson = JOptionPane.showInputDialog("Edoes u know how to code??????");
		// 2. If they say "yes", tell them they will rule the world.
		if (badPerson.equals("yes")) {
			JOptionPane.showMessageDialog(null, "u does rules thy world");
		}
		else {
			JOptionPane.showMessageDialog(null, "good luck with those dishes mate");
		}
		// 3. Otherwise, wish them good luck washing dishes.

	}
}

