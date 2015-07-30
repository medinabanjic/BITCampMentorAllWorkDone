package ba.bitcamp.exercises.ass9_37;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {

	
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ServerSocket server;
		try {
			server = new ServerSocket(1545);

			System.out.println("Server started.");
			while (true) {
				Socket client = server.accept();
				System.out.println(client.getInetAddress().getHostAddress());

				BufferedWriter clientWriter = new BufferedWriter(
						new OutputStreamWriter(client.getOutputStream()));
				BufferedReader clientReader = new BufferedReader(
						new InputStreamReader(client.getInputStream()));

				BufferedReader fileReader = null;
				String htmlDoc = "";

				fileReader = new BufferedReader(new FileReader(new File(
						"src/example.html")));
				String htmlFile = "";

				while (fileReader.ready()) {
					htmlFile += fileReader.readLine();
				}

				htmlFile += "</p></body></html>";
				clientWriter.write(htmlFile);
				clientWriter.flush();
				

				fileReader = new BufferedReader(new FileReader(new File(
						"src/statistics.txt")));
				
				while (fileReader.ready()) {
					htmlDoc += fileReader.readLine() + "<br>\n";
				}

				clientWriter.write(htmlDoc);
				clientWriter.newLine();
				clientWriter.close();
				client.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
