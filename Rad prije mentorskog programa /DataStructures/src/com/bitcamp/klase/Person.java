package com.bitcamp.klase;

public class Person {
	
	public String firstName;
	public String secondName;
	public Integer yearOfBirth;
	public String address;
	public String personID;
	public String email;
	public Integer Height;
	public boolean isValid;
	public String favDrink;
	public String favFood;
	
	
	public Person(String firstName, String secondName, Integer yearOfBirth,
			String address, String personID, String email, Integer height,
			boolean isValid, String favDrink, String favFood) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.yearOfBirth = yearOfBirth;
		this.address = address;
		this.personID = personID;
		this.email = email;
		Height = height;
		this.isValid = isValid;
		this.favDrink = favDrink;
		this.favFood = favFood;
	}
	
	

}
