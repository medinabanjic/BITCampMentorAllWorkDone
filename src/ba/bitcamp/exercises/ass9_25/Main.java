package ba.bitcamp.exercises.ass9_25;

public class Main {
	public static void main(String[] args) {
		ArrayListSong playlist = new ArrayListSong();
		Song s = new Song("Jazzabel", "Sade", 1980, Song.JAZZ);
		Song s1 = new Song("Paradise", "Sade", 1978, Song.POP);
		Song s2 = new Song("Enter", "AC/DC", 1985, Song.ROCK);
		
		playlist.add(s);
		playlist.add(s1);
		playlist.add(s2);
		playlist.removeElement(s);
		//System.out.println(playlist.size());
		//System.out.println(playlist.indexOf(s2));
		//System.out.println(playlist.toString());
		//System.out.println(playlist.get(0));
		
		Song[] pl = new Song[playlist.size() + 1];
		for (int i = 0; i < playlist.size() + 1; i++){
			pl[i] = playlist.get(i);
		}
		
		LinkedListSong ls = new LinkedListSong(pl);
		System.out.println(pl.toString());
		
		
		
		
	}
}
