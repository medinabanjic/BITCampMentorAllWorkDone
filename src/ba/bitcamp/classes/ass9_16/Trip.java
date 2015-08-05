package ba.bitcamp.classes.ass9_16;

public class Trip {

	private Place start;
	private Place last;

	public Trip(Place from) {
		super();
		this.start = from;
	}
	
	

	public Place getLast() {
		return last;
	}



	public void setLast(Place last) {
		this.last = last;
	}



	public String toString() {
		String s = "";
		s += "You are going to travel from " + start + " to " + last
				+ ". Have a nice trip!";
		return s;
	}

}
