package ba.bitcamp.classes.ass9_14;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] array = new int[100];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10 + 1);
		}

		System.out.println(Arrays.toString(array));

		// for (int i = 0; i < array.length; i++){
		// for(int j = i + 1; j < array.length; j++){
		// if (array[i] > array[j]){
		// int temp = array[i];
		// array[i] = array[j];
		// array[j] = temp;
		// }
		// }
		// }

		Arrays.sort(array);

		System.out.println(Arrays.toString(array));

	}

}
