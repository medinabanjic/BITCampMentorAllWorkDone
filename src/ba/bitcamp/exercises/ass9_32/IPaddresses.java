package ba.bitcamp.exercises.ass9_32;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class IPaddresses {

	public static String getRandom(HashMap<String, String> h) {
		Random generator = new Random();
		Object[] addresses = h.keySet().toArray();
		String randomKey = "";
		while (true) {
			randomKey = (String) addresses[generator.nextInt(addresses.length)];
			if (!randomKey.equals("10.0.82.17")) {
				break;
			}
		}
		return randomKey;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		HashMap<String, String> ips = new HashMap<>();
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("IP.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find file!");
			e.printStackTrace();
		}

		try {
			while (in.ready()) {
				String line = in.readLine();
				if (!line.equals("")) {
					StringTokenizer st = new StringTokenizer(line, " ");
					String address = st.nextToken();
					String name = st.nextToken();

					ips.put(address, name);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(ips);
		System.out.println(getRandom(ips));

		String msg = "";
		// Server
		// 8888
		try {
			ServerSocket server = new ServerSocket(8888);
			System.out.println("Server socket made.");

			System.out.println("Listening to client.");

			Socket client = server.accept();
			System.out.println("Neko konektovan.");
			InetAddress ip = client.getInetAddress();
			String address = ip.getHostAddress();
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			msg = reader.readLine();
			System.out.println(ips.get(address) + ": " + msg);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scanner add = new Scanner(System.in);
		System.out.println("Enter text: " + msg);
		msg += " " + add.nextLine();

		// Socket1
		try {
			Socket socket = new Socket("10.0.82.98", 8888);
			System.out.println("[CLIENT] Connected to localhost.");

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));

			writer.write(msg);
			writer.newLine();
			writer.flush();
			System.out.println("Poslala sam poruku Zaidu.");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		while (true) {
			// Socket2
			try {
				String rand = getRandom(ips);
				Socket socket = new Socket(rand, 8888);

				System.out.println("[CLIENT] Connected to localhost.");

				BufferedWriter writer = new BufferedWriter(
						new OutputStreamWriter(socket.getOutputStream()));

				writer.write(msg);
				writer.newLine();
				writer.flush();
				System.out.println("Poslala sam poruku " + ips.get(rand));
				break;

			} catch (ConnectException e) {
				System.out.println("Looking for a new address...");

			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
