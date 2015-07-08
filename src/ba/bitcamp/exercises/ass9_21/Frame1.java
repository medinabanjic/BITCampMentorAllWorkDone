package ba.bitcamp.exercises.ass9_21;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Frame1 extends JFrame {

	private static final long serialVersionUID = -4686145454937943917L;

	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();

	JLabel label1 = new JLabel("Label 1");
	JLabel label2 = new JLabel("Label 2");

	JTextArea text = new JTextArea("Text Area");

	JButton[] buttons = new JButton[9];

	public Frame1() {
		setLayout(new BorderLayout());
		setTitle("Frame 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 400);
		setResizable(false);
		setVisible(true);

		add(panel1, BorderLayout.CENTER);
		panel1.setBorder(BorderFactory.createTitledBorder("Panel 1"));
		panel1.setLayout(new BorderLayout());
		panel1.add(label1, BorderLayout.SOUTH);
		panel1.add(label2, BorderLayout.NORTH);
		panel1.add(text, BorderLayout.CENTER);

		add(panel2, BorderLayout.EAST);
		panel2.setBorder(BorderFactory.createTitledBorder("Panel 2"));
		panel2.setLayout(new GridLayout(3, 3));
		for (int i = 0; i < 9; i++) {
			buttons[i] = new JButton("Button " + (i + 1));
			panel2.add(buttons[i]);
		}

	}

	public static void main(String[] args) {
		new Frame1();

	}

}
