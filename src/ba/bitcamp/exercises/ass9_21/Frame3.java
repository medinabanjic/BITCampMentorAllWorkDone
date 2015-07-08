package ba.bitcamp.exercises.ass9_21;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Frame3 extends JFrame {

	private static final long serialVersionUID = 1738510956516580701L;

	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();

	JLabel label1 = new JLabel("This seems to be a label 1");
	JLabel label2 = new JLabel("This seems to be a label 2");
	JLabel label3 = new JLabel("This seems to be a label 3");

	JButton button1 = new JButton("Button 1");
	JButton button2 = new JButton("Button 2");

	JTextArea text = new JTextArea("Text Area");

	public Frame3() {
		setLayout(new GridLayout(1, 2));
		setTitle("Frame 3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 400);
		setResizable(false);
		setVisible(true);

		add(panel1);
		panel1.setBorder(BorderFactory.createTitledBorder("Central panel"));
		panel1.setLayout(new BorderLayout());
		panel1.add(text);

		add(panel2);
		panel2.setBorder(BorderFactory.createTitledBorder("East panel"));
		panel2.setLayout(new GridLayout(2, 1));
		panel2.add(panel3);
		panel3.setLayout(new GridLayout(3, 1));
		panel3.setBorder(BorderFactory.createTitledBorder("Panel 1"));
		panel3.add(label1);
		panel3.add(label2);
		panel3.add(label3);

		panel2.add(panel4);
		panel4.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel4.setBorder(BorderFactory.createTitledBorder("Panel 2"));
		panel4.add(button1);
		panel4.add(button2);

	}

	public static void main(String[] args) {
		new Frame3();

	}

}
