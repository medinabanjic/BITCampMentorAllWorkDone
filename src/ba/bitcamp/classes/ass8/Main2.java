package ba.bitcamp.classes.ass8;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Main2 extends JFrame {

	JFrame window = new JFrame();
	private JLabel l1 = new JLabel("Choose one");
	private JButton b1 = new JButton("Do not exit");
	private JButton b2 = new JButton("Exit");

	public Main2() {

		setVisible(true);

		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.SOUTH);
		add(l1);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		setTitle("2");
		setSize(300, 200);
		setLocation(700, 350);
		setDefaultCloseOperation(3);
		b1.addActionListener(new BH());
		b2.addActionListener(new BH());
	}

	public void ActionPerformed(ActionEvent e) {

		System.exit(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new Main2();
	}

	public class BH implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == b1) {
				l1.setText("It does not exit!");
			} else {
				System.exit(EXIT_ON_CLOSE);
			}
		}
	}

}
