package ba.bitcamp.exercises.ass9_39;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ServerGui extends JFrame {

	private static final long serialVersionUID = 4344989888803834932L;

	JPanel panel = new JPanel();
	JLabel[][] labels = new JLabel[20][20];
	private int X = 0;
	private int Y = 0;
	private ServerSocket server = null;
	private Socket client = null;
	BufferedReader br = null;

	public ServerGui() {

		try {
			server = new ServerSocket(1993);
			client = server.accept();
			br = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
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
				if (i == X && j == Y) {
					labels[X][Y].setBackground(Color.CYAN);
				}

			}
		}

		char acction = ' ';

		while (true) {
			try {
				acction = br.readLine().charAt(0);
				int key = acction;

				if (key == KeyEvent.VK_D) {

					if (Y < labels[X].length - 1) {
						labels[X][Y].setBackground(Color.BLACK);
						Y += 1;
						labels[X][Y].setBackground(Color.CYAN);

					}
				}

				else if (key == KeyEvent.VK_A) {
					if (Y > 0) {
						labels[X][Y].setBackground(Color.BLACK);
						Y -= 1;
						labels[X][Y].setBackground(Color.CYAN);

					}

				} else if (key == KeyEvent.VK_W) {
					if (X > 0) {
						labels[X][Y].setBackground(Color.BLACK);
						X -= 1;
						labels[X][Y].setBackground(Color.CYAN);

					}

				} else if (key == KeyEvent.VK_S) {
					if (X < labels.length - 1) {
						labels[X][Y].setBackground(Color.BLACK);
						X += 1;
						labels[X][Y].setBackground(Color.CYAN);

					}

				}

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			setVisible(true);

		}
	}

	public static void main(String[] args) {
		new ServerGui();
	}

}
