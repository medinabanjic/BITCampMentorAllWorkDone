package ba.bitcamp.exercises.ass9_38;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		System.out.println("Application started.");
		// 10.0.82.17
		try {
			ServerSocket server = new ServerSocket(1993);
			System.out.println("Server socket made.");

			while (true) {
				Socket client = server.accept();

				Thread t = new Thread(new ClientThread(client));
				t.start();
			}
		} catch (Exception e) {
			System.out.println("Bug");
		}
	}

	public static class ClientThread implements Runnable {

		private Socket client;

		public ClientThread(Socket client) {
			super();
			this.client = client;
		}

		@Override
		public void run() {
			try {
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(client.getInputStream()));

				Scanner input = new Scanner(System.in);

		

					System.out.println("Client: " + reader.readLine());

//					System.out.println("Msg: ");
//					writer.write(input.nextLine());
//
//					writer.newLine();
//					writer.flush();
				
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
