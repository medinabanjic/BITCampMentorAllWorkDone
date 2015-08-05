package ba.bitcamp.classes.ass9_11;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Layouts {

	public static void main(String[] args) {
		JFrame window = new JFrame("Layouts");
		JPanel container = new JPanel();
		
		container.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
		
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JButton[] buttons = new JButton[5];
		for (int i = 0; i < buttons.length; i++){
			buttons[i] = new JButton("Button " + i);
			buttons[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 5, true));
			buttons[i].setBackground(new Color((int)(Math.random() * 256 - 1), (int)(Math.random() * 256 - 1 ), (int)(Math.random() * 256 - 1)));
			buttons[i].setPreferredSize(new Dimension(100, 100));
//			buttons[i].setOpaque(true);
//			buttons[i].setBorderPainted(false);
			
			container.add(buttons[i]);
			
		}
		
		window.add(container);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400, 400);
		window.setVisible(true);
		

	}
}
