package bitcamp.ba.twentysixth.medina;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input number for division: ");
		int num1 = in.nextInt();

		// int num2 = in.nextInt();

		// System.out.println("The lowest number which divide them is: ");

		boolean isPrime = true;

		for (int i = 1; i <= num1; i++) {
			
			isPrime= true;

			for (int j = 2; i > j; j++) {

				if (i % j == 0) {

					isPrime = false;
					
					break;
				}
			}

						
			if (isPrime == true) {
				System.out.println(i);
			}

		}

		in.close();

	}

}
