public class ThreeArrays {

	public static void main(String[] args) {

		int[] array = new int[] { 4, 5, 5, 7, 4 };
		int[] array2 = new int[] { 2, 5, 8, 9 };
		int length = array.length + array2.length;
		int[] array3 = new int[length];

		for (int i = 0; i < array.length; i++) {

			array3[i] = array[i];

		}

		for (int i = array.length; i < length; i++) {

			array3[i] = array2[i - array.length];

		}

		for (int value : array3) {
			System.out.print(value + " ");
		}
	}

}
