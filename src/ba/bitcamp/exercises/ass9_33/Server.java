package ba.bitcamp.exercises.ass9_33;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.imageio.ImageIO;

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
			
			
			
			File file = new File("output.jpg");
			
			try {
				BufferedImage image = ImageIO.read(file);
			} catch (IOException e) {
				System.out.println("IO Exception.");
				e.printStackTrace();
				System.exit(1);
			}

			try {
				FileInputStream in = new FileInputStream(file);
				DataOutputStream os = new DataOutputStream(client.getOutputStream());
				byte[] data = new byte[1024]; 
				int bytesRead;
				
				while((bytesRead = in.read(data, 0, 1024)) > 0){
					os.write(data, 0, bytesRead);
				}
				os.flush();
				System.out.println("Image sent.");
				
			
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			
			
			
			
			
			
			
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			Scanner input = new Scanner(System.in);
			
			boolean end = false;
			while(!end){
				System.out.println("Client: " + reader.readLine());
				
				
//				System.out.println("Msg: ");
//				writer.write(input.nextLine());
//				writer.newLine();
//				writer.flush();
//				
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
