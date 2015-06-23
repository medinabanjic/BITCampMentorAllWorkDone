package ba.bitcamp.exercises.ass9_13;

public class Line implements Shape, Drawable {

	private int length;

	public Line(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public void drawOnConsole() {
		for (int i = 0; i < this.length; i++){
			System.out.print("*");
		}

	}

	@Override
	public int getCircumference() {
		return 0;
	}

	@Override
	public int getArea() {
		return 0;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Line other = (Line) obj;
		if (length != other.length)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Line [length=" + length + ", getCircumference()="
				+ getCircumference() + ", getArea()=" + getArea() + "]";
	}

	
	
}
