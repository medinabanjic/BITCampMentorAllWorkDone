package ba.bitcamp.exercises.ass9_40;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BackComp extends JFrame implements Runnable{

	private static final long serialVersionUID = -142861769687878635L;

	private JLabel label = new JLabel();
	private JButton button = new JButton("START");
	private String msg = "";

	public BackComp() {

		JLabel label = new JLabel();

		setLayout(new BorderLayout());

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Date s = new Date();
				Thread t1 = new Threads(1,1000000);
				Thread t = new Thread(t1);
				t.start();
				
				
				try {
					t.join();
					label.setText(msg);
					Date end = new Date();
					long timeLapse = (end.getTime() - s.getTime()) / 1000;
					System.out.println("Time (s): " + timeLapse);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				//button.setEnabled(false);

			}
		});

		add(label);
		add(button, BorderLayout.SOUTH);

		setTitle("Computing");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		
	}
	

	private static class Threads extends Thread {
		
		private static Object o = new Object();
		private int start = 0;
		private int end = 0;
		private static int count;

		public Threads(int start, int end) {
			this.start = start;
			this.end = end;
		}

		public  void countPrimes() {
			for (int i = start; i < end; i++) {
				if (isPrime(i)) {
					synchronized (o) {
						count++;
					}
				}
			}
		}

		private  boolean isPrime(int number) {
			for (int i = 2; i < number / 2; i++) {
				if (number % i == 0) {
					return false;
				}
			}
			return true;
		}

		public int getCount() {
			return count;
		}
		
		@Override
		public void run() {
			countPrimes();
		}
	}
	
	
	public static void main(String[] args) {
		new BackComp();
	}


	@Override
	public void run() {
		Threads[] counters = new Threads[6];
		int endInterval = 10000;
		int step = endInterval / counters.length;

		for (int i = 0; i < counters.length; i++) {
			counters[i] = new Threads(i * step, (i + 1) * step);
			counters[i].start();
		}

		for (int i = 0; i < counters.length; i++) {
			try {
				counters[i].join();

			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("Primes count: " + counters[0].getCount());

	}
	
}
