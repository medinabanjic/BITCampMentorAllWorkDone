package ba.bitcamp.exercises.ass9_32;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientFile {
	public static void main(String[] args) {
		try {
			System.out.println("[CLIENT] Application started.");
			Socket socket = new Socket("10.0.82.98", 7777);
			System.out.println("[CLIENT] Connected to localhost.");

			byte[] b = new byte[1024];
			
			InputStream in = socket.getInputStream();			
			FileOutputStream fileWriter = new FileOutputStream("IP.txt");
			int bytesRead = 0;
			
			while((bytesRead = in.read(b, 0, 1024)) > 0){
				fileWriter.write(b, 0, bytesRead);
			}
			fileWriter.flush();
			
//			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
//					socket.getOutputStream()));
//			System.out.println("I/O operating available now.");
//
//			writer.write("Medina");
//			writer.newLine();
//			writer.flush();

//			Scanner input = new Scanner(System.in);
//
//			// System.out.println("Server: " + reader.readLine());
//			// System.out.print("Msg: ");
//			// writer.write(input.nextLine());
//			// writer.flush();
//
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
}}
