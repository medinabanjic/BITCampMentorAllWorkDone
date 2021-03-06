package ba.bitcamp.dreamteam;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Medina {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow f) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		g.setColor(Color.LIGHT_GRAY);

		int x = 300;
		int y = 300;
		int w = 200;
		int h = 200;

		g.fillRect(0 + x, 0 + y, 200 + w, 200 + h);

		g.setColor(Color.ORANGE);
		g.fillOval(10 + x, 10 + y, 100 + w, 100 + h);

		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(20 + x, 10 + y, 100 + w, 100 + h);

		g.setColor(new Color(60, 10, 70));
		g.fillOval(25 + x, 10 + y, 100 + w, 100 + h);

		g.setColor(Color.BLACK);
		g.drawOval(25 + x, 10 + y, 100 + w, 100 + h);
		g.drawOval(24 + x, 10 + y, 100 + w, 100 + h);

		g.setColor(Color.WHITE);
		g.drawLine(25 + x, 60 + y, 125 + x, 60 + y);
		g.drawLine(25 + x, 61 + y, 125 + x, 61 + y);
		g.drawLine(25 + x, 62 + y, 125 + x, 62 + y);
		g.drawLine(25 + x, 58 + y, 125 + x, 58 + y);
		g.drawLine(25 + x, 59 + y, 125 + x, 59 + y);

		g.drawLine(25 + x, 53 + y, 125 + x, 53 + y);
		g.drawLine(25 + x, 52 + y, 125 + x, 52 + y);
		g.drawLine(25 + x, 51 + y, 125 + x, 51 + y);
		g.drawLine(25 + x, 50 + y, 125 + x, 50 + y);
		g.drawLine(25 + x, 49 + y, 125 + x, 49 + y);

		g.drawLine(25 + x, 67 + y, 125 + x, 67 + y);
		g.drawLine(25 + x, 68 + y, 125 + x, 68 + y);
		g.drawLine(25 + x, 69 + y, 125 + x, 69 + y);
		g.drawLine(25 + x, 70 + y, 125 + x, 70 + y);
		g.drawLine(25 + x, 71 + y, 125 + x, 71 + y);

		f.setImage(img);
	}

}
