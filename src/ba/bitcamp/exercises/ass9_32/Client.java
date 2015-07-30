package ba.bitcamp.exercises.ass9_32;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try {
			System.out.println("[CLIENT] Application started.");
			Socket socket = new Socket("10.0.82.105", 8888);
			System.out.println("[CLIENT] Connected to localhost.");

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			System.out.println("I/O operating available now.");

			//System.out.println("Server: " + reader.readLine());
			writer.write("/web http://stackoverflow.com/users/5010249/medina-banjic"
					+ "");
			writer.newLine();
			writer.flush();

			//Scanner input = new Scanner(System.in);

			// System.out.println("Server: " + reader.readLine());
			// System.out.print("Msg: ");
			// writer.write(input.nextLine());
			// writer.flush();

//			boolean end = false;
//			while (!end) {
//				System.out.println("Server: " + reader.readLine());
//
//				System.out.println("Msg: ");
//				writer.write(input.nextLine());
//				writer.newLine();
//				writer.flush();
//			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		;

	}

}
