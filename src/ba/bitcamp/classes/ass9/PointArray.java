package ba.bitcamp.classes.ass9;    

public class PointArray {

	private Point[] points;
	private int length;
	
	public PointArray(Point[] points, int length) {
		super();
		this.points = points;
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}

	public Point element(int index){
		return points[index];
	}
	public void addPoint(Point p){
		if(length == points.length){
			resize();
		}
		this.points[length++] = p;
	}

	private void resize() {
		Point[] temp = new Point[points.length * 2];
		for (int i = 0; i < points.length; i++){
			temp[i] = points[i];
		}
		points = temp;
	}
	
}
