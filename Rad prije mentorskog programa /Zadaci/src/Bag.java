public class Bag {

	private Integer capacity;
	private Integer currentCapacity;

	public Bag(Integer capacity) {
		super();
		this.capacity = capacity;
		this.currentCapacity = 0;
	}

	public int getMaxCapacity() {
		return capacity;
	}

	public int getCurrentCapacity() {
		return currentCapacity;
	}

	public int getFreeSpace() {
		return capacity - currentCapacity;
	}

	public void add(int n) {
		if (currentCapacity + n <= capacity) {
			currentCapacity += n;
		}
	}

	public void remove(int n) {
		currentCapacity -= n;
		if (currentCapacity < 0) {
			currentCapacity = 0;
		}
	}
	
		

}
