package ba.bitcamp.exercises.ass9_18;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WCC extends JFrame{

	
	private static final long serialVersionUID = -421726001447066656L;
	
	private JPanel panel = new MyPanel();
	private Color chosenColor = Color.BLACK;
	private String s = "";
	
	public WCC() {
		setLayout(new BorderLayout());
		add(panel);		
		panel.addMouseListener(new Mouse());
		setTitle("Which click clicked");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private class Mouse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			int button = e.getButton();
			if (button == 1){
				s = "Last pressed: Left";
			} else if (button == 2){
				s = "Last pressed: Middle";
			} else {
				s = "Last pressed: Right";
			}
			
			

		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
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
			
			g.setColor(chosenColor);
			g.drawString(s, 100, 100);
		}
	}
	
	public static void main(String[] args) {
		new WCC();

	}

}
