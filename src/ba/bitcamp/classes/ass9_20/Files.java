package ba.bitcamp.classes.ass9_20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JFileChooser;

public class Files {

	public static void main(String[] args) {

		int counter1 = 0;
		int counter2 = 0;

		File home = new File(System.getProperty("user.home"));
		File[] allFiles = home.listFiles();

		if (home.exists()) {

			if (home.isDirectory()) {
				for (int i = 0; i < allFiles.length; i++) {
					if (allFiles[i].isFile()) {
						System.out.println("File - " + allFiles[i].getName());
						counter1++;
					} else if (allFiles[i].isDirectory()) {
						System.out.println("Directory - "
								+ allFiles[i].getName());
						counter2++;
					}
				}

				System.out
						.printf("\nI have %d files, and %d directories in my home folder.",
								counter1, counter2);
			}
		} else {
			System.out.println("There is no such folder.");
		}
		
		String name = "";
		JFileChooser jfc = new JFileChooser(System.getProperty("user.dir"));
		File file = null;
		
		ArrayList<String> alist  = new ArrayList<>();
		
		if(file.exists()){
			if(file.isFile()){
				System.out.println("OK");
				try {
					BufferedReader br = new BufferedReader(new FileReader(file));
					PrintWriter pw = new PrintWriter(System.out);
					while (br.ready()){
		
					}
			
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		

	}
}
