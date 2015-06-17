package ba.bitcamp.classes.ass2;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	/**
	 * This method change our attributes to String so that we can print them.
	 */
	public String toString() {
		String s = "";
		s = "X: " + x + "\n";
		s += "Y: " + y + "\n";

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
	public boolean Equals(Point otherPoint) {

		boolean isEqual;
		if (this.x == otherPoint.x && this.y == otherPoint.y) {
			isEqual = true;
		} else {
			isEqual = false;
		}
		return isEqual;
	}

	/**
	 * This method calculates distance between two points.
	 * 
	 * @param p1
	 *            = point
	 * @param p2
	 *            = point
	 * @return
	 * 
	 *         Double value, distance.
	 */
	public static double calculateDistance(Point p1, Point p2) {
		double distance = Math
				.sqrt((int) (Math.pow((p1.x - p2.x), 2) + (int) (Math.pow(
						(p1.y - p2.y), 2))));
		return distance;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	

}
