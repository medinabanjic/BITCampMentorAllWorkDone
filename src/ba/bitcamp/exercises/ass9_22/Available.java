//package ba.bitcamp.exercises.ass9_22;
//
//import java.awt.FlowLayout;
//import java.awt.Dialog.ModalityType;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.AbstractButton;
//import javax.swing.JButton;
//import javax.swing.JDialog;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//
//public class Available extends JFrame {
//
//	private static final long serialVersionUID = -1128150328428751475L;
//	private String[] emails {};
//	private String email = "";
//	private JPanel panel = new JPanel();
//	private JTextField e = new JTextField(15);
//	private JButton submit = new JButton("OK");
//	private JDialog d1 = new JDialog();
//	private JLabel message = new JLabel(email);
//	
//	
//	public Available(){
//		add(panel);
//		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
//		panel.add(e);
//		panel.add(submit);
//		d1.setModalityType(ModalityType.MODELESS);
//		d1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//		d1.setSize(200, 100);
//		d1.setLocationRelativeTo(null);
//		d1.setTitle("Warning");
//		
//		submit.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent er) {
//				for (int i = 0; i < emails.length ; i++){
//					if (emails[i].equals(e.getText())){
//						email = "E-mail is used!";
//						e.setText("");
//						d1.add(message);
//						message.setText(email);
//						d1.setVisible(true);
//						dispose();
//						break;
//					} else {
//						if (emails[i] == null){
//							emails[i] = e.getText();
//						}
//					}
//					
//								
//				}
//				
//			}
//		});
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setSize(200, 100);
//		setLocationRelativeTo(null);
//		setTitle("MODAL");
//		setVisible(true);
//	}
//	
//	public static void main(String[] args) {
//		new Available();
//
//	}
//
//}
