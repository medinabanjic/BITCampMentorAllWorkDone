package ba.bitcamp.exercises.ass9_25;

public class Song {

	public static final String JAZZ = "Jazz";
	public static final String ROCK = "Rock";
	public static final String POP = "Pop";
	private String name;
	private String author;
	private int year;
	private String genre;

	public Song(String name, String author, int year, String genre) {
		super();
		this.name = name;
		this.author = author;
		this.year = year;
		this.genre = genre;
	}

	public String toString() {
		String s = "";
		s += "Name: " + name + "\nAuthor: " + author + "\nYear: " + year
				+ "\nGenre: " + genre + "\n";

		return s;
	}

}
