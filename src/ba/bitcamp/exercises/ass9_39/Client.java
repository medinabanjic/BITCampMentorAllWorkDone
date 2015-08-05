package ba.bitcamp.exercises.ass9_39;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {

		try {
			System.out.println("[CLIENT] Application started.");
			Socket socket = new Socket("10.0.82.105", 8888);
			System.out.println("[CLIENT] Connected to localhost.");

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			System.out.println("I/O operating available now.");

			writer.write("");
			writer.newLine();
			writer.flush();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
