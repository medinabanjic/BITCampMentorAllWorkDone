package ba.bitcamp.exercises.ass9_18;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Diagonals2 extends JFrame {

	private static final long serialVersionUID = -8829792715997243899L;

	private JPanel panel = new MyPanel();
	private Color chosenColor = Color.BLACK;

	public Diagonals2() {
		setLayout(new BorderLayout());
		panel.setBackground(Color.WHITE);
		add(panel);
		panel.addMouseListener(new Mouse());
		setTitle("Diagonals");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			if (e.getSource() == panel) {
				chosenColor = Color.BLACK;
				panel.repaint();
			}

		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (e.getSource() == panel) {
				chosenColor = Color.WHITE;
				panel.repaint();
			}

		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

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
		new Diagonals2();

	}

}
