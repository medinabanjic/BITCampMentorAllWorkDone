package ba.bitcamp.exercises.ass9_39;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		try {

			System.out.println("Application started.");
			ServerSocket server = new ServerSocket(1993);
			System.out.println("Server socket made.");

			System.out.println("Listening to client.");
			Socket client = server.accept();
			System.out.println("Client found.");

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));

			System.out.println("Client: " + reader.readLine());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
