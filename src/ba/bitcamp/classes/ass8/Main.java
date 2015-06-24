package ba.bitcamp.classes.ass8;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Main extends JFrame {

	JFrame window = new JFrame();
	private JLabel l1 = new JLabel("Hello World!");
	private JButton b1 = new JButton("Hello!");
	private JButton b2 = new JButton("OK");

	public Main() {
		setVisible(true);

		add(b1, BorderLayout.SOUTH);
		add(l1);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		setTitle("1a");
		setSize(250, 100);
		setLocation(700, 350);
		setDefaultCloseOperation(3);
		ButtonHandler listener = new ButtonHandler();
		ButtonHandler2 listener2 = new ButtonHandler2();
		b1.addActionListener(listener);
		b2.addActionListener(listener2);
	}

	public void ActionPerformed(ActionEvent e) {

		System.exit(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new Main();
	}

	public static class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			JOptionPane.showMessageDialog(null, "Hello!");

		}
	}

	public static class ButtonHandler2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			System.exit(EXIT_ON_CLOSE);

		}
	}
}
