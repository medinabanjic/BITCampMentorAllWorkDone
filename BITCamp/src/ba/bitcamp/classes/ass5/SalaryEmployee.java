package ba.bitcamp.classes.ass5;

public class SalaryEmployee extends Employee{		
	
	private int salary;
	
	public SalaryEmployee(String name, String gender, int salary) {
		super(name, gender);
		this.setSalary(salary);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
}
