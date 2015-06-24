package ba.bitcamp.exercises.ass4;

public class Speaker {

	private String name;
	private double price;
	private boolean areOn;
	private int volume;
	private double batteryUsage;

	public Speaker(String name, double price, int batteryUsage) {
		this.name = name;
		this.price = price;
		this.batteryUsage = batteryUsage;
		this.volume = 0;
	}

	/**
	 * Gets volume.
	 * 
	 * @return
	 */
	public int getVolume() {
		return volume;
	}

	/**
	 * Gets battery usage.
	 * 
	 * @return
	 */
	public double getBatteryUsage() {
		return batteryUsage;
	}

	/**
	 * Gets battery model name.
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets price.
	 * 
	 * @return
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Gets info, are on or not.
	 * 
	 * @return
	 */
	public boolean getAreOn() {
		return areOn;
	}

	/**
	 * Turns on speakers.
	 */
	public void enable() {
		if (areOn == false) {
			areOn = true;
		} else {
			System.out.println("Speakers are already turned on.");
		}
	}

	/**
	 * Turns off.
	 */
	public void disable() {
		if (areOn == true) {
			areOn = false;
		} else {
			System.out.println("Speakers are already turned off.");
		}
	}

	/**
	 * Lowers volume.
	 */
	public void lowerVolume() {
		if (areOn == true) {
			volume -= 10;
			if (volume < 0) {
				volume = 0;
			}
		} else {
			System.out.println("You need to turn speakers on.");
		}
	}

	/**
	 * Increases volume.
	 */
	public void increaseVolume() {
		if (areOn == true) {
			volume += 10;
			if (volume > 100) {
				volume = 100;
			}
		} else {
			System.out.println("You need to turn speakers on.");
		}
	}

	/**
	 * Converts to string.
	 */
	public String toString() {
		String s = "";
		s = "\nName: " + name;
		if (areOn == true) {
			s += "\nVolume: " + volume;
		} else {
			s += "Off";
		}
		return s;
	}

}
