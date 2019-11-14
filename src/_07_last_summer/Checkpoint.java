package _07_last_summer;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = JOptionPane.showInputDialog("What is your favorite color");
		JOptionPane.showMessageDialog(null,  input + " is also my favaorite color");
	
	
	
	Robot E = new Robot();
	E.setSpeed(80);
	
	E.penDown();
	E.move(150);
E.turn(120);	
E.move(150);
E.turn(120);
E.move(150);
E.turn(120);
	
	
	
	
	
	}

}
