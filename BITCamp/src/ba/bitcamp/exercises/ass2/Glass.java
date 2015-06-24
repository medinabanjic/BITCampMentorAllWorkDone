package ba.bitcamp.exercises.ass2;

public class Glass {

	private String typeOfLiquid;
	private int currentCapacity;
	private int maxCapacity;

	/**
	 * Constructor.
	 * 
	 * @param typeOfLiquid
	 * @param currentCapacity
	 * @param maxCapacity
	 */
	public Glass(String typeOfLiquid, int currentCapacity, int maxCapacity) {
		this.typeOfLiquid = null;
		this.currentCapacity = 0;
		this.maxCapacity = maxCapacity;
	}

	/**
	 * Get type of liquid.
	 * 
	 * @return String value.
	 */
	public String getTypeOfLiquid() {
		return typeOfLiquid;
	}

	/**
	 * Get current capacity of glass.
	 * 
	 * @return Integer value.
	 */
	public int getCurrentCapacity() {
		return currentCapacity;
	}

	/**
	 * Get max capacity.
	 * 
	 * @return Integer value.
	 */
	public int getMaxCapacity() {
		return maxCapacity;
	}

	/**
	 * This method adds liquid to glass.
	 * 
	 * @param type
	 * @param addCapacity
	 */
	public void addLiquid(String type, int addCapacity) {
		if (typeOfLiquid.equals(type)) {
			currentCapacity += addCapacity;
			if (currentCapacity > maxCapacity) {
				currentCapacity = maxCapacity;
			}
		}
	}

	/**
	 * This method set capacity to zero.
	 */
	public void emptyGlass() {
		currentCapacity = 0;
	}
}
