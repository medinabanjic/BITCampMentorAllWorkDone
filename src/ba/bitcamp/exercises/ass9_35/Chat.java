package ba.bitcamp.exercises.ass9_35;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Chat extends JFrame {

	private static final long serialVersionUID = 7672957346464923551L;
	JPanel panel = new JPanel();
	JTextField message = new JTextField(40);
	JButton send = new JButton("SEND");
	String text = "";

	public Chat() {
		setLayout(new BorderLayout());
		setTitle("Chat Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 200);
		setResizable(false);

		add(panel);
		panel.setLayout(new BorderLayout());
		panel.add(message, BorderLayout.CENTER);
		panel.add(send, BorderLayout.SOUTH);
		send.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text = message.getText();

				System.out.println("[CLIENT] Application started.");
				Socket socket;
				try {
					socket = new Socket("10.0.82.17", 1993);
					System.out.println("[CLIENT] Connected to localhost.");

					BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
					System.out.println("I/O operating available now.");

					writer.write(text);
					writer.newLine();
					writer.flush();
					message.setText("");
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {
		new Chat();
	}

}
