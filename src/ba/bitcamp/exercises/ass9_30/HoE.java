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

public class HoE {

	public static void main(String[] args) {
		BufferedReader in = null;
		File f = null;
		ArrayList<Integer> years = new ArrayList<>();

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
			int i = 1;
			while (i < 554) {
				while (in.ready()) {

					String line = in.readLine();
					if (!line.equals("")) {
						StringTokenizer st = new StringTokenizer(line, " ");
						String token = st.nextToken();
						if (token.equals("in") || token.equals("around")) {
							try {
								int year = Integer.parseInt(st.nextToken());
								years.add(year);
							} catch (Exception e) {
								token = "";
							}
						}
						
					}
				}
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (Integer value : years) {
			System.out.println(value);
		}
		System.out.println();

	}

}
