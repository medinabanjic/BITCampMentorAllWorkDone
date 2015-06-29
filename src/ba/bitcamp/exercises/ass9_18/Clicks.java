package ba.bitcamp.exercises.ass9_18;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Clicks extends JFrame {

	private static final long serialVersionUID = 5524055943827277004L;

	private JLabel label = new JLabel();
	private Color activeColor = Color.DARK_GRAY;
	private Font font1 = new Font("Monospaced", Font.PLAIN, 30);
	private Font font2 = new Font("Monospaced", Font.BOLD, 35);

	public Clicks() {
		setLayout(new BorderLayout());
		add(label);

		label.setFont(font1);
		label.setForeground(activeColor);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.addMouseListener(new Mouse());
		label.setText("Click!");

		setSize(400, 300);
		setLocationRelativeTo(null);
		setTitle("Clicks");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {

		}

		@Override
		public void mousePressed(MouseEvent e) {
			label.setFont(font2);

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			label.setFont(font1);

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			activeColor = Color.WHITE;
			label.setForeground(activeColor);

		}

		@Override
		public void mouseExited(MouseEvent e) {
			activeColor = Color.DARK_GRAY;
			label.setForeground(activeColor);

		}
	}

	public static void main(String[] args) {
		new Clicks();
	}

}
