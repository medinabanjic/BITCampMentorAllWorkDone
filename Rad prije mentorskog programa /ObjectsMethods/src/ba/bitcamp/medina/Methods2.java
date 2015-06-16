package ba.bitcamp.medina;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Arrays;

import bitcamp.ba.medina.javadoc.DrawWindow;

public class Methods2 {

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();

		drawRectangles(4, 6, g);

		w.setImage(img);
	}

	public static String merge(String s1, String s2) {

		int length = s2.length();

		String firstHalf = s2.substring(0, length / 2);
		String secondHalf = s2.substring(length / 2, length);
		String merged = firstHalf.concat(s1);
		merged = merged.concat(secondHalf);

		return merged;

	}

	public static String getFirst(String s1, String s2, String s3) {
		String First = "";
		int first = s1.compareTo(s2);
		int first1 = s1.compareTo(s3);

		if (first > first1) {

			int first3 = s2.compareTo(s1);

			if (first3 > first) {
				First = s1;
			}

			else {
				First = s2;
			}

		} else {
			int first4 = s3.compareTo(s1);

			if (first4 > first1) {
				First = s1;
			}

			else {
				First = s3;
			}

		}

		return First;
	}

	public static String getTheRest(String s1, String s2) {

		String suffix = "";
		if (s2 != null) {
			int yes = s1.indexOf(s2);

			if (yes != -1) {
				suffix = s1.substring(yes, s1.length());
			}

			else {
				suffix = null;
			}
		}

		else {
			suffix = s1;
		}

		return suffix;
	}

	public static void writeToFile(String filename, String msg) {

		TextIO.writeFile(filename);

		TextIO.putln(msg);
	}

	public static void drawRectangles(int n, int m, Graphics g) {

		g.setColor(Color.black);
		for (int i = 0; i < n * 50; i += 50) {
			for (int j = 0; j < m * 50; j += 50) {

				g.drawRect(j, i, 50, 50);
			}
		}
	}

	public static int[] getArray2(int n, int k) {

		int[] array = new int[n];

		int j = 1;
		int i = 0;
		int counter = 1;

		for (j = 1; i < n; j++) {

			if (j > k) {
				j = j - i / counter;
				counter++;
			}

			array[i] = j;

			i++;
		}

		return array;
	}

	public static int[] getArray3(String filename) {
		int counter = 0;
		int i = 0;
		int a = 0; 
		
		TextIO.readFile(filename);
		while (!TextIO.eof()) {

			TextIO.getln();
			counter++;

		}
		int[] array = new int[counter];

		while (!TextIO.eof()) {
			
			TextIO.readFile(filename);

			if (i < counter){
			
			a = Integer.parseInt(TextIO.getln());

			array[i] = a;

			i++;
			}
		}

		return array;

	}

	public static void main(String[] args) {
		// DrawWindow w = new DrawWindow();
		// draw(w);

		// int n = 9;
		// int k = 5;

		String name = "src/ba/bitcamp/medina/Arrays";
		System.out.print(Arrays.toString(getArray3(name)));
	}

}
