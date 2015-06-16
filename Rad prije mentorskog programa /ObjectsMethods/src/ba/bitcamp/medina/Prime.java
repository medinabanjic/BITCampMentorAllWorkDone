package ba.bitcamp.medina;

import java.util.Scanner;

public class Prime {

	public void prime(int a) {
		
		boolean isPrime = true;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				isPrime = false;

				if (isPrime == true) {
					System.out.println("The number is prime.");
				} else {
					System.out.println("The number is not a prime.");
				}
			}
		}

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Integer n = in.nextInt();
		
		n = n.prime();
		

	}

}
