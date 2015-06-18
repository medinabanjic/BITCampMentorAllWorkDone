package ba.bitcamp.exercises.ass9_11;

public class Main {
	public static void main(String[] args) {
		
		Workstation ws = new Workstation();
		ws.printTypeInfo();
		
		Laptop l = new Laptop();
		l.printTypeInfo();
		
		PocketPC ppc = new PocketPC();
		ppc.printTypeInfo();
		
		DesktopComputer dc = new DesktopComputer();
		dc.printTypeInfo();
	}

}
