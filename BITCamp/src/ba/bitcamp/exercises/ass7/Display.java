package ba.bitcamp.exercises.ass7;

public class Display {

	private String manufacturer;
	private int brightness;
	private boolean isOn;
	private int batteryUsage;

	public Display(String manufacturer, int batteryUsage) {
		this.manufacturer = manufacturer;
		this.batteryUsage = batteryUsage;
		this.brightness = 100;
	}

	/**
	 * Gets battery usage.
	 * 
	 * @return
	 */
	public int getBatteryUsage() {
		return batteryUsage;
	}

	/**
	 * Turns display on.
	 */
	public void turnOn() {
		if (isOn == false) {
			isOn = true;
		} else {
			System.out.println("Display is already turned on.");
		}
	}

	/**
	 * Turns display off.
	 */
	public void turnOff() {
		if (isOn == true) {
			isOn = false;
		} else {
			System.out.println("Display is already turned off.");
		}
	}

	/**
	 * Lowers brightness.
	 */
	public void lowerBrightness() {
		if (isOn == true) {
			brightness -= 10;
			if (brightness < 0) {
				brightness = 0;
			}
		} else {
			System.out.println("You need to turn display on.");
		}
	}

	/**
	 * Increases brightness.
	 */
	public void increaseBrightness() {
		if (isOn == true) {
			brightness += 10;
			if (brightness > 100) {
				brightness = 100;
			}
		} else {
			System.out.println("You need to turn display on.");
		}
	}

	/**
	 * Converts to string.
	 */
	public String toString() {
		String s = "";
		s = "\nManufacturer: " + manufacturer;
		if (isOn == true) {
			s += "\nBrightness: " + brightness;
		} else {
			s += "Off";
		}
		return s;
	}

}
