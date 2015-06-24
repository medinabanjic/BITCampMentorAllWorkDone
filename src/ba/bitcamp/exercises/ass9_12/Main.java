package ba.bitcamp.exercises.ass9_12;

public class Main {

	public static void main(String[] args) {
		Tigar t = new Tigar(100.0, 50, Tigar.HUNTS);
		Zebra z = new Zebra(0, 0, 0);
		t.eat(z);
	}

}
