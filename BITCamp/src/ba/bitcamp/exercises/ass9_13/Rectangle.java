package ba.bitcamp.exercises.ass9_13;

public class Rectangle implements Shape, Drawable{

	private int length;
	private int width;
	
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	
	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	@Override
	public void drawOnConsole() {
		for (int i = 0; i < length; i++){
			for(int j = 0; j < width; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	@Override
	public int getCircumference() {
		return 2 * length + 2 * width;
	}

	@Override
	public int getArea() {
		return length * width;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (length != other.length)
			return false;
		if (width != other.width)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width
				+ ", getCircumference()=" + getCircumference() + ", getArea()="
				+ getArea() + "]";
	}

	
	
}
