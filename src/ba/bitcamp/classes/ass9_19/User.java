package ba.bitcamp.classes.ass9_19;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = 8076902160168962286L;
	private String name;
	private int years;
	
	public User(String name, int years) {
		super();
		this.name = name;
		this.years = years;
	}


	public String toString(){
		return String.format("%s %d", name, years);
	}

}
