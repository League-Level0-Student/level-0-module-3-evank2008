

package _01_else_if._5_own_adventure;
import java.net.URI;

import javax.swing.JOptionPane;
public class Adventure {
public static void main(String[] args) {
	
	String input = JOptionPane.showInputDialog("Once upon a time little Timmy was walking on the road. \nHe encountered a fork in the road going left and right. Which way did he go?");
	if(input.equalsIgnoreCase("left")) {
		JOptionPane.showMessageDialog(null, "Little Timmy fell off a cliff and died. The End.");
	} 
	else if(input.equalsIgnoreCase("right")) {
		JOptionPane.showMessageDialog(null, "Little Timmy tied his shoelaces wrong and accidentaly opened up a gash in the space-time continuum. \n Little Timmy was sucked in and spent the rest of eternity contemplating his actions. The End.");
	}
	else {
			JOptionPane.showMessageDialog(null, "Little Timmy had a siezure and died. The End.");
	}

	}
}