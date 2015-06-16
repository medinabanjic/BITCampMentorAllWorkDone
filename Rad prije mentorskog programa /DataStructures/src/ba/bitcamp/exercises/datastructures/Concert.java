package ba.bitcamp.exercises.datastructures;

public class Concert {

	public Artist[] artists;
	public Song[] songsConcert;

	public Concert(Artist[] artists, Song[] songsConcert) {
		super();
		this.artists = artists;
		this.songsConcert = songsConcert;
	}

	public String toString() {
		String s = "";

		for (int i = 0; i < artists.length; i++) {

			s += "\nArtist:\n " + artists[i] + "\n";
		}

		for (int i = 0; i < songsConcert.length; i++) {

			s += "\nSong:\n " + songsConcert[i] + "\n";
		}

		return s;
	}

}
