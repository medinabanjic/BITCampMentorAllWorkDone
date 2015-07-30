package ba.bitcamp.exercises.ass9_29;

import java.io.IOException;
import java.io.OutputStream;

public class MyBufferedWriter {

	private OutputStream os;

	public MyBufferedWriter(OutputStream os) {
		super();
		this.os = os;
	}

	// write(char), write(int), write(String), close(), newLine(), ready() i
	// flush().

	public void write(char c) {
		try {
			os.write(c);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void write(int n) {
		try {
			os.write(n);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void write(String s) {
		char[] array1 = s.toCharArray();
		byte[] array = new byte[array1.length];

		for (int i = 0; i < array1.length; i++) {
			array[i] = (byte) array1[i];
		}

		try {
			os.write(array, 0, array.length);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void close(){
		try {
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void newLine(){
		try {
			os.write('\n');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void flush(){
		try {
			os.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
