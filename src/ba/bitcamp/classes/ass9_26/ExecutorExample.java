package ba.bitcamp.classes.ass9_26;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

	public static void runExample() {
		ExecutorService es = Executors.newFixedThreadPool(5);
		es.submit(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
					System.out.println("Prvi Task");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		es.submit(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Drugi Task");
			}
		});
		
		es.shutdown();
	}

	
	
}
