package ba.bitcamp.exercises.ass9_27;

import java.util.Scanner;
import java.util.TreeSet;

public class LetterCount {

	public static void main(String[] args) {
		TreeSet<Character> tset = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter words: ");
		String input = "";

		while (true) {
			input = sc.nextLine();
			if (!input.equals("end")) {
				for (int i = 0; i < input.length(); i++) {
					tset.add(input.charAt(i));
				}
			} else {
				break;
			}
		}

		System.out.println(tset.size());

	}

}
