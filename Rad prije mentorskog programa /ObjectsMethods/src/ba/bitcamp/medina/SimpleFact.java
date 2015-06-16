package ba.bitcamp.medina;

import java.util.Scanner;

public class SimpleFact {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);

		System.out.println("Input number: ");
		int num= in.nextInt();
	   
	   for (int i = 2; i <= num; i++){
		   
		   while (num % i == 0){
			   
			   System.out.print(i + " ");
			   num = num / i;
		   }
	   }
	   
	   in.close();

	}

}
