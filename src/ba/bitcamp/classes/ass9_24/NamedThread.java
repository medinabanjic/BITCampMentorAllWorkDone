package ba.bitcamp.classes.ass9_24;

public class NamedThread extends Thread{

	private String name;

	public NamedThread(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++){
			System.out.println(name + " counted to " + i);
		}
		
		super.run();
	}
	
	public static void main(String[] args) {
		NamedThread t1 = new NamedThread("Ross");
		NamedThread t2 = new NamedThread("Rachel");
		NamedThread t3 = new NamedThread("Joey");
		
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
	
}
