package ba.bitcamp.exercises.ass9_12;

public class Zebra extends Animal {

	public static final int HEALTHY = 1;
	public static final int SICK = 2;
	public static final int DEADLY_SICK = 3;
	private int old;
	private int status;

	public Zebra(double weight, int old, int status) {
		super(true, weight, Animal.PLANTS);
		this.old = old;
		this.status = status;
	}

	/**
	 * @return the old
	 */
	public int getOld() {
		return old;
	}

	/**
	 * @param old
	 *            the old to set
	 */
	public void setOld(int old) {
		this.old = old;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	public boolean isSick() {
		if (status != HEALTHY) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Zebra is old=" + old + " months, status: " + status + ", "
				+ super.toString();
	}

	/**
	 * Compares all attributes.
	 * 
	 * @param lf
	 * @return
	 */
	public boolean equals(Zebra z) {
		if (super.equals(this) != super.equals(z) || this.old != z.old
				|| this.status != z.status) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * This method makes zebra eat.
	 * If the zebra is dead it wont eat, also it checks whether the food is plant and if it is then zebra eats.
	 * If the food ate is poisonous zebra dies.
	 */
	@Override
	public void eat(LifeForm lf) {
		if (isAlive != true) {
			System.out
					.println("Ouuuuu... I am sorry to say but this zebra moved to another world.");
		} else if (lf instanceof Animal) {
			System.out.println("This is not a good food for zebra.");
		} else {
			if (lf instanceof Plant) {
				Plant p = (Plant) lf;
				if (p.isPoisonous() == true) {
					this.isAlive = false;
					System.out
							.println("Unfortunately, our dear zebra died. That is what you get when you eat poisonous food.");
				}
			}
		}

	}

}
