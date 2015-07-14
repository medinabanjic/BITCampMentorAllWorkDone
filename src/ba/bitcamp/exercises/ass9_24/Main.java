package ba.bitcamp.exercises.ass9_24;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//try {

			ArrayList<Employee> em = new ArrayList<>();

			Employee e = new Employee("Medina", "Banjic", "F", 2000, 6, 5, 1993);
			Employee e1 = new Employee("Kristina", "Pupavac", "F", 2000, 22, 6,
					1987);
			Employee e2 = new Employee("Mladen", "NemamBlage", "M", 1500, 14,
					5, 1989);
			Employee e3 = new Employee("Edvin", "Mulabdic", "M", 1600, 21, 12,
					1988);
			Employee e4 = new Employee("Neko", "Neciji", "M", 1200, 15, 10,
					1998);
			Employee e5 = new Employee("Svako", "Svaciji", "F", 500, 14, 8,
					1995);
			Company c = new Company(em);

			Company.hireEmployee(e);
			Company.hireEmployee(e1);
			Company.hireEmployee(e2);
			Company.hireEmployee(e3);

			Company.fireEmployee(e2);

			em = Company.getTheList();

			for (Employee value : em) {
				System.out.println(value + "\n");
			}

			System.out.println(Company.isWorkingHere(e3));

			System.out.println(Company.hasFemaleEmployees());

			Company.sortByID();

			Company.sortByAge();

			Company.sortByGender(em);
			Company.sortBySalary(em);
			System.out.println(Company.areEmployeesSortedByID(em));
			Company.addEmployees1(e4, e5);
			
			

			for (Employee value : em) {
				System.out.println(value + "\n");
			}

			Employee e6 = Company.getEmployee(1001);
			System.out.println(e6.toString());
//		} catch (Exception e) {
//			System.out.println("You made a mistake somewhere!");
//		}
	}
}
