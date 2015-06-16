package bitcamp.ba.twentysixth.medina;

import java.util.Scanner;

public class Classroom {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input number for division: ");
		int num = in.nextInt();

		System.out.println("Even numbers lower than your number are: ");
		for (int i = 1; i < num; i++) {
			if (i % 2 == 0) {

				System.out.println(i);
			}

		}

		in.close();
	}

}
