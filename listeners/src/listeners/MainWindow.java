package listeners;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

import javax.swing.JButton;

public class MainWindow extends JFrame {

	private JLabel nameLabel = new JLabel("Name");
	private JTextField nameTextField = new JTextField(20);
	private JButton okButton = new JButton("OK");
	private List<Student> students = new ArrayList<>();
	
	
	public MainWindow(String title) throws HeadlessException {
		super(title);
		Student newStudent = new Student("Fred", "Aungier St.");
		students.add(newStudent);
		students.add(new Student("Abby", "Aungier St."));
		//String newName = "Fred";
		//names.add(newName);
		//names.add("Amy");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		//this.setLayout(new MigLayout("debug")); // will display grid
		//this.setLayout(new MigLayout("insets 15 30 30 30")); // will display outter space
		this.setSize(400, 200);
		//this.pack();
		this.setLocationRelativeTo(null);
		this.add(nameLabel);
		okButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				nameTextField.setText("Hi");
			}
		});
		okButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				nameTextField.setText("Hi");
			}
		});
		this.add(nameTextField, "wrap, grow");//wrap to next line and grow makes the text field larger
		this.add(okButton, "wrap paragraph, skip 1");//wrap to next line and move over 1 cell
		okButton.addActionListener(new ButtonListener2());
		okButton.addActionListener(new ButtonListener4(nameTextField));
		//okButton.addActionListener(new ButtonListener());
		okButton.addMouseListener(new ButtonListener());
		okButton.addMouseListener(new ButtonListener3());
		this.setVisible(true);	
	}
	
	class SomeName extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			nameTextField.setText("Hi");
		}
	}

	
	public static void main(String[] args) {
		MainWindow window = new MainWindow("Listeners");
	}
	
	//uncomment if wish to use okButton.addActionListener(new ButtonListener());
//	class ButtonListener implements ActionListener {
//		private int times;
//		private String[] ordinals = {"once", "twice", "thee times", "four times"};
//		
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			nameTextField.setText("Hi " + ordinals[times]);
//			times++;
//		}
//		
//	}
	
	//wrap = moves to next line
			//wrap paragraph = separates lines like a paragraph
			//span 1 = spans the size of 1 cell length
			//span 2 = spans the size of 2 cell lengths
			//skip 1 =
			//skip 2 =
			//split 1,2,3 etc = put the next 1,2,3 etc into the cell eg span 2, split 3   would put 3(next 2) adds into 2 cells
			//grow = grows or makes larger
			//growx = grows x axis
			//growy = grow y axis
			//tag ... = eg tag cancel (cancel button), tag ok (ok button)
			//instead of using setSize(x, y)  we can use this.pack() which makes it the length we 'just' need
}
