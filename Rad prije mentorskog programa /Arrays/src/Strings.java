import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Please input one String: ");

		String something = in.nextLine();

		int length = something.length();

		char[] array = new char[length];
		char[] array2 = new char[length];
		int j = length - 1;

		for (int i = 0; i < length; i++) {

			char letter = something.charAt(i);
			array[i] = letter;

			array2[j] = letter;
			j--;
		}

		for (char value : array2) {

			System.out.println(value);
		}

		in.close();

	}

}
