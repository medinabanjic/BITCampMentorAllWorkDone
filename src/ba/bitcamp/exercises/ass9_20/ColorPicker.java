package ba.bitcamp.exercises.ass9_20;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorPicker extends JPanel {

	private static final long serialVersionUID = -4174150241623787053L;

	private int red;
	private int green;
	private int blue;
	private JButton click;
	Font font = new Font("Serif", Font.BOLD, 25);
	
	public ColorPicker(int width, int height) {

		initButton(width, height);
		
		int sliderHeight = (height / 7);
		Dimension sliderDimension = new Dimension(width - 55, sliderHeight);
		
		
		JSlider redSlider = new JSlider(0, 255);
		initSlider(redSlider, "red", sliderDimension);
		
		JSlider blueSlider = new JSlider(0, 255);
		initSlider(blueSlider, "blue", sliderDimension);
		
		JSlider greenSlider = new JSlider(0, 255);
		initSlider(greenSlider, "green", sliderDimension);
		
		//labels
		
		JLabel redLabel = new JLabel("RED");
		JLabel blueLabel = new JLabel("BLUE");
		JLabel greenLabel = new JLabel("GREEN");

		add(click);
		add(redLabel);
		add(redSlider);
		add(blueLabel);
		add(blueSlider);
		add(greenLabel);
		add(greenSlider);
		;
		

	}

	private void initSlider(JSlider slider, String name, Dimension d) {
		slider.setName(name);
		slider.setPreferredSize(d);
		slider.setValue(0);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(25);
		slider.setPaintTicks(true);
		slider.setOrientation(JSlider.VERTICAL);
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider changed = (JSlider)e.getSource();
				
				//String name = changed.getName();
				switch(name){
				case "red":
					red = changed.getValue();
					break;
				case "green":
					green = changed.getValue();
					break;
				case "blue":
					blue = changed.getValue();
					break;
				}
				
				updateButton();
				
			}
		});

	}

	public static void main(String[] args) {
		JFrame window = new JFrame("Picker");

		ColorPicker cp = new ColorPicker(500, 500);
		window.add(cp);

		window.setSize(500, 500);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void updateButton(){
		click.setBackground(new Color(red, blue, green));
		click.setOpaque(true);
		click.setBorderPainted(false);
		click.setForeground(new Color(255 - red, 255 - blue, 255 - green));
	}
	
	private void initButton(int width, int height){

		
		click = new JButton("Click me");
		click.setFont(font);
		click.setPreferredSize(new Dimension(width , height / 2));
		click.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Clipboard clip = 
						Toolkit.getDefaultToolkit()
						.getSystemClipboard();
				String copy = String.format("%d, %d, %d", red, blue, green);
				clip.setContents(new StringSelection(copy), null);
			}
		});
		updateButton();
	}
}
