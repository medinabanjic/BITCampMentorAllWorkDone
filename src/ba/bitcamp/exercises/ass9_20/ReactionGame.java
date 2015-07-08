package ba.bitcamp.exercises.ass9_20;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class ReactionGame extends JFrame {

	private static final long serialVersionUID = -5366084903694990556L;
	private MyPanel panel = new MyPanel();
	private String text = "Get ready..";
	Timer t = new Timer((int) (Math.random() * 6000), new Action());
	private int started = 0;
	private int finished = 0;

	public ReactionGame() {
		panel.setSize(400, 300);
		add(panel);
		addKeyListener(new Key());
		t.start();

		setTitle("REACT");
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
			g.drawString(text, 100, 100);
		}
	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			t.stop();
			text = "Press any button";
			started = (int) System.currentTimeMillis();
			panel.repaint();
		}
	}

	private class Key implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyPressed(KeyEvent e) {
			finished = (int) (System.currentTimeMillis() - started);
			if (finished < 0) {
				text = "Too early!";
				panel.repaint();
				System.exit(0);
			} else {
				text = "You reacted in " + String.valueOf(finished)
						+ " milliseconds.";
				panel.repaint();
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

	}

	public static void main(String[] args) {
		new ReactionGame();
	}

}
