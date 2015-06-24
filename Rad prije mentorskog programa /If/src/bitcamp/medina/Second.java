package bitcamp.medina;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=100;
		
		int num= num1 % 2; // Here we calculate the modul of number 1
		
		if (num == 0){	   // This function is comparing number 1 with 0
			System.out.println("Number is even.");
		}				   // If the condition is true it will write out that the number is even
		
		else {			   // If the conition above is not true it will write out that the number is odd
			System.out.println("Number is odd.");
		}
	}

}
