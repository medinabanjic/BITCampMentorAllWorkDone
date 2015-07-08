package ba.bitcamp.exercises.ass9_22;

import java.util.Arrays;

public class Repetitions {

	private static int[] reorder(int... params) {
		int[] num = new int[params.length];
		int i = 0;
		int j = 0;

		for (int value : params) {
			if (i > (int) (Math.floor(params.length / 2))) {
				if (params[j] % 2 != 0) {
					num[i] = params[j];
					i++;
					j++;
				} else {
					j++;
					num[i] = params[j];
					i++;
				}
			}
			if (params[j] % 2 == 0) {
				num[i] = params[j];
				i++;
				j++;
			} else {
				j++;
				num[i] = params[j];
				i++;
			}
		}
		return num;
	}

	private static int getRepetitions(int num, int... params) {
		int counter = 0;
		for (int i = 0; i < params.length; i++) {
			if (num == params[i]) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		System.out.println(getRepetitions(5, 1, 5, 6, 8, 4, 5));
		System.out.println(Arrays.toString(reorder(2, 5, 8, 1, 5)));
	}

}
