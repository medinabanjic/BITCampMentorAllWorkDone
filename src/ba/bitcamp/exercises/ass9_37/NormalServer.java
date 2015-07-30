package ba.bitcamp.exercises.ass9_37;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class NormalServer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		SimpleDateFormat formatter = new SimpleDateFormat(
				"yyyy-MM-dd  HH:mm:ss ");
		formatter.setTimeZone(TimeZone.getTimeZone("GMT+2"));

		Calendar cal = Calendar.getInstance();
		String timestamp = formatter.format(cal.getTime());

		try {
			@SuppressWarnings("resource")
			ServerSocket server = new ServerSocket(1993);

			System.out.println("Server started.");
			while (true) {
				Socket client = server.accept();
				System.out.println(client.getInetAddress().getHostAddress());
				String address = client.getInetAddress().getHostAddress();

				@SuppressWarnings("resource")
				FileWriter fs = new FileWriter(new File("src/statistics.txt"), true);
				
				fs.write(address + "  " + timestamp + "\n");
				fs.write("\n");
				fs.flush();
				
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
				String text = "Enter number (1 - picture" + ", " + "2 - IP addresses):";
				writer.write(text);
				writer.newLine();
				writer.flush();
				
				BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
				String choice = reader.readLine() + "";
							
				
				String htmlDoc = "";

				reader = new BufferedReader(new FileReader(new File(
						"src/example.html")));
				String htmlFile = "";

				while (reader.ready()) {
					htmlFile += reader.readLine();
				}

				htmlFile += "</p></body></html>";
				writer.write(htmlFile);
				writer.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
