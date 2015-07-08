package ba.bitcamp.exercises.ass9_20;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Borders extends JFrame {

	private static final long serialVersionUID = 1399176660953639707L;

	private MyPanel panel = new MyPanel();
	private int myX = 10;
	private int myY = 10;
	private int dx = 1;
	private int dy = 1;

	public Borders() {
		panel.setSize(400, 300);
		add(panel);

		Timer t = new Timer(10, new Action());
		t.start();

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
	public void checkCoordinates(int x, int y){
		if (getWidth() == myX || myX == 10){
			dx *= -1;
		}
		if (getHeight() == myY || myY == 10){
			dy *= -1;
		}
	}
	
	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		
			
			myX += dx;
			myY += dy;
			checkCoordinates(myX,myY);
			panel.repaint();
		}
	}

	public static void main(String[] args) {
		new Borders();
	}
}
