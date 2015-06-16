package bitcamp.ba.twentysixth.medina;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Input side: ");
		int n = in.nextInt();
		System.out.println("Input side: ");
		int m = in.nextInt();
		
		for (int i = 1; i <= n; i++) {

			if (i == 1 || i == n) {
				System.out.print("+");
			} else {
				System.out.print("|");
			}

			for (int j = 1; j <= m; j++) {

				if (i > 1 && i < n && j <= m ) {
					System.out.print(" ");
				}

				else {
					System.out.print("-");
				}
				if (i > 1 && i < n && j == m) {
					System.out.println("|");
				} else if (j == m) {
					System.out.println("+");
				}

			}
			// System.out.println("+");
		}

		in.close();
	}

}
