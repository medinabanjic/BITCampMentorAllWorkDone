package ba.bitcamp.exercises.ass1;

public class Temperature {

	private float C;

	/**
	 * This is constructor.
	 * 
	 * @param c
	 */
	public Temperature(float c) {
		C = c;
	}

	/**
	 * Get temperature in Celsious.
	 * 
	 * @return
	 * 
	 *         Float type, temperature in Celsious.
	 */
	public float getTemperatureInC() {
		return C;
	}

	/**
	 * This method change our attributes to String so that we can print them.
	 */
	public String toString() {
		String s = "";
		s = "Temperature in Celsious: " + C + "\n";
		return s;
	}

	/**
	 * This method compare two point objects.
	 * 
	 * @param otherPoint
	 * @return
	 * 
	 *         Boolean value, they are equal or not.
	 */
	public boolean Equals(Temperature otherC) {

		boolean isEqual;
		if (this.C == otherC.C) {
			isEqual = true;
		} else {
			isEqual = false;
		}
		return isEqual;
	}

	/**
	 * Converts to Kelvins.
	 * 
	 * @return Float type, temperature in Kelvins.
	 */
	public float getTemperatureInK() {
		return C + 273.15F;
	}

	/**
	 * Converts to Farenheits.
	 * 
	 * @return Float type, temperature in Farenheits.
	 */
	public float getTemperatureInF() {
		return C * (9 / 5) + 32;
	}

	/**
	 * Set temperature.
	 * 
	 * @param temperature
	 */
	public void setTemperature(int temperature) {
		this.C = temperature;
	}

}
