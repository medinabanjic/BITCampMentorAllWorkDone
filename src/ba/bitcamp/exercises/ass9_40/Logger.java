package ba.bitcamp.exercises.ass9_40;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Logger {

	public static void main(String[] args) {

		try {
			while (true) {
				ServerSocket server = new ServerSocket(1993);
				Socket client = new Socket();

				client = server.accept();
				System.out.println("Client found!");

				BufferedReader br = new BufferedReader(new InputStreamReader(
						client.getInputStream()));

				int N = br.read();
				String msg = br.readLine();
				Thread t = new Threads(N, msg);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static class Threads extends Thread {
		private File logger = new File("src/logger");
		private int N = 0;
		private String msg = "";

		public Threads(int N, String msg) {
			this.N = N;
			this.msg = msg;
		}

		public void writeInLogger(String s) {
			try {
				PrintWriter pw = new PrintWriter(logger);
				pw.write(s);
				pw.flush();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		}

		public void checkInfo(int N, String msg) {

			try {
				switch (N) {
				case 1:
					Double d = Double.parseDouble(msg);
					writeInLogger("[Temperature] " + msg + " K");
					break;
				case 2:
					Integer i = Integer.parseInt(msg);
					writeInLogger("[Pressure] " + msg + " hPa");
					break;
				case 3:
					Boolean.parseBoolean(msg);
					writeInLogger("[MOVEMENT] " + msg);
					break;
				case 4:
					writeInLogger("[COMM. ERROR]" + msg);
					break;
				default:
					writeInLogger("[COMM. ERROR] "
							+ N
							+ " is not a valid communication identification number!");
				}

			} catch (NumberFormatException e) {
				writeInLogger("[COMM. ERROR] " + msg
						+ " is not a valid message type!");

			}
		}

		@Override
		public void run() {
			checkInfo(N, msg);
			super.run();
		}

	}

}
