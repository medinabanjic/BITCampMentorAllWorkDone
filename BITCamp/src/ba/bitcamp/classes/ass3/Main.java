package ba.bitcamp.classes.ass3;

import ba.bitcamp.classes.ass2.Point;

public class Main {

	public static void main(String[] args) {
		Point p = new Point(5, 8);
		Point p1 = new Point(4, 2);

		Circle c = new Circle(12.5, p);
		Circle c1 = new Circle(11.2, p1);

		System.out.println("These two circles intersect: "
				+ Circle.doIntersect(c, c1));

	}

}
