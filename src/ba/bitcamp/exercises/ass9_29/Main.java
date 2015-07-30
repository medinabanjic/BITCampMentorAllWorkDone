package ba.bitcamp.exercises.ass9_29;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(System.out);
		String space = " ";

		// for (int i = 1; i < 101; i++ ){
		// pw.println(i);
		// if (i % 2 == 0){
		// pw.println(space);
		// }
		// }
		// pw.flush();
		//
		// char[] abc = new char[26];
		//
		// for (int i = 0; i < 26; i++) {
		// abc[i] = (char) (65 + i);
		// }
		// pw.write(abc, 0, 10);
		// pw.flush();
		File file = new File("src/user.txt");
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ArrayList<User> users = new ArrayList<>();
		users.add(new User("Medina", 22));
		users.add(new User("Adnan", 30));
		users.add(new User("Davud", 2));
		users.add(new User("Envera", 16));

		try {
			for (int i = 0; i < users.size(); i++) {
				oos.writeObject(users.get(i));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			while (true) {
				if (ois.equals(null)) {
					break;
				}
				User u = (User) ois.readObject();
				pw.println(u);
				pw.flush();
			}

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}
}
