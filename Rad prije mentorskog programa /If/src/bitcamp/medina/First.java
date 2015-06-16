package bitcamp.medina;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num= 5;
		
		if (num < 0){
													// This function compares num with 0, if it is lower it will write out Negative number
			System.out.println("Negative number.");
		}
		
		else if (num > 0){
													// This function compares num with 0, if it is greater it will write out Positive number
			System.out.println("Positive number.");
		}
		
		else {										// If the conditions above are false it will write out that the number is 0
			System.out.println("Number is 0.");
		}
	}

}
