package ba.bitcamp.medina;

public class Product {

	private Integer code;
	private String name;
	private Double price;
	private Integer stock;

	public Product(Integer code, String name, Double price, Integer stock) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public String decreasePrice() {
		price -= 0.5;
		String output = " On sale. New price: " + price + "$";
   
		return output;
		
	}

	public String sold(Integer a) {
		
		stock -= a;
		String message= code + " " + name + " " + price + "$";
		
		if (stock <= 0) {
			message = " Out of stock.";
			stock = 0;
		}

		return message;
	}

}
