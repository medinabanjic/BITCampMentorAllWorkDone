package ba.bitcamp.classes.ass1;

public class User {
	
	public static Integer userCount = 0;

	private String name;
	private String surname;
	private Integer age;
	private Integer ID;
	
	public User(String name, String surname) {
		this(name, surname, 0);
	}


	public User(String name, String surname, Integer age) {
		super();
		this.name = name;
		this.setSurname(surname);
		this.setAge(age);
		this.ID = ++userCount;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getID(){
		return ID;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public Integer getAge() {
		return age;
	}
	
	
}
