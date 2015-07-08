package ba.bitcamp.exercises.ass9_23;

import java.util.ArrayList;
import java.util.Arrays;

public class ItD {

	public static String ItDay(int a) {
		ArrayList<String> week = new ArrayList<>(Arrays.asList("Monday",
				"Tuesday", "Wensday", "Thursday", "Friday", "Saturday",
				"Sunday"));

		return week.get(a - 1);
	}

	public static void shiftArray(char[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			if (i > 0) {
				Arrays.fill(array, i, i + 1, array[i - 1]);
			}
		}
	}

	public static String[] removeNulls(String... params) {
		int counter = 0;
		int j = 0;
		for (int i = 0; i < params.length; i++) {
			if (params[i] == null) {
				counter++;
			}
		}

		for (int i = 0; i < params.length - counter; i++) {
			if (params[j] != null) {
				params[i] = params[j];
				j++;
			} else {
				j++;
				i--;
			}
		}

		params = Arrays.copyOf(params, params.length - counter);

		return params;
	}

	public static boolean isThere(String s, char c) {
		char[] word = s.toCharArray();

		Arrays.sort(word);

		if (Arrays.binarySearch(word, c) < 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public static String[] AtoZ(String... params){
		Arrays.sort(params);
		return params;

	}
	
	public static int[] fillIt(int size, int num, int x, int y){
		int[] array = new int[size];
		Arrays.fill(array, -1);
		Arrays.fill(array, x, y + 1, num);
		
		return array;
	}

	public static void main(String[] args) {
		char[] a = { 'A', 'B', 'C', 'D' };
		// System.out.println(ItDay(1));
		shiftArray(a);
		System.out.println(Arrays.toString(a));
		shiftArray(a);
		System.out.println(Arrays.toString(a));

		System.out.println(Arrays.toString(removeNulls(null, "Java", null,
				"pojma", "nemam", null)));

		System.out.println(isThere("golub", 'f'));
		
		System.out.println(Arrays.toString(AtoZ("Medina", "Adnan" , "Davud")));
		
		System.out.println(Arrays.toString(fillIt(10, 3, 2, 6)));
	}

}
