package ba.bitcamp.exercises.ass9_27;

import java.util.Scanner;
import java.util.TreeSet;

public class CountWords2 {

	public static void main(String[] args) {
		TreeSet<String> tset = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter words: ");
		String input = "";
		int counter = 0;
		while (true) {
			input = sc.nextLine();
			if (!input.equals("end")) {
				counter++;
				tset.add(input);
				

			} else {
				break;
			}
		}

		System.out.println(tset.size());
		System.out.println(counter - tset.size() + 1);
		System.out.println(counter);

	}

}
