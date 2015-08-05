package ba.bitcamp.exercises.ass9_40;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SMT extends JFrame {

	private static final long serialVersionUID = 7723950306064347973L;

	JPanel panel = new JPanel();
	JButton bAdd = new JButton("ADD");
	JButton bStop = new JButton("STOP");
	ArrayList<Thread> list = new ArrayList<>();

	public SMT() {

		setLayout(new FlowLayout());

		add(bAdd);
		bAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Thread tr = new Threads();
				tr.start();
				list.add(tr);
			}
		});
		add(bStop);
		bStop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < list.size(); i++) {
					Threads t = (Threads) list.get(i);
					t.setRuns(false);
					
					try {
						t.sleep(500);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println(list.get(i).isAlive());
				}

			}
		});

		setTitle("1 2 3");
		setSize(200, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	private static class Threads extends Thread {

		private static boolean runs = true;

		@Override
		public void run() {
			try {
				for (int i = 1; i < 101; i++) {

					while (!runs) {
						Thread.yield();
					}
					System.out.println(i);
					Thread.sleep(200);
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		public static void setRuns(boolean b) {
			runs = b;
		}
	}

	public static void main(String[] args) {
		new SMT();
	}

}
