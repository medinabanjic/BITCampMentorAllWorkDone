package ba.bitcamp.classes.ass8;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import ba.bitcamp.classes.ass8.Main2.BH;

public class MAIN3 extends JFrame{

	
		JFrame window = new JFrame();
		private JLabel l1 = new JLabel("Prva");
		private JButton b1 = new JButton("Button");
		private int counter = 0;
		
		public MAIN3() {

			setVisible(true);

			add(b1, BorderLayout.SOUTH);
			add(l1);
			l1.setHorizontalAlignment(SwingConstants.CENTER);
			setTitle("2");
			setSize(300, 200);
			setLocation(700, 350);
			setDefaultCloseOperation(3);
			b1.addActionListener(new BH());
		}

		public void ActionPerformed(ActionEvent e) {

			System.exit(EXIT_ON_CLOSE);

		}

		public static void main(String[] args) {

			new MAIN3();
		}

		public class BH implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				
				switch (counter){
				case 0 : l1.setText("Prva");
				counter++;
				break;
				case 1 : l1.setText("Druga");
				counter++;
				break;
				case 2 : l1.setText("Treca");
				counter++;
				break;
				default : counter = 0;
				break;
			
				}
				
				
			}
		}}