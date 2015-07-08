package ba.bitcamp.exercises.ass9_23;

public class Book {

	private String name;
	private String author;
	private int year;

	public Book(String name, String author, int year) {
		super();
		this.name = name;
		this.author = author;
		this.year = year;
	}

	public Book(String name, String author) {
		this(name, author, 2000);
	}

	public Book(String name) {
		this(name, "Dickens", 2000);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", year=" + year
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

}
