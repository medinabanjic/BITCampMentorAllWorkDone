package ba.bitcamp.exercises.ass9_41;

public class Task03 {

	private static int counter = 0;
	private static int[][] nums = new int[10_000][10_000];

	public static void main(String[] args) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = (int)(Math.random() * 100 + 1);
			}
		}
		int r = (int)(Math.random() * 100 + 1);
		long t = System.currentTimeMillis();
		System.out.println("Appears: " + shows(r) + " times.");
		System.out.println("Time [ms]: " + (System.currentTimeMillis() - t));
	}

		public static int shows(int num) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (num == j) {
					counter++;
				}
			}
		}
		return counter;
	}

	
}
