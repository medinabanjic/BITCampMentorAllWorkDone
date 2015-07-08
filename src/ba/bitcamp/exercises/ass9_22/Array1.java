package ba.bitcamp.exercises.ass9_22;

public class Array1 {

	public static void main(String[] args) {
		char[] letters = new char[] { 'A', 'b', 'r', 'Y', 'Z' };
		String word = "";
		for (int j = 0; j < letters.length; j++) {
			for (int i = 65; i < 91; i++) {

				if (letters[j] == i){
					word += letters[j];
				}
			}
		}
		System.out.println(word);
	}

}
