import java.util.Scanner;


public class MultipleWrittenNumber {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
		
		int value = 0;
		int counter = 0;
		
		System.out.println("How many numbers do You want to input: ");
		
		
		int length = in.nextInt();
		
		int[] array = new int[length];
		
		System.out.println("Please input values of the array: ");
		
		for (int i = 0; i < length; i++){
			
			if ( i == length - 1){
				System.out.println("Please input the last number in this array: ");
			}
			value = in.nextInt();
			array [i] = value;
			
		}
		
		System.out.println("\nWhich is the number that You want me to count: ");
		
		int number = in.nextInt();
		
		for ( int values : array){
			
			if (values == number){
				
				
				counter++;
			}
		}
		
			System.out.println("You have written " + counter + " times number " + number + ".");
		
		
		in.close();

	}

}
