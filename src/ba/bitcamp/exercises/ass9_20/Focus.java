package ba.bitcamp.exercises.ass9_20;

import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Focus extends JFrame {

	private static final long serialVersionUID = -4592825089563395497L;

	private String text = "";
	private JLabel label = new JLabel(text);

	public Focus() {
		add(label);
		label.setFont(new Font("Sans Serif", Font.PLAIN, 35));
		label.setHorizontalAlignment(JLabel.CENTER);

		addFocusListener(new Focuses());

		setTitle("FocusListener example");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Focus();
	}

	private class Focuses implements FocusListener {

		@Override
		public void focusGained(FocusEvent arg0) {
			text = "Focused";
			label.setText(text);
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			text = "Not focused";
			label.setText(text);
		}

	}

}
