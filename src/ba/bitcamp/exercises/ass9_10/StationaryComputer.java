package ba.bitcamp.exercises.ass9_10;

import ba.bitcamp.exercises.ass9.PersonalComputer;

public abstract class StationaryComputer extends PersonalComputer{
	
	private double procesorSpeed;
	private double powerSupplyUnitStrength;
	private int hardDiskCapacity;
	
	public StationaryComputer(String OS, int RAM, double price, double procesorSpeed, double powerSupplyUnitStrength, int hardDiskCapacity) {
		super(OS, RAM, price);
		this.procesorSpeed = procesorSpeed;
		this.powerSupplyUnitStrength = powerSupplyUnitStrength;
		this.hardDiskCapacity = hardDiskCapacity;
		
	}
	
	public double getProcesorSpeed() {
		return procesorSpeed;
	}
	public void setProcesorSpeed(double procesorSpeed) {
		this.procesorSpeed = procesorSpeed;
	}
	public double getPowerSupplyUnitStrength() {
		return powerSupplyUnitStrength;
	}
	public void setPowerSupplyUnitStrength(double powerSupplyUnitStrength) {
		this.powerSupplyUnitStrength = powerSupplyUnitStrength;
	}
	public int getHardDiskCapacity() {
		return hardDiskCapacity;
	}
	public void setHardDiskCapacity(int hardDiskCapacity) {
		this.hardDiskCapacity = hardDiskCapacity;
	}
	
	public void printTypeInfo(){
		super.printTypeInfo();
		System.out.println("\nStationary computer's main factor is strength of their components.");
	}
	
	
}
