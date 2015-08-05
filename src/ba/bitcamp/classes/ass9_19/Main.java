package ba.bitcamp.classes.ass9_19;

import java.io.*;

public class Main {

	public static void printByteArray(byte[] array) {
		for (byte b : array) {
			System.out.print((char) b);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		InputStream is = null;
		OutputStream os = System.out;

		try {
			is = new FileInputStream("src/nesto.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Reader r = new InputStreamReader(is);
		Writer w = new OutputStreamWriter(os);
		BufferedReader br = new BufferedReader(r);
		BufferedWriter bw = new BufferedWriter(w);

		try {
			while (br.ready()){
			String line = br.readLine() + "\n" ;
			bw.write(line);
			bw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
