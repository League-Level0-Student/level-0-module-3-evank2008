
package _01_else_if._1_robot_color_chooser;
import org.jointheleague.graphical.robot.KeyboardAdapter;
import org.jointheleague.graphical.robot.Robot;
import javax.swing.JOptionPane;
import java.awt.Color;

@SuppressWarnings("unused")
public class RobotColorChooser {
	public static void main(String[] args) {
int penRed = 255;
int penGreen = 255;
int penBlue  =255;
		//1. Create a new Robot
		Robot colorboi = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		colorboi.hide();
		colorboi.setSpeed(10);
		colorboi.penDown();
		while(true) {
		String colorInput = JOptionPane.showInputDialog("Name a color of the rainbow - no capitalizations please");
		switch(colorInput) {
		case "red":
			penRed = 255;
			penGreen = 0;
			penBlue = 0;
			break;
		case "orange":
			penRed = 250;
			penGreen = 125;
			penBlue = 0;
			break;
		case "yellow":
			penRed = 255;
			penGreen = 255;
			penBlue = 0;
			break;
		case "green":
			penRed = 0;
			penGreen = 255;
			penBlue = 0;
			break;
		case "blue":
			penRed = 0;
			penGreen = 0;
			penBlue = 255;
			break;
		case "purple":
			penRed = 125;
			penGreen = 0;
			penBlue = 250;
			break;
		case "violet":
			JOptionPane.showMessageDialog(null, "I assume you mean purple.");
			penRed = 125;
			penGreen = 0;
			penBlue = 250;
			break;
			default:
				JOptionPane.showMessageDialog(null, "I don't know that color!");
		}
		colorboi.setPenColor(penRed, penGreen, penBlue);
		colorboi.move(100);
		colorboi.turn(90);
		colorboi.move(100);
		colorboi.turn(90);
		colorboi.move(100);
		colorboi.turn(90);
		colorboi.move(100);
		colorboi.turn(90);
		}
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
	}
}
