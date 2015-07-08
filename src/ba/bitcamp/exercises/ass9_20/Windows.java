package ba.bitcamp.exercises.ass9_20;

import javax.swing.JOptionPane;

public class Windows {

	public static void main(String[] args) {
		int sum = 0;
		int a = 0;
		boolean stop = true;
		while (stop) {
			try {
				a = Integer.parseInt(JOptionPane
						.showInputDialog("Enter a number"));
				sum += a;
			} catch (NumberFormatException e) {
				if (String.valueOf(a).equals(null)) {
					if (Integer.parseInt(String.valueOf(a)) == 0) {
						a = 0;
						JOptionPane.showMessageDialog(null, "Sum is " + sum);
						stop = false;
					} else {
						System.exit(0);
					}
				}
			}

			int choice = JOptionPane.showConfirmDialog(null,
					"Do you want to enter one more number?");

			if (choice == JOptionPane.YES_OPTION) {
				sum += a;
			} else if (choice == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "Sum is " + sum);
			} else if (choice == JOptionPane.CANCEL_OPTION) {
				System.exit(0);
			}

		}

	}
}
