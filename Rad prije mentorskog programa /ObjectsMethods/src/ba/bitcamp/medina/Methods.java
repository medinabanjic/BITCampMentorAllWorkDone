package ba.bitcamp.medina;

import java.util.Scanner;

public class Methods {

	public static int getMax(int a, int b) {
		if (a > b) {
			return a;
		}

		else {
			return b;
		}
	}

	public static String getExtension(String filename) {

		String fileName = " ";
		String invert = "";

		for (int i = filename.length() - 1; i > 0; i--) {
			char reader = filename.charAt(i);
			if (reader == '.') {
				break;
			} else {
				fileName += reader;
			}
		}

		for (int e = fileName.length() - 1; e >= 0; e--) {
			char reader3 = fileName.charAt(e);
			invert += reader3;
		}

		return "." + invert;
	}

	public static boolean canBeBinary(int num) {

		boolean canBe = true;
		while (num != 0) {

			int digit = num % 10;
			num = num / 10;

			if (digit > 1 || digit <= -1) {

				canBe = false;
				break;

			}

		}
		return canBe;
	}

	public static int getRandomNumber(int min, int max) {

		int a = 0;

		if (min > max) {

			a = -1;
		}

		for (int i = min; i <= max; i++) {

			a = (int) (Math.random() * max + min);
			break;
		}

		return a;
	}

	public static String getType(String value) {
		int i = 1;

		String message = "";
		while (i > 0)

			try {
				if (i == 1) {
					int a = Integer.parseInt(value);
					message = "integer";

					break;
				} else if (i == 2) {
					double b = Double.parseDouble(value);
					message = "double";

					break;
				} else if (i == 3) {
					boolean c = Boolean.parseBoolean(value);

					if (c == true) {
						message = "boolean";

						break;
					} else {
						i++;
					}
				}

				else if (i == 4) {
					int length = value.length();
					if (length <= 1) {
						message = "char";

						break;
					} else {
						message = "String";

						break;
					}
				}

			} catch (Exception e) {

				i++;
			}

		return message;

	}

	public static String fixSentence(String sentence) {

		int length = sentence.length();
		String corrected = "";

		String initLetter = "";

		char fLetter = ' ';

		fLetter = sentence.charAt(0);
		initLetter = Character.toString(fLetter);

		char point = sentence.charAt(length - 1);
		if (point != '.') {

			sentence = sentence + ".";
		}

		corrected = initLetter.toUpperCase()
				+ sentence.substring(1, length + 1);

		return corrected;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		System.out.println("Input sentence: ");
		String R = in.nextLine();

		System.out.println("Input file name: ");
		String F = in.nextLine();

		System.out.println("Input one String: ");
		String S = in.nextLine();

		System.out.println("Input integer number: ");
		int B = in.nextInt();

		R = fixSentence(R);

		if (getExtension(F) != ".txt") {
			F = F + ".txt";
		}

		String type = getType(S);

		if (type.equals("boolean")) {

			TextIO.writeFile(F);

			if (canBeBinary(B) == true) {

				TextIO.putln(B);
			}

			else {

				TextIO.putln(getRandomNumber(B / 2, B));
			}

		} else if (type.equals("integer")) {

			TextIO.writeFile(F);

			if (canBeBinary(B) == true) {

				TextIO.putln(B);
			}

			else {

				int s = Integer.parseInt(S);
				TextIO.putln(getMax(B, s));
			}
		}

		else if (type.equals("String")) {

			TextIO.writeFile(F);

			int P = getRandomNumber(1, B);

			for (int i = 0; i < P; i++) {
				TextIO.putln(B);
			}

			
			TextIO.writeFile(S + ".txt");
			TextIO.putln(R);
		}
		
		System.out.println(F);
		System.out.println(R);
		

		in.close();
	}
}
