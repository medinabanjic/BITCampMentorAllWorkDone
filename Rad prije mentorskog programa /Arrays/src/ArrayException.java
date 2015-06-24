import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		try {

			int K = 0;
			int N = 0;
			System.out.println("How long do You want your array to be? ");

			N = in.nextInt();

			int[] array = new int[N];

			System.out.println("How many times do You want to input? ");

			K = in.nextInt();

			for (int i = 0; i < K; i++) {
				System.out.println("Please input array index: ");
				int idx = in.nextInt();
				System.out.println("Please input the value: ");
				int value = in.nextInt();

				array[idx] = value;
			}

			for (int values : array) {
				System.out.println(values);
			}
		} catch (Exception e) {
			if (e instanceof IllegalArgumentException) {

				System.out
						.println("I know only that this is Illegal Argument Exception!");

			} else if (e instanceof ArrayIndexOutOfBoundsException) {

				System.out
						.println("Your index is not in a range of size of array.");
			}

			else if (e instanceof InputMismatchException) {

				System.out.println("Wrong input.");
			}

		}

		in.close();

	}

}
