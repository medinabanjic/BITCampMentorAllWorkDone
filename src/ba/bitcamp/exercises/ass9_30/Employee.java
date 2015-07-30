package ba.bitcamp.exercises.ass9_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import ba.bitcamp.exercises.ass9_27.Planet;

public class Employee implements Comparable{

	public static final String M = "M";
	public static final String F = "F";
	private String name;
	private String surname;
	private String gender;
	private String position;
	private int salary;
	
	
	public Employee(String name, String surname, String gender, String position,
			int salary) {
		super();
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.position = position;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	public static <T> void sortByName(ArrayList<Employee> em) {
		Collections.sort(em, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.name.compareTo(o2.name);
			}
		});
	}
	@Override
	public String toString() {
		return "\nName: " + name + ", Surname: " + surname + ", Gender: "
				+ gender + ", Position: " + position + ", Salary: " + salary
				+ "\n";
	}


	@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		return this.compareTo(o);
	}
	
	
	
	
	
}
