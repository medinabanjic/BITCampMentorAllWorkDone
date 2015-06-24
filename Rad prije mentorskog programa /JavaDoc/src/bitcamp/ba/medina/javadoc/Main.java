package bitcamp.ba.medina.javadoc;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Main {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();

		g.setColor(Color.black);
		g.drawRect(145, 10, 130, 20);
		Font f = new Font("Arial", Font.BOLD, 14);
		g.setFont(f);
		g.drawString("API Packages", 165, 25);
		
		System.out.println("I drawed a rectangle and wrote API Packages inside.");
		
		g.drawLine(20, 40, 270, 40);

		w.setImage(img);
	}
}
