package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ButtonListener4 implements ActionListener {

	private int times;
	private JTextField nameTextField;
	private String[] ordinals = {"once", "twice", "thee times", "four times"};
	
	public ButtonListener4(JTextField nameTextField) {
	this.nameTextField = nameTextField;	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		nameTextField.setText("The button was clicked " + ordinals[times]);
		times++;
	}

}
