package ba.bitcamp.classes.ass9_24;

import java.util.Date;

public class PrimeCounter extends Thread{
	private static Object o = new Object();
	private int start;
	private int end;
	private static int count;

	public PrimeCounter(int start, int end) {
		super();
		this.start = start;
		this.end = end;
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
	
	public static void main(String[] args) {
		Date start = new Date();
		
		PrimeCounter[] counters = new PrimeCounter[15];
		int startInterval = 1, endInterval = 1000000;
		int step = endInterval / counters.length;
		
		for(int i = 0; i < counters.length; i++){
			counters[i] = new PrimeCounter(i*step, (i+1)*step);
			counters[i].start();
		}
		
		for(int i = 0; i < counters.length; i++){
			try {
				counters[i].join();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Primes count: " + counters[0].getCount());	
		Date end = new Date();
		long timeLapse = (end.getTime() - start.getTime()) / 1000;
		System.out.println("Time (s): " + timeLapse);
	}
	
	@Override
	public void run() {
		countPrimes();
		super.run();
	}

}
