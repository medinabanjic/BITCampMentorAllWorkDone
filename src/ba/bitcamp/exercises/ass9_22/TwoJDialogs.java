package ba.bitcamp.exercises.ass9_22;

import java.awt.GridLayout;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TwoJDialogs extends JFrame{

	private static final long serialVersionUID = -8099964814494266716L;

	private JPanel panel = new JPanel();
	
	private JButton one = new JButton("MODELESS");
	private JButton two = new JButton("MODAL");
	
	private JDialog d1 = new JDialog();
	private JDialog d2 = new JDialog();
	
	public TwoJDialogs(){
		add(panel);
		panel.setLayout(new GridLayout(2 , 1));
		panel.add(one);
		d1.setModalityType(ModalityType.MODELESS);
		d1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		d1.setSize(200, 100);
		d1.setLocationRelativeTo(null);
		d1.setTitle("MODELESS");
		one.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				d1.setVisible(true);
				
			}
		});
		panel.add(two);
		d2.setModalityType(ModalityType.APPLICATION_MODAL);
		d2.setModalityType(ModalityType.MODELESS);
		d2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		d2.setSize(200, 100);
		d2.setLocationRelativeTo(null);
		d2.setTitle("MODELESS");
		two.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				d2.setVisible(true);
				
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 100);
		setLocationRelativeTo(null);
		setTitle("MODAL");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TwoJDialogs();

	}

}
