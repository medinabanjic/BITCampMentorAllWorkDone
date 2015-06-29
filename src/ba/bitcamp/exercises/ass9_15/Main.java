package ba.bitcamp.exercises.ass9_15;

import java.util.Arrays;

public class Main {

	private static int counter = 0;
	private static int sum = 0;
	private static int x = 1;

	public static void main(String[] args) {
		// print("Cersei", 3);
		// printEverySecondNumber(10);
		// System.out.println(getSum(100));
		// System.out.println(getFibonacciNumber(6));
		// int[] arr = { 1, 3, 4, 2, 5 };
		// int[] arr1 = { 1, 3, 4, 2, 2 };
		// int n = 7;
		// System.out.println(isInArray(arr, n));
		// System.out.println(areTheSame(arr, arr1));
		int[] arr = new int[10];
		fillArray2(arr, 1);
		System.out.println(Arrays.toString(arr));

	}

	private static void print(String string, int i) {
		System.out.println("Cersei");
		counter++;

		if (counter == i) {
			return;
		} else {
			print("Cersei", i);
		}

	}

	private static void printEverySecondNumber(int n) {
		System.out.println(n);
		n -= 2;
		if (n <= 1) {
			return;
		} else {
			printEverySecondNumber(n);
		}

	}

	private static int getSum(int n) {
		sum += x;
		x++;
		if (x <= n) {
			getSum(n);
		}

		return sum;

	}

	private static int getFibonacciNumber(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
		}

	}

	private static boolean isInArray(int[] array, int n) {
		return isInArray(array, n, 0);
	}

	private static boolean isInArray(int[] array, int n, int i) {
		if (i >= array.length) {
			return false;
		}
		if (n == array[i]) {
			return true;
		} else {
			i++;
			return isInArray(array, n, i);
		}

	}

	private static boolean areTheSame(int[] arr1, int[] arr2) {
		return areTheSame(arr1, arr2, 0);
	}

	private static boolean areTheSame(int[] arr1, int[] arr2, int i) {
		if (i >= arr1.length) {
			return true;
		}
		if (arr1[i] != arr2[i]) {
			return false;
		} else {
			i++;
			return areTheSame(arr1, arr2, i);
		}
	}

	private static void fillArray2(int[] array, int n) {
		array[n] = n;
		fillArray2(array, n - 1, n - 1, true);
		fillArray2(array, n + 1, n - 1, false);
	}

	private static void fillArray2(int[] array, int i, int j, boolean b) {
		array[i] = j;
		if (b) {
			i -= 1;
			j -= 1;
			if (i >= 0) {
				fillArray2(array, i, j, true);
			} else {
				return;
			}
		} else {
			i += 1;
			j -= 1;
			if (i < array.length) {
				fillArray2(array, i, j, false);
			} else {
				return;
			}
		}

	}

//	private void makeMatrix(int n) {
//		int[][] can = new int[n][n];
//		for (int i = 0; i < can.length; i++) {
//			can[0][(int) (Math.random() * (can.length + 1) - 1)] = 1;
//		}
//
//		for (int i = 1; i < can.length; i++) {
//			for (int j = 0; j < can[i].length; j++) {
//				if (can[i - 1][j] == 1) {
//					int saveJ = (int) (Math.random() * 3 + 1);
//					if (saveJ > -1 && saveJ < can.length) {
//						can[i][saveJ] = 1;
//						j++;
//					}
//				}
//			}
//		}
//
//	}
//
//	private void openField(int x, int y) {
//
//	}

}
