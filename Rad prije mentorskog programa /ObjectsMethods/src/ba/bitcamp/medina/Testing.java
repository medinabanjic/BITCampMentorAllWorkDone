package ba.bitcamp.medina;

public class Testing {

	public static void main(String[] args) {
		Product bread = new Product (2445, "Whole grain bread", 2.5, 7);
		
		
		
		System.out.println(" " + bread.sold(5));
		
		System.out.print(bread.decreasePrice());
		
		System.out.println(" " + bread.sold(2));
		
		
		

	}

}
