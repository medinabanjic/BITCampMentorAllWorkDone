package ba.bitcamp.classes.ass9_26;

import java.util.concurrent.CountDownLatch;

public class LatchExample {
	
	private static CountDownLatch latch = new CountDownLatch(3);
	
	public static void startExample(){
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					latch.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("The awaiting thread can work.");
			}
		}).start();
		latch.countDown();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		latch.countDown();
		latch.countDown();
	}
}
