package ba.bitcamp.exercises.ass9_24;

public class Employee {

	private static int numOfEmployees = 0;
	private int id = 1000 + numOfEmployees;

	private String name;
	private String surname;
	private String gender;
	private int salary;
	private BirthDate date;

	public Employee() {
		super();
		numOfEmployees++;
	}

	public Employee(String name, String surname, String gender, int salary,
			int day, int month, int year) {
		super();
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.salary = salary;
		this.date = new BirthDate(day, month, year);
		numOfEmployees++;
	}

	public static class BirthDate {
		private int day;
		private int month;
		private int year;

		public BirthDate(int day, int month, int year) {
			super();
			this.day = day;
			this.month = month;
			this.year = year;
		}

		public int getDay() {
			return day;
		}

		public int getMonth() {
			return month;
		}

		public int getYear() {
			return year;
		}

		@Override
		public String toString() {
			return "BirthDate [day=" + day + ", month=" + month + ", year="
					+ year + "]";
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			BirthDate other = (BirthDate) obj;
			if (day != other.day)
				return false;
			if (month != other.month)
				return false;
			if (year != other.year)
				return false;
			return true;
		}

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getGender() {
		return gender;
	}

	public int getSalary() {
		return salary;
	}

	public BirthDate getDate() {
		return date;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "'" + name + " " + surname + "' [" + gender + "] (" + salary
				+ "$) {" + date + "}";
	}

}
