//package ba.bitcamp.project.birthdayMemo;
//
//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.Dimension;
//import java.awt.FlowLayout;
//import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
//
//public class Search extends JFrame {
//
//	private static final long serialVersionUID = -6885018973970669424L;
//
//		//Planes
//	
//		JPanel search1 = new JPanel();
//		
//		//Buttons
//		
//		JButton sVname = new JButton("View by name");
//		JButton sVmonth = new JButton("View by month");
//		JButton sVall = new JButton("View all");
//		JButton sCancel = new JButton("Cancel");
//		
//		public Search(){
//			//Welcome frame
//			
//			setTitle("SEARCH");
//			setBackground(Color.WHITE);
//			setLayout(new BorderLayout());
//			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			setSize(300, 400);
//			setResizable(false);
//			
//			// Plane 1
//			add(search1);
//			search1.setLayout(new GridLayout(4, 1));
//			search1.add(sVname);
//			search1.add(sVmonth);
//			search1.add(sVall);
//			search1.add(sCancel);
//			
//			//search via name button
//			sVname.addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					String name = JOptionPane.showInputDialog("Enter name: ");
//					TextIO.readFile("src/ba/bitcamp/project/birthdayMemo/" + Welcome.getFilename());
//						
//						
//						TextIO.readStandardInput();
//					}
//				
//			});
//			
//			welcome1.add(wExit);
//			
//			// Plane 2
//			add(welcome2, BorderLayout.CENTER);
//			welcome2.setLayout(new BorderLayout());
//			welcome2.add(wNote);
//			wNote.setEditable(false);
//					
//			setVisible(true);
//			
//		}
//		
//		public static void main(String[] args) {
//			new Search();
//		}
//
// }