package ba.bitcamp.exercises.ass5;

public class Battery {

	private String name;
	private int batteryLeft;
	private int chargingSpeed;

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param chargingSpeed
	 */
	public Battery(String name, int chargingSpeed) {
		super();
		this.name = name;
		this.batteryLeft = 50;
		this.chargingSpeed = chargingSpeed;
	}

	/**
	 * Gets name.
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets battery left.
	 * 
	 * @return
	 */
	public int getBatteryLeft() {
		return batteryLeft;
	}

	/**
	 * Charges battery.
	 * 
	 * @param minutes
	 */
	public void chargeBattery(int minutes) {
		batteryLeft = chargingSpeed * minutes;
		if (batteryLeft > 100) {
			batteryLeft = 100;
		}
	}

	/**
	 * Spend battery.
	 * 
	 * @param use
	 */
	public void spendBattery(int use) {
		batteryLeft -= use;
		if (batteryLeft <= 0) {
			batteryLeft = 0;
			System.out.println("Goodbye!");
		}
	}

	/**
	 * Converts to string to print it.
	 */
	@Override
	public String toString() {
		return "Battery name= " + name + ", \nBatteryLeft=" + batteryLeft + "%";
	}

}
