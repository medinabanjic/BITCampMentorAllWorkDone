package bitcamp.ba.medina.javadoc;

import java.util.InputMismatchException;

public class ArgsTask {

	/**
	 * Finds <b>sum</b> of the array elements.
	 * @param el - is an array with our numbers
	 * @return
	 * 
	 * Sum of array elements.
	 * 
	 * @throws 
	 * 
	 * <i>NumberFormatException</i> if you input string instead of number.
	 */
	public static int sum(String[] el) {
         
		int sum = 0;

		for (int i = 0; i < el.length; i++) {

			sum += Integer.parseInt(el[i]);

			throw new NumberFormatException();
		}
		return sum;

	}

	public static void main(String[] args) {

		try{
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}}catch(Exception e){
			System.out.println("Input number instead of string.");
		}

	}

}
