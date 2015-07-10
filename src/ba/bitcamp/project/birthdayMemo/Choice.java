package ba.bitcamp.project.birthdayMemo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Choice extends JFrame {

	private static final long serialVersionUID = -8659792827568404845L;

	// Planes
	JPanel choose1 = new JPanel();

	JButton cSearch = new JButton("Search for birthdays");
	JButton cAdd = new JButton("Add new birthday");
	JButton cLogOut = new JButton("LOG OUT");

	public Choice() {
		// Choice frame

		setTitle("What do You want to do?");
		setBackground(Color.WHITE);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setResizable(false);

		// Plane 1
		add(choose1);
		choose1.setLayout(new GridLayout(3, 1));
		choose1.add(cSearch);
		choose1.add(cAdd);
		choose1.add(cLogOut);

		// Search button
		cSearch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// New frame

			}
		});

		// Add button
		cAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// New frame

			}
		});

		// Log Out button
		cLogOut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				}
		});

		setVisible(true);

	}

	public static void main(String[] args) {
		new Choice();
	}

}