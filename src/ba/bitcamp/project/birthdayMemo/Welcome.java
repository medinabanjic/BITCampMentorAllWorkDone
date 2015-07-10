package ba.bitcamp.project.birthdayMemo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Welcome extends JFrame{

	private static final long serialVersionUID = 152107980606741342L;
	
	//Panels
	
	JPanel welcome1 = new JPanel();
	JPanel welcome2 = new JPanel();
	JPanel choose1 = new JPanel();
	JPanel search1 = new JPanel();
	JPanel add1 = new JPanel();
	JPanel add2 = new JPanel();
	
	//Labels
	
	JLabel wLabel1 = new JLabel("You are?");
	JLabel aLabel1 = new JLabel("Name");
	JLabel aLabel2 = new JLabel("Date");
	
	//Buttons
	
	JButton wLogIn = new JButton("LOG IN");
	JButton wExit = new JButton("EXIT");
	JButton cSearch = new JButton("Search for birthdays");
	JButton cAdd = new JButton("Add new birthday");
	JButton cLogOut = new JButton("LOG OUT");
	JButton sVname = new JButton("View by name");
	JButton sVmonth = new JButton("View by month");
	JButton sVall = new JButton("View all");
	JButton sCancel = new JButton("Cancel");
	JButton aAdd = new JButton("ADD");
	JButton aCancel = new JButton("Cancel");
	
	//Text Fields
	
	JTextField wUsername = new JTextField(20);
	JTextField aName = new JTextField(20);
	JTextField aDate = new JTextField(20);

	//Text Areas
	
	JTextArea wNote = new JTextArea(" Note: "
			+ "\n If you are a new user, choose your username "
			+ "\n and use it next time. It will automatically "
			+ "\n save it.");
	
	JTextArea aNote = new JTextArea("Note: "
			+ "Please enter date in format 'dd.mm.'!");
	
	
	//Variables
	
	private static String filename = "";
		
	public static String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public Welcome(){
		//Welcome frame
		
		setTitle("Welcome!");
		setBackground(Color.WHITE);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setResizable(false);
		
		// Plane 1
		add(welcome1, BorderLayout.NORTH);
		welcome1.setLayout(new FlowLayout(FlowLayout.CENTER));
		welcome1.setPreferredSize(new Dimension(150, 100));
		welcome1.add(wLabel1);
		welcome1.add(wUsername);
		
		//Log In button
		welcome1.add(wLogIn);
		wLogIn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TextIO.readFile("src/ba/bitcamp/project/birthdayMemo/usernames.txt");
				filename = wUsername.getText() + ".txt";
				while(!TextIO.eof()){
					String user = TextIO.getln();
					if (!user.equals(wUsername.getText())) {
						TextIO.writeFile("src/ba/bitcamp/project/birthdayMemo/" + filename);
					}
					
					TextIO.readStandardInput();
				}
			}
		});
		
		welcome1.add(wExit);
		
		// Plane 2
		add(welcome2, BorderLayout.CENTER);
		welcome2.setLayout(new BorderLayout());
		welcome2.add(wNote);
		wNote.setEditable(false);
				
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Welcome();
	}

}
