package ba.bitcamp.exercises.ass9_21;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame2 extends JFrame {

	private static final long serialVersionUID = -1733247856289595039L;

	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	
	JLabel label1 = new JLabel("Label 1");
	JLabel label2 = new JLabel("Label 2");
	JLabel label3 = new JLabel("Label 3");
	JLabel label4 = new JLabel("Label 4");
	JLabel label5 = new JLabel("Label 1");

	
	JButton button1 = new JButton("Button 1");
	JButton button2 = new JButton("Button 2");
	JButton button3 = new JButton("Button 3");
	JButton button4 = new JButton("Button 4");
	JButton button5 = new JButton("Button 1");
	

	public Frame2() {
		setLayout(new BorderLayout());
		setTitle("Frame 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 400);
		setResizable(false);
		setVisible(true);
		
		add(panel1, BorderLayout.CENTER);
		panel1.setBorder(BorderFactory.createTitledBorder("Central panel"));
		panel1.setLayout(new GridLayout(4, 2));
		panel1.add(label1);
		panel1.add(button1);
		panel1.add(label2);
		panel1.add(button2);
		panel1.add(label3);
		panel1.add(button3);
		panel1.add(label4);
		panel1.add(button4);
		
		
		add(panel2, BorderLayout.SOUTH);
		panel2.setBorder(BorderFactory.createTitledBorder("South panel"));
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel2.add(label5);
		panel2.add(button5);

	}

	public static void main(String[] args) {
		new Frame2();
	}

}
