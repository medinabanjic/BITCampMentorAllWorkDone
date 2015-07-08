package ba.bitcamp.exercises.ass9_23;

import java.util.ArrayList;

public class Main {

	public static void shiftArray(ArrayList<Book> books) {
		books.add(0, books.get(0));
		books.remove(books.size() - 1);
	}

	public static ArrayList<String> removeNulls(String... params) {
		ArrayList<String> words = new ArrayList<>();
		
		for (int i = 0; i < params.length; i++){
			words.add(params[i]);
		}
		
		for (int i = 0; i < words.size(); i++){
			if (words.get(i) == null){
				words.remove(i);
			}
		}
		
		return words;
	}

	public static void main(String[] args) {
		Book[] b = new Book[5];
		b[0] = new Book("Neka Knjiga");
		b[1] = new Book("Opet Neka Knjiga");
		b[2] = new Book("I Opet");
		b[3] = new Book("Da, Opet");
		b[4] = new Book("AAAAA");

		ArrayList<Book> books = new ArrayList<>();
		for (int i = 0; i < b.length; i++) {
			books.add(b[i]);
		}

		shiftArray(books);
		for (Book value : books) {
			System.out.println(value);
		}

		System.out.println();

		for (Book value : b) {
			System.out.println(value.toString());
		}

		System.out.println();

		System.out.println("These books are same: " + b[0].equals(b[2]));
		
		ArrayList<String> word = removeNulls(null, "Medina", "pauza", null);

		System.out.println();

		for (String value : word) {
			System.out.print(value.toString() + " ");
		}

		System.out.println();
	}

}
