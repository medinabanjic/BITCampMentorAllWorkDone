import java.util.Scanner;


public class Switch {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Input month: ");
		int month = in.nextInt();
		String season = " ";
		
		if (month == 3 || month == 4 || month == 5){
			season = "spring";
		}
		
		else if (month == 6 || month == 7 || month == 8){
			season = "summer";
		}
		
		else if (month == 9 || month ==10 || month == 11){
			season = "fall";
		}
		
		else if (month == 12 || month == 1 || month == 2){
			season = "winter";
		}

		System.out.println("It is " + season);
		in.close();
	}

}
