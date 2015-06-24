package ba.bitcamp.exercises.ass9_13;

public class Main {

	public static void main(String[] args) {

		Drawable[] d = new Drawable[50];

		for (int i = 0; i < d.length; i ++) {
			if (i == 0 || i % 2 == 0) {
				d[i] = new Line((int) (Math.random() * 5 + 1));
			} else if (i != 0 && i % 2 != 0) {
				d[i] = new Rectangle((int) (Math.random() * 5 + 1),
						(int) (Math.random() * 5 + 1));
			}
			System.out.println();
			
			d[i].drawOnConsole();
			
			System.out.println();

		}
		
		
		
	}
}
