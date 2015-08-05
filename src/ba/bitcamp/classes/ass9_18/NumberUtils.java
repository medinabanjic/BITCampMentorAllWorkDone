package ba.bitcamp.classes.ass9_18;

public class NumberUtils {

	public static int max(int... numbers) {
		int temp = 0;
		for (int i = 0; i < numbers.length; i++) {

			if (temp < numbers[i]) {
				temp = numbers[i];
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		System.out.println(max(5, 2, 8, 6, 1, 14, 5));

	}

}
