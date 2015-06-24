package bitcamp.ba.medina.javadoc;

import java.awt.Font;
/**
 * 
 * @author medina.banjic
 *
 */
public class FontTask {

	/**
	 * Prints <b>font</b> details.
	 * @param f - object <i>f</i> is a font object that we want to check.
	 * <p>
	 * @throws 
	 * 
	 * <i>NullPointerException</i> if the given parameter is null.
	 */
	public static void printFontDetails(Font f) {
		
		if (f == null){
			throw new NullPointerException();
		}

		System.out.println(f.getName());
		System.out.println(f.getSize());

		System.out.println("BOLD " + f.isBold());
		System.out.println("ITALIC " + f.isItalic());
		System.out.println("PLAIN " + f.isPlain());

	}

	public static void main(String[] args) {
		Font f = new Font("Arial", Font.BOLD, 18);

		printFontDetails(f);
	}

}
