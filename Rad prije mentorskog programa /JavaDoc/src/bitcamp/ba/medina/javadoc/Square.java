package bitcamp.ba.medina.javadoc;

public class Square {

	
	/**
	 * Finds <b>area</b> of square.
	 * @param a - a square side value
	 * @return
	 * 
	 * area = a * a;
	 * 
	 * <p>
	 * @throws 
	 * 
	 *  <i>IllegalArgumentException</i> if the given parameter is negative.
	 * 
	 */
	public static double getAreaOfSquare(double a){
		
		if(a < 0){
			throw new IllegalArgumentException();
		}
		
			double area = a * a;
		
			return area;
			
		}

	
	public static void main(String[] args) {
		try{
			System.out.println(getAreaOfSquare(-12));
		}catch(Exception e){
			System.out.println("The number is negative.");
		}

	}

}
