package ba.bitcamp.exercises.ass9_30;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class WarmUp {

	public static void main(String[] args) {

		BufferedReader in = null;
		File f = null;
		ArrayList<Employee> em = new ArrayList<>();

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		JFileChooser open = new JFileChooser();

		int action = open.showOpenDialog(null);

		if (action == JFileChooser.APPROVE_OPTION) {
			System.out.println("You opened a file!");
			f = open.getSelectedFile();

		} else if (action == JFileChooser.CANCEL_OPTION) {
			System.out.println("You canceled!");
		}

		try {
			in = new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find file!");
			e.printStackTrace();
		}

		try {
			in.readLine();
			while (in.ready()) {
				String line = in.readLine();

				StringTokenizer st = new StringTokenizer(line, ",");

				String name = st.nextToken();
				String surname = st.nextToken();
				String gender = st.nextToken();
				String position = st.nextToken();
				String salary = st.nextToken();
				int salaryInt = Integer.parseInt(salary);

				em.add(new Employee(name, surname, gender, position, salaryInt));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		Employee.sortByName(em);

		for (Employee value : em) {
			System.out.println(value.toString());
		}
		System.out.println();

	}

}
