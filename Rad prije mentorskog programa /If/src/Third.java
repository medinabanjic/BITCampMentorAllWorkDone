import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input number: ");
		int n = in.nextInt();

		int sum = 0;

		System.out.println("The number 1 is perfect.");
		
		for (int j = 2; j <= n; j++) {

			for (int i = 1; i < j; i++) {

				if (j % i == 0) {
					sum = sum + i;
				}
				if (sum == j) {

					System.out.printf("The number %d is perfect.", j);
				} 
			}

			in.close();
		}

	}
}
