package ba.bitcamp.exercises.ass9_12;

public abstract class Animal extends LifeForm {

	public static final int ANIMALS = 1;
	public static final int PLANTS = 2;
	private double weight;
	protected int mainFood;

	public Animal(boolean isAlive, double weight, int mainFood) {
		super(isAlive);
		this.weight = weight;
		this.mainFood = mainFood;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the mainFood
	 */
	public int getMainFood() {
		return mainFood;
	}

	
	/**
	 * @param mainFood 
	 * @param mainFood
	 *            the mainFood to set
	 * @return 
	 */
	public void setMainFood(int mainFood) {
		this.mainFood = mainFood;
	}

	@Override
	public String toString() {
		return "\nAnimal weight=" + weight + ", mainFood: " + mainFood + ", "
				+ super.toString();
	}

	/**
	 * Compares all attributes.
	 * 
	 * @param lf
	 * @return
	 */
	public boolean equals(Animal a) {
		if (super.equals(this) != super.equals(a) || this.weight != a.weight
				|| this.mainFood != a.mainFood) {
			return false;
		} else {
			return true;
		}
	}
	
	public abstract void eat(LifeForm lf);
}
