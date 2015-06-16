import java.util.Scanner;

public class ComplicatedKoFol {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input number: ");
		int num1 = in.nextInt();
		
		int digit = 0;

		int sum= 0;
		
		for (int i = 10; num1 > 0;){

				digit = num1 % i;
				num1 = num1 / i;
				sum+= digit; 
				
			}
		
		System.out.println(sum);

		in.close();
	}

}
