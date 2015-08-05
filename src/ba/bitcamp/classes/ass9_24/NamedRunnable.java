package ba.bitcamp.classes.ass9_24;

public class NamedRunnable implements Runnable {

	private String name;

	public NamedRunnable(String name) {
		super();
		this.name = name;
	}

	public static void main(String[] args) {
		NamedRunnable r1 = new NamedRunnable("Ross");
		NamedRunnable r2 = new NamedRunnable("Rachel");
		NamedRunnable r3 = new NamedRunnable("Joey");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
			System.out.println("End of main");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + " counted to " + i);
		}
	}
}
