package ba.bitcamp.exercises.ass9_12;

public abstract class Plant extends LifeForm {

	private boolean isPoison;
	private int capacity;

	public Plant(boolean isAlive, boolean isPoison, int capacity) {
		super(isAlive);
		this.isPoison = isPoison;
		this.capacity = capacity;
	}

	/**
	 * @return the isPoison
	 */
	public boolean isPoisonous() {
		return isPoison;
	}

	/**
	 * @param isPoison
	 *            the isPoison to set
	 */
	public void setPoison(boolean isPoison) {
		this.isPoison = isPoison;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity
	 *            the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Plant is poison: " + isPoison + ", capacity: " + capacity
				+ ", " + super.toString();
	}

	/**
	 * Compares all attributes.
	 * @param lf
	 * @return
	 */
	public boolean equals(Plant p) {
		if (super.equals(this) != super.equals(p)
				|| this.isPoison != p.isPoison || this.capacity != p.capacity) {
			return false;
		} else {
			return true;
		}
	}
}
