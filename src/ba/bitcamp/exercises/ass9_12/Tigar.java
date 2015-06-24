package ba.bitcamp.exercises.ass9_12;

public class Tigar extends Animal {

	public static final int IDLE = 1;
	public static final int HUNTS = 2;
	public static final int EATS = 3;
	private int speed;
	private int status;

	public Tigar(double weight, int speed, int status) {
		super(true, weight, Animal.ANIMALS);
		this.speed = speed;
		this.status = status;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed
	 *            the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
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

	@Override
	public String toString() {
		return "Tigar speed: " + speed + ", status: " + status + ", "
				+ super.toString();
	}

	/**
	 * Compares all attributes.
	 * 
	 * @param lf
	 * @return
	 */
	public boolean equals(Tigar t) {
		if (super.equals(this) != super.equals(t) || this.speed != t.speed
				|| this.status != t.status) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * This method makes tiger eat if the right food is given. If he is dead
	 * or the food is another tiger or even a plant he wont eat. Also if he is not in the
	 * state of hunting he wont eat. Once the method is called and all
	 * conditions are checked his state changes to eats.
	 */
	@Override
	public void eat(LifeForm lf) {
		if (isAlive != true) {
			System.out
					.println("Ouuuuu... I am sorry to say but this tiger moved to another world.");
		} else if (lf instanceof Plant || lf.equals(this) || lf instanceof Tigar) {
			System.out.println("This is not a good food for tiger.");
		} else if (status != HUNTS) {
			if (status == EATS) {
				System.out.println("The tiger already eats.");
			} else {
				System.out
						.println("The tiger do not want to eat now as he is resting.");
			}
		} else {
			status = EATS;
			if (lf instanceof Zebra) {
				Zebra z = (Zebra) lf;
				if (z.isSick() == true) {
					this.isAlive = false;
					System.out
							.println("Unfortunately, our dear tiger died. He ate sick zebra.");
				}
			}
		}

	}

}
