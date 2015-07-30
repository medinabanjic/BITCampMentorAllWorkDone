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

public class Poker {

	public static void main(String[] args) {
		BufferedReader in = null;
		File f = null;
		ArrayList<String> hands = new ArrayList<>();

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
		
		String hand = "";
		int counter = 0;
		
		try {
			while (in.ready()) {

				String line = in.readLine();
				StringTokenizer st = new StringTokenizer(line, ",");
				while(st.hasMoreTokens()){
					hand = st.nextToken();
				}
				
				if (hand.equals("5")){
					counter++;
				}
				hands.add(line);				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.printf("%d Flushes", counter);
		
	}

}
