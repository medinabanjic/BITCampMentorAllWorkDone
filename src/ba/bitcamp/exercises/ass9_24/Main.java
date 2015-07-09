package ba.bitcamp.exercises.ass9_24;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> em = new ArrayList<>();
		
		Employee e = new Employee("Medina", "Banjic", "F", 2000, 6, 5, 1993);
		Employee e1 = new Employee("Kristina", "Pupavac", "F", 2000, 22, 6,
				1987);
		Employee e2 = new Employee("Mladen", "NemamBlage", "M", 1500, 14, 5,
				1989);
		Employee e3 = new Employee("Edvin", "Mulabdic", "M", 1600, 21, 12, 1988);

		Company c = new Company(em);

		c.hireEmployee(e);

		c.toString();
	}

}
