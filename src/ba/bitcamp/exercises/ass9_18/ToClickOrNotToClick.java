package ba.bitcamp.exercises.ass9_18;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ToClickOrNotToClick extends JFrame {

	private static final long serialVersionUID = 2092431948234658766L;

	private JLabel label = new JLabel();
	private Font font1 = new Font("Monospaced", Font.PLAIN, 30);
	private Font font2 = new Font("Monospaced", Font.BOLD, 35);

	public ToClickOrNotToClick() {
		setLayout(new BorderLayout());
		add(label);

		label.setFont(font1);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.addMouseListener(new Mouse());
		label.setText("Not Clicked");

		setSize(400, 300);
		setLocationRelativeTo(null);
		setTitle("HamletProgramming");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ToClickOrNotToClick();

	}

	public class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			label.setText("It is Clicked");
			label.setFont(font2);

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}
	}
}
