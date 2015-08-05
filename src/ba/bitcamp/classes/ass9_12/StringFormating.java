package ba.bitcamp.classes.ass9_12;

public class StringFormating {

	private static boolean stringCharactersSame(String s) {
		boolean areDifferent = true;
		char[] characters = new char[s.length()];
		for (int i = 0; i < characters.length; i++) {
			char letter = s.charAt(i);
			characters[i] = letter;
			for (int j = 0; j < i; j++) {
				if (letter == characters[j]) {
					areDifferent = false;
					break;
				}
			}

		}
		return areDifferent;
	}

	private static boolean stringCharactersSameBeta(String s) {
		boolean areDifferent = true;
		s.toLowerCase();
		char[] signs = new char[255];
		for (int i = 0; i < s.length(); i++) {
			signs[s.charAt(i)]++;
			if (signs[s.charAt(i)] > 1) {
				areDifferent = false;
				break;
			}
		}
		return areDifferent;
	}

	private static boolean stringsPerm(String s1, String s2) {
		boolean arePerm = true;
		char[] signs = new char[255];
		if (s1.length() != s2.length()) {
			arePerm = false;
		} else {
			for (int i = 0; i < s1.length(); i++) {
				signs[s1.charAt(i)]++;
			}

			for (int i = 0; i < s2.length(); i++) {
				signs[s2.charAt(i)]--;
			}
			for (int i = 0; i < signs.length; i++) {
				if (signs[i] != 0) {
					arePerm = false;
					break;
				}
			}
		}
		return arePerm;
	}
	
	
	private static boolean isSubstring(String s1, String s2){
		s1 +=  s1;
		return s1.indexOf(s2) > -1;
	}

	public static void main(String[] args) {
		System.out.println(stringCharactersSame("golub"));
		System.out.println(stringCharactersSameBeta("golub"));
		System.out.println(stringsPerm("abccd", "bccad"));
		System.out.println(isSubstring("najad", "dna"));
	}

}
