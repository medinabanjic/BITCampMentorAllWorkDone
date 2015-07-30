package ba.bitcamp.exercises.ass9_27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class IntIterator {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		// Adding
		for (int i = 0; i < 20; i++) {
			list.add((int) (Math.random() * 50 + 51));
		}

		ArrayList<Integer> newList = new ArrayList<>();

		// long start = System.currentTimeMillis();
		ListIterator<Integer> it = list.listIterator();
		while (it.hasNext()) {
			newList.add(it.next());
		}
		while (it.hasPrevious()) {
			newList.add(it.previous());
		}

		// System.out.println(System.currentTimeMillis() - start);
		System.out.println(list);
		System.out.println(newList);
	}

}
