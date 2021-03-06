package ba.bitcamp.exercises.ass6;

public class Anthenna {

	private String manufacturer;
	private int signalStrength;
	private int batteryUsage;

	public Anthenna(String manufacturer, int batteryUsage) {
		this.manufacturer = manufacturer;
		this.batteryUsage = batteryUsage;
		this.signalStrength = 4;
	}

	public int getBatteryUsage() {
		return batteryUsage;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getSignalStrength() {
		return signalStrength;
	}

	public void setSignalStrength(int signalStrength) {
		this.signalStrength = signalStrength;
	}

	/**
	 * Finds out if the signal has been received and does it have a sense.
	 * 
	 * @param strength
	 * @param signal
	 * @return Boolean value.
	 */
	public boolean incomingSignal(int strength, String signal) {
		boolean isGoodAndStrong = true;
		String code = null;
		code = signal.substring(0, 3);
		if (!(code.equals("CAL")) || !(code.equals("SMS"))) {
			isGoodAndStrong = false;
		} else {
			isGoodAndStrong = true;
		}
		if (strength > signalStrength) {
			isGoodAndStrong = false;
		} else {
			isGoodAndStrong = true;
		}
		code = signal.substring(3, 6);
		if (!(code.equals("387"))) {
			isGoodAndStrong = false;
		} else {
			isGoodAndStrong = true;
		}
		code = signal.substring(3);
		if (code.length() != 11) {
			isGoodAndStrong = false;
		} else {
			isGoodAndStrong = true;
		}

		return isGoodAndStrong;

	}

	@Override
	public String toString() {
		return "Anthenna [manufacturer=" + manufacturer + ", signalStrength="
				+ signalStrength + "]";
	}

}
