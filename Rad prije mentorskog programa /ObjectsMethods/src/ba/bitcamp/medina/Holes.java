package ba.bitcamp.medina;

public class Holes {

	public Integer getNumberOfHoles(int num) {
		int sum1 = 0;
		int sum2 = 0;
		
		while (num > 0) {
			int digit = 0;

			digit = num % 10;
			num = num / 10;

			if (digit == 9 || digit == 4) {

				sum1 ++;
			}

			else if (digit == 8) {

				sum2 += 2;
			}

		}

		return sum1 + sum2;

	}

	public static void main(String[] args) {

		Holes h = new Holes();

		System.out.println(h.getNumberOfHoles(18821492));

	}

}
