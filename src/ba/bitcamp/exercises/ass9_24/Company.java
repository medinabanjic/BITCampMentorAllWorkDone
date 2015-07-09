package ba.bitcamp.exercises.ass9_24;

import java.util.ArrayList;

public class Company {

	private ArrayList<Employee> employees = new ArrayList<>();
	private static boolean sortID = true;

	public Company(ArrayList<Employee> employees) {
		super();
		this.employees = employees;
	}

	public void hireEmployee(Employee e) {
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

	public void fireEmployee(Employee e) {
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

	public boolean isWorkingHere(Employee e) {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).equals(e)) {
				return true;
			}
		}
		return false;
	}

	public boolean hasFemaleEmployees() {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getGender().equals("F")) {
				return true;
			}
		}
		return false;
	}

	public void sortByID() {
		sortID = true;
		for (int i = 0; i < employees.size() - 1; i++) {
			int minIndex = findSmallestElementInRange(employees, i);

			Employee temp = employees.get(i);
			employees.set(i, employees.get(minIndex));
			employees.set(minIndex, temp);
		}
	}

	public void sortByAge() {
		sortID = false;
		for (int i = 0; i < employees.size() - 1; i++) {
			int minIndex = findSmallestElementInRange(employees, i);

			Employee temp = employees.get(i);
			employees.set(i, employees.get(minIndex));
			employees.set(minIndex, temp);
		}
	}

	public int findSmallestElementInRange(ArrayList<Employee> em, int startIndex) {
		int minIndex = startIndex;
		for (int i = startIndex; i < em.size(); i++) {
			if (sortID) {
				if (em.get(i).getId() < em.get(minIndex).getId()) {
					minIndex = i;
				}
			} else {
				if (em.get(i).getSalary() < em.get(minIndex).getSalary()) {
					minIndex = i;
				}
			}
		}
		return minIndex;
	}

	public void sortBySalary(ArrayList<Employee> em) {
		for (int i = 1; i < em.size(); i++) {
			Employee temp = em.get(i);
			int temp1 = em.get(i).getSalary();

			int j;
			for (j = i - 1; j >= 0; j--) {
				if (em.get(j).getSalary() < temp1) {
					break;
				}
				em.set(j + 1, em.get(j));
			}
			em.set(j + 1, temp);
		}
	}

	public void sortByGender(ArrayList<Employee> em) {
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

	public boolean areEmployeesSortedByID(ArrayList<Employee> em) {
		boolean sorted = true;
		for (int i = 1; i < em.size(); i++) {
			if (em.get(i).getId() < em.get(i - 1).getId()) {
				sorted = false;
			}
		}
		return sorted;
	}

	public Employee getEmployee(int id) {

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

}
