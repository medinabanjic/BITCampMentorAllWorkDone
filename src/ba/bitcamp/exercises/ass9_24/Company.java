package ba.bitcamp.exercises.ass9_24;

import java.util.ArrayList;

public class Company {

	private static ArrayList<Employee> employees = new ArrayList<>();
	private static boolean sortID = true;

	public Company(ArrayList<Employee> employees) {
		super();
		Company.employees = employees;
	}

	public static void hireEmployee(Employee e) {
		boolean isNew = true;
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).equals(e)) {
				isNew = false;
			}
		}
		if (isNew) {
			employees.add(e);
		}
	}

	public static void fireEmployee(Employee e) {
		boolean isHired = false;
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).equals(e)) {
				isHired = true;
			}
		}
		if (isHired) {
			employees.remove(e);
		}
	}

	public static boolean isWorkingHere(Employee e) {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).equals(e)) {
				return true;
			}
		}
		return false;
	}

	public static boolean hasFemaleEmployees() {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getGender().equals("F")) {
				return true;
			}
		}
		return false;
	}

	public static void sortByID() {
		sortID = true;
		for (int i = 0; i < employees.size() - 1; i++) {
			int minIndex = findSmallestElementInRange(employees, i);

			Employee temp = employees.get(i);
			employees.set(i, employees.get(minIndex));
			employees.set(minIndex, temp);
		}
	}

	public static void sortByAge() {
		sortID = false;
		for (int i = 0; i < employees.size() - 1; i++) {
			int minIndex = findSmallestElementInRange(employees, i);

			Employee temp = employees.get(i);
			employees.set(i, employees.get(minIndex));
			employees.set(minIndex, temp);
		}
	}

	public static int findSmallestElementInRange(ArrayList<Employee> em, int startIndex) {
		int minIndex = startIndex;
		for (int i = startIndex; i < em.size(); i++) {
			if (sortID) {
				if (em.get(i).getId() < em.get(minIndex).getId()) {
					minIndex = i;
				}
			} else {
				if (em.get(i).getDate().getYear() < em.get(minIndex).getDate().getYear()) {
					minIndex = i;
				}
			}
		}
		return minIndex;
	}

	public static void sortBySalary(ArrayList<Employee> em) {
		for (int i = 1; i < em.size(); i++) {
			Employee temp = em.get(i);
			int temp1 = em.get(i).getSalary();

			int j;
			for (j = i - 1; j >= 0; j--) {
				if (em.get(j).getSalary() > temp1) {
					break;
				}
				em.set(j + 1, em.get(j));
			}
			em.set(j + 1, temp);
		}
	}

	public static void sortByGender(ArrayList<Employee> em) {
		for (int i = 1; i < em.size(); i++) {
			String temp = em.get(i).getGender();
			Employee temp1 = em.get(i);

			int j;
			for (j = i - 1; j >= 0; j--) {
				if (em.get(j).getGender().compareTo(temp) < 0) {
					break;
				}
				em.set(j + 1, em.get(j));
			}
			em.set(j + 1, temp1);
		}
	}

	public static boolean areEmployeesSortedByID(ArrayList<Employee> em) {
		boolean sorted = true;
		for (int i = 1; i < em.size(); i++) {
			if (em.get(i).getId() < em.get(i - 1).getId()) {
				sorted = false;
			}
		}
		return sorted;
	}

	public static Employee getEmployee(int id) throws NullPointerException{

		if(id <= 1000 || id > new Employee().getId()){
			throw new NullPointerException("There is no chosen ID in our database.");
			
		}
		
		if (!areEmployeesSortedByID(employees)) {
			sortByID();
		}

		int min = 0;
		int max = employees.size() - 1;
		while (min != max) {
			if (employees.get((min + max) / 2).getId() == id) {
				return employees.get((min + max) / 2);
			} else if (employees.get((min + max) / 2).getId() > id) {
				max = (max + min) / 2 - 1;
			} else {
				min = (max + min) / 2 + 1;
			}
		}
		if (employees.get(min).getId() == id) {
			return employees.get(min);
		}
		return null;
	}

	public String toString() {
		String s = "";
		for (Employee value : employees) {
			s += value + "\n";
		}
		return s;
	}

	public static ArrayList<Employee> getTheList() {
		return employees;
	}

	public static void addEmployees1(Employee... em) {
		boolean isNew = true;
		for (int i = 0; i < em.length; i++) {
			for (int j = 0; j < employees.size(); j++) {
				if (employees.get(j).equals(em[i])) {
					isNew = false;
					break;
				}
			}
			if (isNew) {
				employees.add(em[i]);
			}
		}
	}

	public static void addEmployees2(Employee[] em) {
		boolean isNew = true;
		for (int i = 0; i < em.length; i++) {
			for (int j = 0; j < employees.size(); i++) {
				if (employees.get(j).equals(em[i])) {
					isNew = false;
					break;
				}
			}
			if (isNew) {
				employees.add(em[i]);
			}
		}
	}

	public static void addEmployees3(ArrayList<Employee> em) {
		boolean isNew = true;
		for (int i = 0; i < em.size(); i++) {
			for (int j = 0; j < employees.size(); i++) {
				if (employees.get(j).equals(em.get(i))) {
					isNew = false;
					break;
				}
			}
			if (isNew) {
				employees.add(em.get(i));
			}
		}
	}

	public static Integer indexOf(Employee e) {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).equals(e)) {
				return i;
			}
		}
		return null;
	}

	public void removeEmployee1(int index) {
		for (int i = 0; i < employees.size(); i++) {
			if (i == index) {
				employees.remove(i);
			}
		}
	}

	public void removeEmployee2(int id) {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getId() == id) {
				employees.remove(i);
			}
		}
	}

	public static void sortByName() {
		for (int i = 0; i < employees.size() - 1; i++) {
			for (int j = employees.size() - 2; j >= 0; j--) {
				if (employees.get(j).getName()
						.compareTo(employees.get(j + 1).getName()) > 0) {
					Employee temp = employees.get(j);
					employees.set(j, employees.get(j + 1));
					employees.set(j + 1, temp);
				}
			}
		}
	}

	public static Employee[] getEmployeeArray() {
		Employee[] em = new Employee[employees.size()];

		for (int i = 0; i < employees.size(); i++) {
			em[i] = employees.get(i);
		}
		return em;
	}
	
	

	public static ArrayList<String> getNameList() {
		ArrayList<String> names = new ArrayList<>();
		for (int i = 0; i < employees.size(); i++) {
			names.set(i, employees.get(i).getName());
		}

		return names;
	}
	
	}

