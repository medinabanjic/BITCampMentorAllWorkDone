package ba.bitcamp.exercises.ass9_37;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("10.0.82.98", 8888);
			System.out.println("[CLIENT] Connected to localhost.");
			
//			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			String text = reader.readLine();
//			System.out.println(text);
			
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//			String choice = "";
//			Scanner in = new Scanner(System.in);
//			choice = in.nextLine();
			writer.write("Spava miiii seeee");
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
