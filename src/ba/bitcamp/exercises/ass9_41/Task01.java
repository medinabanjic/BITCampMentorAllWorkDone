package ba.bitcamp.exercises.ass9_41;

import java.util.Date;



public class Task01 extends Thread{
	
	private int count = 0;
		
	public void countPrimes() {
		for (int i = 10; i <= 1000000; i++) {
			if (isPrime(i)) {
				count++;
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
		
		Thread t = new Task01();
		
		t.start();

			try {
				t.join();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println("Primes count: " + ((Task01) t).getCount());	
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
