package ba.bitcamp.classes.ass6;

import java.util.Scanner;

public class PogodiBroj {

	private int maxBroj;
	private int maxBrojPogadjanja;

	public PogodiBroj(int maxBroj, int maxBrojPogadjanja) {
		super();
		this.maxBroj = maxBroj;
		this.maxBrojPogadjanja = maxBrojPogadjanja;
	}

	public PogodiBroj(int maxBroj) {
		this(maxBroj, maxBroj / 100 + 1);
	}

	public PogodiBroj() {
		this(1000, 10);
	}

	public void igraj() {
		Scanner in = new Scanner(System.in);
		int zamisljenBroj = (int) (Math.random() * maxBroj);
		int counter = 0;
		while (true) {

			System.out.println("Upisi jedan broj do 100: ");
			int broj = in.nextInt();
			counter++;

			if (zamisljenBroj == broj) {
				System.out.println("Pogodili ste!");
				break;
			} else if (zamisljenBroj > broj) {
				System.out.println("Treba Vam veci broj!");
				if (counter == maxBrojPogadjanja) {
					System.out.println("Niste uspjeli.");
					break;
				}
			} else if (zamisljenBroj < broj) {
				System.out.println("Treba Vam manji broj!");
				if (counter == maxBrojPogadjanja) {
					System.out.println("Niste uspjeli.");
					break;
				}
			}
		}

		in.close();
	}

}
