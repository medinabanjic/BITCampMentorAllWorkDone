package ba.bitcamp.exercises.ass9_23;

import java.util.ArrayList;

public class BookStore {

	private Book[] books;

	private int numOfBooks;

	public BookStore() {
		super();
	}

	public BookStore(Book... books) {
		super();
		this.books = books;
	}

	public void setBookOnIndex(int index, Book b) {
		boolean isNew = true;
		ArrayList<Book> book = new ArrayList<>();

		for (int i = 0; i < books.length; i++) {
			if (books[i].equals(b)) {
				isNew = false;
				break;
			}
		}

		if (isNew) {
			for (Book value : books) {
				book.add(value);
			}

			book.add(index, b);
		}
		numOfBooks = book.size();

		books = (Book[]) book.toArray();
	}

	public int findIndex(Book b) {
		int index = 0;
		for (int i = 0; i < books.length; i++) {
			if (books[i].equals(b)) {
				index = i;
				break;
			}
		}
		return index;
	}

	public void removeBooks(Book b, int index) {
		for (int i = index; i < books.length; i++) {
			if (i + 1 < books.length) {
				books[i] = books[i + 1];
			}
		}
		books = new Book[books.length - 1];
		books[books.length - 1] = b;
	}

	public void addBook(Book b) {

		for (int i = 0; i < books.length; i++) {
			if (!books[i].equals(b)) {
				books = new Book[books.length + 1];
				books[books.length - 1] = b;
				break;
			}
		}
	}

}
