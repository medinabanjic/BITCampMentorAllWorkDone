package ba.bitcamp.exercises.ass9_29;

import java.io.IOException;
import java.io.InputStream;

public class MyBufferedReader {

	private InputStream is;

	public MyBufferedReader(InputStream is) {
		super();
		this.is = is;
	}

	// read(), readLine(), read(char[]), read(char[], int, int), close() i
	// ready().

	public int read() {
		int n = 0;
		try {
			n = is.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;

	}

	public String readLine() {
		byte[] array1 = null;
		String line = "";
		int i = 0;
		try {
			while (is.read() != 10) {
				array1[i] = (byte) is.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		char[] array = new char[array1.length];

		for (int j = 0; j < array.length; j++) {
			array[i] = (char) array1[i];
			line += array[i];
		}
		return line;
	}

	public int read(char[] c) {
		byte[] array1 = null;
		int counter = 0;
		try {
			for (int i = 0; i < c.length; i++) {
				array1[i] = (byte) is.read();
				c[i] = (char) array1[i];
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < c.length; i++) {
			if (c[i] != ' ') {
				counter++;
			}
		}
		return counter;
	}
	
	
}
