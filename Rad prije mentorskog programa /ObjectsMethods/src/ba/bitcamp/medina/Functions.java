package ba.bitcamp.medina;

public class Functions {
	
	private  Integer num1;
	private  Integer num2;
	private  Integer num3;
	private Integer sum;
	

	

	public Functions(Integer num1, Integer num2, Integer num3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;

	}

	public Integer getSum (){
		int sumA = 0;
		int sumB = 0;
		int sumC = 0;
				
		for (int i = 0; i >=0 && i <= num1 ; i++){
			sumA += i;
		}
		
		for (int i = 0; i >=0 && i <= num2 ; i++){
			sumB += i;
		}
		
		for (int i = 0; i >=0 && i <= num3 ; i++){
			sumC += i;
		}
		
		sum = sumA + sumB + sumC;
		
		return sum;		
		
	}
	
	public static void main(String[] args) {
		
		Functions f = new Functions (2, 5, 4);
		
		System.out.println("This function result is: " + f.getSum());
		

	}

}
