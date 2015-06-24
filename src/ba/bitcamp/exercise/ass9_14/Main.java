package ba.bitcamp.exercise.ass9_14;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String word = "golub";
		String s = "golubica";
		
		char[] letters = new char[word.length()];
		

		for (int i = 0; i < word.length(); i++) {
			letters[i] = word.charAt(i);
		}

		CampStringBuilder cs = new CampStringBuilder(letters);
		
		cs.prepend(s);
		System.out.println(cs);
	

	}
}
