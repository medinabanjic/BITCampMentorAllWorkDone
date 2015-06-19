package ba.bitcamp.exercises.ass9_10;

import ba.bitcamp.exercises.ass9.PersonalComputer;

public abstract class PortableComputer extends PersonalComputer{

	private double weight;
	private double displaySize;
	private boolean supportsWiFi;
	
	public PortableComputer(String OS, int RAM, double price, double weight, double displaySiye, boolean supportsWiFi) {
		super(OS, RAM, price);
		this.weight = weight;
		this.displaySize = displaySiye;
		this.supportsWiFi = supportsWiFi;
		
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getDisplaySize() {
		return displaySize;
	}
	public void setDisplaySize(double displaySize) {
		this.displaySize = displaySize;
	}
	public boolean isSupportsWiFi() {
		return supportsWiFi;
	}
	public void setSupportsWiFi(boolean supportsWiFi) {
		this.supportsWiFi = supportsWiFi;
	}
	
	public void printTypeInfo(){
		super.printTypeInfo();
		System.out.println("\nPortable computer's main factors are their weight and size. ");
		}
	
	
}
