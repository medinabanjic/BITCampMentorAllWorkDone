package ba.bitcamp.classes.ass1;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("userCount: " + User.userCount);

		User u = new User("John", "Snow");
		System.out.println("userCount: " + User.userCount);
		User u2 = new User("John", "White", 28);
		System.out.println("userCount: " + User.userCount);
		
		System.out.println(u.getName() + " " + u.getID());
		System.out.println(u2.getName() + " " + u2.getID());
	}

}
