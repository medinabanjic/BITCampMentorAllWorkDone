package bitcamp.medina;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1= 2;
		int num2= 54;
		int num3= -12;
		
		if (num1 > num2 && num1 > num3){	// This function is comparing number 1,2 and 3
											// If the condition is true it will write out that the number 1 is the greatest
			System.out.println("Number 1 is the greatest.");
		}
		
		else if (num2 > num1 && num2 > num3){// This function is comparing number 1,2 and 3
											// If the condition is true it will write out that the number 2 is the greatest
			System.out.println("Number 2 is the greatest.");
		}
		
		else {								// If the conditions above are false it will write out that the number 3 is the greatest
			
			System.out.println("Number 3 is the greatest.");
		}
	}

}
