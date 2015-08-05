package ba.bitcamp.classes.ass9_12;

public class Program {

	private static int sumParams(int... params) {
		int sum = 0;
		for (int i = 0; i < params.length; i++) {
			sum += params[i];
		}
		return sum;
	}
	
	private static String stringParams(Object... params) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < params.length; i++) {
			sb.append(params[i]);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(sumParams());
		System.out.println(sumParams(1, 2));
		System.out.println(sumParams(1, 4, 5));
		
		System.out.println(stringParams("neki", "string"));
		System.out.println(stringParams(1, 2, 3, 4, 5));

	}

}
