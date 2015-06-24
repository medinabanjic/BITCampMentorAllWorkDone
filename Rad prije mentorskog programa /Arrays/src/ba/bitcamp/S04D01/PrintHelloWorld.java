package ba.bitcamp.S04D01;

public class PrintHelloWorld {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for ( String number : args){
			System.out.println(number);
			sum += Integer.parseInt(number);
		}
		
		System.out.println("Suma je " + sum);
		
	}
	
	/**
	 * Prints Hello World to the screen.
	 * <p>
	 * Sends string Hello world to the standard output.
	 */
	
//	public static void sayHello(String name){
//		
//		System.out.printf("Hello %s!", name);
//	}

}
