package ba.bitcamp.exercises.ass9_41;


import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.LinkedBlockingQueue;

public class Task02 {
	
	static LinkedBlockingQueue<Runnable> tasks;
	static ArrayList<Consumer> slaves;

	
	public static void main(String[] args){
		tasks = new LinkedBlockingQueue<>();
		// Produce the tasks and add them to the queue
		for (int i = 0; i < 10; i++) {
			tasks.add(new Producer());
		}
		
		// Make the consumers and let them consume
		slaves = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			Consumer s = new Consumer();
			s.start();
			slaves.add(s);
			
		}
			
	}

	private static class Producer extends Thread {
		
		
		
		@Override
		public void run() {
			
			tasks.add(new Calculate(10, 100000));
			tasks.add(new Calculate(100000, 200000));
			tasks.add(new Calculate(200000, 300000));
			tasks.add(new Calculate(300000, 400000));
			tasks.add(new Calculate(400000, 500000));
			tasks.add(new Calculate(500000, 600000));
			tasks.add(new Calculate(600000, 700000));
			tasks.add(new Calculate(700000, 800000));
			tasks.add(new Calculate(800000, 900000));
			tasks.add(new Calculate(900000, 1000000));
		}
	}

	private static class Consumer extends Thread {

		@Override
		public void run() {
			Thread t = null ;
			
			while(!tasks.isEmpty()){
				try {
					t = new Thread(tasks.take());
					Date start = new Date();
					t.start();
					t.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

		}
	}
	
	private static class Calculate implements Runnable{

		private int start;
		private int end;
		private int count;	
		private static Object o = new Object();
		private static int total = 0;
		
		public Calculate(int start, int end) {
			super();
			this.start = start;
			this.end = end;
			count = 0;
		}

		
		
		public void countPrimes() {
			for (int i = start; i < end; i++) {
				if (isPrime(i)) {
					synchronized(o){
						count++;
						}
				}
			}
		}

		private boolean isPrime(int number) {
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
		
		public static int getTotal(){
			return total;
		}


		@Override
		public void run() {
			countPrimes();
	
		}
	}
}
