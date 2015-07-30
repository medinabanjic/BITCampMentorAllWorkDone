package ba.bitcamp.exercises.ass9_28;

import java.awt.Component;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import javax.swing.JButton;

public class Task01 {

	public static <T> void printAll(Collection<T> col) {
		Iterator<T> it = col.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "  ");
		}
	}

	public static <T> int countOccurences(Collection<T> col, T object) {
		Iterator<T> it = col.iterator();
		int counter = 0;
		while (it.hasNext()) {
			if (it.next().equals(object)) {
				counter++;
			}
		}
		return counter;
	}

	public static <T extends Component> void printComponentInfo(LinkedList<Object> list) {
		Iterator<Object> it = list.iterator();
		while (it.hasNext()) {
			Component o = (Component) it.next();
				System.out.print(o.getWidth() + "  ");
				System.out.print(o.getHeight() + "  ");
				System.out.print(o.getX() + "  ");
				System.out.println(o.getY() + "  ");
		}
	}

	public static <T> void printType(Collection<T> col) {
		if (col instanceof Map) {
			System.out.println("Type of collection is MAP.");
		} else if (col instanceof List) {
			System.out.println("Type of collection is LIST.");
		} else if (col instanceof Set) {
			System.out.println("Type of collection is SET.");
		} else {
			System.out.println("I do not know what is this.");
		}
	}

	public static void main(String[] args) {
		LinkedList<Object> list = new LinkedList<>();
//		list.add(1);
//		list.add(2.3);
//		list.add(87);
		list.add(new JButton());
//		list.add("medina");
//		list.add("medina");
//		list.add("medina");

		printComponentInfo(list);
		printType(list);
		// System.out.println(countOccurences(list, "medina"));
		// printAll(list);

	}

}
