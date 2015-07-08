package ba.bitcamp.exercises.ass9_20;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Typewriter extends JFrame {

	private static final long serialVersionUID = 3926689394700855624L;
	private String text = "";
	Font font = new Font("Sans Serif", Font.PLAIN, 35);
	JPanel panel = new MyPanel();
	private int counter = 0;

	public Typewriter() {
		add(panel);
		addKeyListener(new Key());
		setTitle("Editor");
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

			g2d.setColor(Color.BLACK);
			g2d.setFont(font);
			g2d.drawString(text, 50, 100);
		}
	}

	public static void main(String[] args) {
		new Typewriter();
	}

	private class Key implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			counter++;
			if (counter == 1) {
				if (text.length() > 0) {
					text = text.substring(0, text.length() - 1);
				}
			} else {
				if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			
				if (text.length() > 0) {
					text = text.substring(0, text.length() - 2);
					}
				}
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			panel.repaint();
		}

		@Override
		public void keyTyped(KeyEvent e) {

			text += e.getKeyChar();
			panel.repaint();

		}
	}

}
