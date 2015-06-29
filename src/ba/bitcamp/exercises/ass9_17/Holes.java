package ba.bitcamp.exercises.ass9_17;

public class Holes {

	private static int sum = 0;
	
	public static int getNumberOfHoles(int num){
		int digit = num % 10;
		 num /= 10;
		 
		switch (digit){
		case 9: case 4: case 0: case 6:
			sum += 1;
			break;
		case 8: 
			sum += 2;
			break;
		default:
			sum += 0;
		}
		
		if(num > 0){
			return getNumberOfHoles(num);
		} else {
			return sum;
		}
	
	}
	public static void main(String[] args) {
		System.out.println(getNumberOfHoles(91996));

	}

}
