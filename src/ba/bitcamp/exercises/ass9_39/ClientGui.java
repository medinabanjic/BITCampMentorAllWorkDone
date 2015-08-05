package ba.bitcamp.exercises.ass9_39;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClientGui extends JFrame {

	private static final long serialVersionUID = 4344989888803834932L;

	JPanel panel = new JPanel();
	JLabel[][] labels = new JLabel[20][20];
	private int X = 0;
	private int Y = 0;
	private Socket socket = null;
	BufferedWriter bw = null;
	

	public ClientGui() {
		
		try {
			socket = new Socket("10.0.82.15", 8000);
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

		
		
		setLayout(new BorderLayout());
		setTitle("Walking Square");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setResizable(false);

		add(panel);
		panel.setLayout(new GridLayout(20, 20));

		for (int i = 0; i < labels.length; i++) {
			for (int j = 0; j < labels[i].length; j++) {
				labels[i][j] = new JLabel();
				panel.add(labels[i][j]);
				labels[i][j].setOpaque(true);
				labels[i][j].setBackground(Color.BLACK);
				if(i == X && j == Y) {
					labels[X][Y].setBackground(Color.CYAN);
				}
				
			}
		}
		
		addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				
				try {
					bw.write(e.getKeyCode());
					bw.newLine();
					bw.flush();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				if (e.getKeyCode() == KeyEvent.VK_D) {

					if (Y < labels[X].length - 1) {
						labels[X][Y].setBackground(Color.BLACK);
						Y += 1;
						labels[X][Y].setBackground(Color.CYAN);

					}
				}

				else if (e.getKeyCode() == KeyEvent.VK_A) {
					if (Y > 0) {
						labels[X][Y].setBackground(Color.BLACK);
						Y -= 1;
						labels[X][Y].setBackground(Color.CYAN);

					}

				} else if (e.getKeyCode() == KeyEvent.VK_W) {
					if (X > 0) {
						labels[X][Y].setBackground(Color.BLACK);
						X -= 1;
						labels[X][Y].setBackground(Color.CYAN);

					}

				} else if (e.getKeyCode() == KeyEvent.VK_S) {
					if (X < labels.length - 1) {
						labels[X][Y].setBackground(Color.BLACK);
						X += 1;
						labels[X][Y].setBackground(Color.CYAN);

					}

				}


			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

		setVisible(true);
	}

	public static void main(String[] args) {
		new ClientGui();
	}

}
