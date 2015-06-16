
public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int voltage= 220;
		int resistance= 1200;
		
		double current= (double)voltage / resistance; // This is the formula for current. I have used the Ohm's Law
		
		System.out.printf("The current is %.2f mA.", current);
		
		boolean surviving= 0.1 < current;            // We wanted to know if this current is too powerful for human
		
		System.out.println(" The current is too powerful for you to survive: "+ surviving);
	}

}
