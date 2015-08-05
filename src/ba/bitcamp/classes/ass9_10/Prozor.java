//package ba.bitcamp.classes.ass9_10;
//
//import java.awt.Color;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JCheckBox;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
//
//public class Prozor extends JFrame {
//
//	private static final long serialVersionUID = 7827336592641845727L;
//	private int fullWidth = 400, fullHeight = 600;
//	JPanel panel = new JPanel();
//	
//	//labels
//	JLabel nameLabel = new JLabel("Name: ");
//	JLabel emailLabel = new JLabel("E-mail: ");
//	
//	//textfields
//	JTextField nameField = new JTextField(25);
//	JTextField emailField = new JTextField(25);
//	
//	JTextArea terms = new JTextArea(10, 30);
//	JButton submit = new JButton("SUBMIT");
//	JCheckBox cb = new JCheckBox("I accept.");
//	
//	
//	
//	public Prozor() {
//		add(panel);
//		panel.add(nameLabel);
//		panel.add(nameField);
//		
//		panel.add(emailLabel);
//		panel.add(emailField);
//		panel.add(terms);
//		panel.add(cb);
//		
////		cb.addActionListener(new ActionListener(){
////			@Override
////			public void actionPerformed(ActionEvent e) {
////				JCheckBox cb = (JCheckBox)e.getSource();
////				submit.setEnabled(cb.isSelected());
////				
////			}
////		});
//		panel.add(submit);
//		submit.setEnabled(true);
//		submit.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				if(cb.isSelected()){
//				
//				String name = nameField.getText();
//				String email = emailField.getText();
//				System.out.println("Name: " + name + "\n" + "E-mail: " + email);
//				} else {
//					JOptionPane.showMessageDialog(null,"You need to accept conditions first!");
//					nameField.setText("");
//					emailField.setText("");
//				}
//			}
//		});
//		
//		
//		terms.setLineWrap(true);
//		terms.setEditable(false);
//		terms.setText("I am covering my ears like a kid, when your words mean nothing I go LALALA.");
//		setTitle("Novo");
//		setSize(fullWidth, fullHeight);
//		setLocationRelativeTo(null);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setVisible(true);
//	}
//
//	public static void main(String[] args) {
//		new Prozor();
//	}
//
//}
