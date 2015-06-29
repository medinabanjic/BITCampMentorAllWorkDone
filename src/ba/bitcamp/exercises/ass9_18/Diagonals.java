package ba.bitcamp.exercises.ass9_18;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Diagonals extends JFrame {

	private static final long serialVersionUID = 2112823951500769139L;

	private JPanel panel = new MyPanel();
	private Color chosenColor = Color.BLACK;

	public Diagonals() {
		setLayout(new BorderLayout());
		add(panel);

		setTitle("Diagonals");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	
		private class MyPanel extends JPanel {
			private static final long serialVersionUID = -6302911398550823044L;

			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;

				g2d.setColor(chosenColor);
				g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
						RenderingHints.VALUE_ANTIALIAS_ON);
				g2d.setStroke(new BasicStroke(10));

				g2d.drawLine(0, 0, 400, 400);
				g2d.drawLine(400, 0, 0, 400);
			}
		}
	

	public static void main(String[] args) {
		new Diagonals();

	}

}
