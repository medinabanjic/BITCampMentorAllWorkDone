package ba.bitcamp.classes.ass2;

public class Main {

	public static void main(String[] args) {
		Point p = new Point(5, 8);
		Point p1 = new Point (4, 2);
		
		
		System.out.println("Distance between these points is: " + Point.calculateDistance(p, p1));

	}

}
