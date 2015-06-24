import java.util.Scanner;


public class TheGreatest {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Input first number: ");
		
		int n1 = in.nextInt();
		
		System.out.println("Input second number: ");
		
		int n2 = in.nextInt();
		
		System.out.println("Input third number: ");
		
		int n3 = in.nextInt();
		
		
		if (n1 > n2 && n1 > n3){
			
			System.out.println("The bigest is: " + n1);
		
		}
		
		else if (n2 > n1 && n2 > n3){
			
			System.out.println("The bigest is: " + n2);
		}
		
		else{
			
			System.out.println("The bigest is: " + n3);
		}
		
		
		in.close();

	}

}
