package ba.bitcamp.exercises.ass9_12;

public abstract class LifeForm {
	protected boolean isAlive;

	public LifeForm(boolean isAlive) {
		super();
		this.isAlive = isAlive;
	}

	/**
	 * @return the isAlive
	 */
	public boolean isAlive() {
		return isAlive;
	}

	/**
	 * @param isAlive
	 *            the isAlive to set
	 */
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	@Override
	public String toString() {
		return "\nThis life form is alive: " + isAlive + ".";
	}

	/**
	 * Compares all attributes.
	 * 
	 * @param lf
	 * @return
	 */
	public boolean equals(LifeForm lf) {
		if (isAlive != lf.isAlive) {
			return false;
		} else {
			return true;
		}
	}

}
