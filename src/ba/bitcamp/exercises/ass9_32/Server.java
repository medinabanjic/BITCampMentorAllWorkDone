package ba.bitcamp.exercises.ass9_32;

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
		//10.0.82.17
		try {
			ServerSocket server = new ServerSocket(1993);
			System.out.println("Server socket made.");

			System.out.println("Listening to client.");
			Socket client = server.accept();
			System.out.println("Client found.");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			writer.write("Djes, sta mai?");
			writer.newLine();
			writer.flush();
			
			System.out.println("Client: " + reader.readLine());
			
			Scanner input = new Scanner(System.in);
			
			boolean end = false;
			while(!end){
				System.out.println("Msg: ");
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();
				
				System.out.println("Client: " + reader.readLine());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
