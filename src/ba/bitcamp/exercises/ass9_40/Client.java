package ba.bitcamp.exercises.ass9_40;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 1993);
			System.out.println("[CLIENT] Connected to localhost.");
			Scanner sc = new Scanner (System.in);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			
			
			System.out.println("Input the type of message: ");
			writer.write(sc.nextInt());
			
			System.out.println("Input message: ");
			writer.write(sc.nextLine());
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
