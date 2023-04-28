

package _01_else_if._4_are_you_happy;
import java.net.URI;

import javax.swing.JOptionPane;
public class Happy {
public static void main(String[] args) {

	String input = JOptionPane.showInputDialog("are you happy?");
	if(input.equals("yes")) {
		JOptionPane.showMessageDialog(null, "nice");
		System.exit(0);
	}
	else {
		input = JOptionPane.showInputDialog("I'll take that as a no. Do you want to be happy?");
	}
	if(input.equals("yes")) {
		JOptionPane.showMessageDialog(null, "change something.");
		System.exit(0);
	}
	else {
		JOptionPane.showMessageDialog(null,"nice");
		System.exit(0);
	}
	
	
}
}