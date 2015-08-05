package ba.bitcamp.classes.ass9_16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Place start = null;
		Place last = null;

		while (true) {
			System.out
					.println("If you want to finish please enter 0, any other number to continue:");
			int q = sc.nextInt();

			if (q != 0) {
				Place newNode = Place.newPlace();

				if (start == null && last == null) {
					start = newNode;
					last = newNode;
				} else {
					last.setNext(newNode);
					last = newNode;

				}

			} else {
				break;
			}
		}

		Trip trip = new Trip(start);
		trip.setLast(last);

		System.out.print(trip.toString());
	}
}
