import java.util.Scanner;


public class Zadaca2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int[] array = new int[5];
		int[] array2 = new int[5];
		int value1 = 0;
		int value2 = 0;
		
		System.out.println("Please input values for array 1: ");
		
		for (int i = 0; i < array.length; i++){
			
			value1= in.nextInt();
			array[i] = value1;
			
		}
		
		System.out.println("Please input values for array 2: ");
		
		for (int i = 0; i < array2.length; i++){
			
			value2= in.nextInt();
			array[i] = value2;
		}
		
		for (int i= 0; i < array.length; i++){
			
			if (array[i] == array2[i] && value1 == value2){
				System.out.println("Arrays are identical.");
			}
			else{
				System.out.println("Arrays are not identical.");
			}
		}
		

		in.close();
	}

}
