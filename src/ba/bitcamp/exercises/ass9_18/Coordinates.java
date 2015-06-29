package ba.bitcamp.exercises.ass9_18;


	import java.awt.event.MouseEvent;
	import java.awt.event.MouseMotionListener;

	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;

	public class Coordinates extends JFrame {

		private static final long serialVersionUID = 2960004784751333508L;
		private JPanel panel = new JPanel();
		private JLabel label = new JLabel();

		public Coordinates() {
			add(panel);
			panel.add(label);
			label.setHorizontalAlignment(JLabel.CENTER);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setSize(300, 200);
			panel.addMouseMotionListener(new Mouse());
			setVisible(true);
		}

		private class Mouse implements MouseMotionListener {

			@Override
			public void mouseDragged(MouseEvent e) {
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				if (e.getSource() == panel) {
					e.getX();
					e.getY();
					label.setText("x=" +e.getX() +" " +"y=" + e.getY());
				}
			}
		}

		public static void main(String[] args) {
			new Coordinates();
		}
}
