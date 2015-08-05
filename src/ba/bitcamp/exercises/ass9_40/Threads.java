package ba.bitcamp.exercises.ass9_40;

public class Threads extends Thread {

	private static Integer counter = 0;

	@Override
	public void run() {
		
			for (int i = 0; i < 100; i++) {
				synchronized (counter) {
				counter += 10;
			}
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			Thread t1 = new Threads();
			Thread t2 = new Threads();
			t1.start();
			t2.start();
			try {
				t1.join();
				t2.join();
				System.out.println(counter);
				counter = 0;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
