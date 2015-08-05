package ba.bitcamp.classes.ass9_16;

import java.util.Scanner;

public class Place {

	private String name;
	private Place next;

	public Place(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Place getNext() {
		return next;
	}

	public void setNext(Place newNode) {
		this.next = newNode;
	}
	
	public static Place newPlace() {
		Scanner in = new Scanner(System.in);
		System.out.println("Place: ");
		String name = in.nextLine();
		Place p = new Place(name);
		p.setNext(null);
		return p;
	}
	
	public String toString() {
		String s = "";
		s += name;
		return s;
	}
}
