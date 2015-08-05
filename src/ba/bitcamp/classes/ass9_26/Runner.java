package ba.bitcamp.classes.ass9_26;

import java.util.Date;

import ba.bitcamp.exercises.ass9_41.Task02;

public class Runner {

	public static void main(String[] args) {
		//BlockingQueueExample.startExample();
		//LatchExample.startExample();
		//ExecutorExample.runExample();
		//CallableExample.runExample();
		Date start = new Date();
	
	
		Date end = new Date();
		long timeLapse = (end.getTime() - start.getTime()) / 1000;
		System.out.println("Time (s): " + timeLapse);
		
	}

}
