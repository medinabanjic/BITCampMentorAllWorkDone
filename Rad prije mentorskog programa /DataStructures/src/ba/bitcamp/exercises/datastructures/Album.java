package ba.bitcamp.exercises.datastructures;

public class Album {
	
	public String name;
	public Artist artist;
	public Song[] songs;
	public String genre;
	
	public Album(String name, Artist artist, Song[] songs, String genre) {
		super();
		this.name = name;
		this.artist = artist;
		this.songs = songs;
		this.genre = genre;
	}
	
	
	public String toString() {
		String s = "";
		s = "Album name: " + name + "\n";
		s += "Artist: " + artist.name + "\n";
		s += "Genre: " + genre + "\n";
		
		for (int i = 0; i < songs.length ; i++){
			
			s += "\nSong:\n " + songs[i] +"\n";
		}
		
		
		return s;
	}

}
