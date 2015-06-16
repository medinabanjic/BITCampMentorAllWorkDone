import java.util.Scanner;


public class ArrayUserMade {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Input the length of array: ");
		
		int length = in.nextInt();
		
		int[] array = new int[length];
		
		System.out.println("Please input values of array: ");
		for (int i = 0; i < length; i++){
			
			if ( i == length - 1){
				System.out.println("This is the last number: ");
			}
			int value = in.nextInt();
			array [i] = value;
			
		}
		
		for (int values : array){
			System.out.println(values);
		}
		
		in.close();

	}

}
