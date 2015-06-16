public class Ten {

	public static void main(String[] args) {
		int[] ten = new int[10];

		for (int i = 0; i < 10; i++) {

			ten[i] = (int) (Math.random() * 10 + 1);

		}

		for (int value : ten) {
			System.out.println(value);
		}
	}

}
