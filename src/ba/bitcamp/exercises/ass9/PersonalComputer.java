package ba.bitcamp.exercises.ass9;

public abstract class PersonalComputer {

	private String OS;
	private int RAM;
	private double price;

	public PersonalComputer(String OS, int RAM, double price) {
		super();
		this.OS = OS;
		this.RAM = RAM;
		this.price = price;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getOS() {
		return OS;
	}

	public int getRAM() {
		return RAM;
	}

	public double getPrice() {
		return price;
	}
	
	public void printTypeInfo(){
		System.out.println("\nPersonal computer is described by its OS and some of its components.");
	}

}
