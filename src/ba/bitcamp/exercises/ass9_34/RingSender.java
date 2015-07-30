package ba.bitcamp.exercises.ass9_34;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class RingSender {

	public static void main(String[] args) {

		String msg = "";
		// primi poruku od ognjena
		try {
			System.out.println("Cekam poruku od Ognjena.");
			ServerSocket server = new ServerSocket(1993);
			Socket fromEdin = server.accept();
			System.out.println("Ognjen konektovan.");
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					fromEdin.getInputStream()));
			msg = reader.readLine();
			System.out.println("Poruka: " + msg);

			// posalji poruku edinu

			Socket socket = new Socket("10.0.82.63", 6699);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));

			writer.write(msg);
			writer.newLine();
			writer.close();
			System.out.println("Poslala sam poruku Ognjenu.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
