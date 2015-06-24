package ba.bitcamp.exercises.ass9_11;

import ba.bitcamp.exercises.ass9_10.PortableComputer;

public class Laptop extends PortableComputer {

	private int numberOfBatteryCells;
	private boolean hasBluetooth;
	private boolean hasNumericalKeypad;

	public Laptop(String OS, int RAM, double price, double weight,
			double displaySiye, boolean supportsWiFi, int numberOfBatteryCells,
			boolean hasBluetooth, boolean hasNumericalKeypad) {
		super(OS, RAM, price, weight, displaySiye, supportsWiFi);
		this.numberOfBatteryCells = numberOfBatteryCells;
		this.hasBluetooth = hasBluetooth;
		this.hasNumericalKeypad = hasNumericalKeypad;

	}

	public int getNumberOfBatteryCells() {
		return numberOfBatteryCells;
	}

	public void setNumberOfBatteryCells(int numberOfBatteryCells) {
		this.numberOfBatteryCells = numberOfBatteryCells;
	}

	public boolean isHasBluetooth() {
		return hasBluetooth;
	}

	public void setHasBluetooth(boolean hasBluetooth) {
		this.hasBluetooth = hasBluetooth;
	}

	public boolean isHasNumericalKeypad() {
		return hasNumericalKeypad;
	}

	public void setHasNumericalKeypad(boolean hasNumericalKeypad) {
		this.hasNumericalKeypad = hasNumericalKeypad;
	}

	public void printTypeInfo() {
		super.printTypeInfo();
		System.out
				.println("\nLaptop computers are made for global use, when it comes to portability."
						+ " \nTheir main characteristics are portability, connection possibility and battery.");

	}

}
