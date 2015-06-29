package ba.bitcamp.exercises.ass9_16;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class MainDrawTree {
		
		private static int lengthX1 = 0;
		private static int lengthY1 = 0;
		private static int lengthX2 = 0;
		private static int lengthY2 = 0;
		
	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void drawRectangles(int n, int m, Graphics g) {
		g.setColor(Color.BLACK);
		for (int x = 100; x <= m * 100; x += 100) {
			for (int y = 100; y <= n * 100; y += 100) {
				g.drawRect(x, y, 100, 100);

			}

		}

	}
	
	public static void drawTree(int n, int m, int j, int i, Graphics g, boolean b){
		g.drawLine(lengthX1,lengthY1, lengthX2, lengthY2);
		
		if (b) {
			lengthX2 = n;
			lengthY1 = m;
			lengthX1 -= 95;
			lengthY1 -= m/2;
			
			if (i - m > 0) {
				drawTree(n, m, j, i, g, true);
				drawTree(n, m, j, i, g, false);
			} else {
				return;
			}
		} else {
			j = n;
			i = m;
			n += 95;
			m -= m/2;
			if (i - m > 0) {
				drawTree(n, m, j, i, g, false);
				drawTree(n, m, j, i, g, true);
			} else {
				return;
			}
		}
		
		g.drawLine(lengthX1 / 2,lengthY1 / 2, lengthX2 * 2, lengthY2 / 2);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****

		g.setColor(Color.black);
		/*
		 * Main tree block
		 */
		lengthX1 = 600;
		lengthY1 = 500;
		lengthX2 = 600;
		lengthY2 = 800;
		
		drawTree(lengthX1,lengthY1, lengthX2, lengthY2, g, true);
		drawTree(lengthX1,lengthY1, lengthX2, lengthY2, g, false);
				
		w.setImage(img);
	}
}