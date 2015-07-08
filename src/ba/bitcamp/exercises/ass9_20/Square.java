package ba.bitcamp.exercises.ass9_20;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Square extends JFrame {

	private static final long serialVersionUID = -4330635408322671716L;

	private MyPanel panel = new MyPanel();
	private int myX = 10;
	private int myY = 10;
	private int dx = 10;
	private int dy = 10;

	public Square() {
		panel.setSize(100, 100);
		add(panel);
		addKeyListener(new Key());
		setTitle("Borders");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private class MyPanel extends JPanel {
		private static final long serialVersionUID = 8281156269736697513L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.setColor(Color.BLACK);
			g.fillRect(myX, myY, 20, 30);
		}
	}

	private class Key implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				if (myX > 9) {
					myX -= dx;
				} else {
					myX = 10;
				}
				panel.repaint();
			} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				if (myX < getWidth()) {
					myX += dx;
				} else {
					myX = getWidth();
				}
				panel.repaint();

			} else if (e.getKeyCode() == KeyEvent.VK_UP) {
				if (myY > 9) {
					myY -= dy;
				} else {
					myY = 10;
				}
				panel.repaint();
			} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				if (myY < getHeight()) {
					myY += dy;
				} else {
					myY = getHeight();
				}
				panel.repaint();
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {

		}

		@Override
		public void keyTyped(KeyEvent e) {
		}
	}

	public static void main(String[] args) {
		new Square();
	}
}
