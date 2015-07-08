package ba.bitcamp.exercises.ass9_23;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FontsArray extends JFrame {

	private static final long serialVersionUID = -6635663115015461602L;

	JLabel[] text = new JLabel[40];
	Font[] fonts = new Font[40];
	String font = " Example ";

	public FontsArray() {
		setLayout(new FlowLayout(FlowLayout.CENTER));
		

		for(int i = 0; i < 40; i++){
			fonts[i] = new Font("Serif", Font.PLAIN, i + 1);
			text[i] = new JLabel();
			text[i].setFont(fonts[i]);
			text[i].setText(font);
			add(text[i]);
			
		}
		
		
		
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FontsArray();

	}

}
