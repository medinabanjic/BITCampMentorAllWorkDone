package ba.bitcamp.exercises.ass9_41;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class FilesCounter {

	private static LinkedBlockingQueue<Task> queue;
	private static Integer fileCounter = 0;
	private static Integer directoryCounter = 0;
	private static Object lock = new Object();
	private static ArrayList<Worker> workers;
	public static void main(String[] args) {
		queue = new LinkedBlockingQueue<>();
		
		Task t = new Task(new File("/Users/medina.banjic/Documents/workspace"));
		queue.add(t);
				
		workers = new ArrayList<>();
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < 4; i++) {
			Worker w = new Worker();
			w.start();
			workers.add(w);
		}

		for (Worker w : workers) {
			try {
				w.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Time [ms]: " + (System.currentTimeMillis() - t1));
		System.out.println("Files: " + fileCounter + ", directories: " + directoryCounter);
	}

	static class Task implements Runnable {
		private File f;

		public Task(File f) {
			this.f = f;
		}

		@Override
		public void run() {
			for (File f : f.listFiles()) {
				if (f.isFile() && !f.isHidden()) {
					synchronized (lock) {
						fileCounter++;
					}
				} else if (f.isDirectory() && !f.isHidden()) {
					synchronized (lock) {
						directoryCounter++;
						queue.add(new Task(f));
					}
					
				}
			}
		}
	}

	static class Worker extends Thread {
		@Override
		public void run() {
			while (!queue.isEmpty()) {
				try {
					Task t = queue.take();
					t.run();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
