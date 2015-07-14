package ba.bitcamp.exercises.ass9_25;

import java.util.Arrays;

public class ArrayListSong {

	private Song[] songs;

	public ArrayListSong() {
		super();
		songs = new Song[0];
	}

	public ArrayListSong(Song[] songs) {
		super();
		this.songs = songs;
	}

	public void add(Song element) {
		Song[] tempArray = null;
		if (size() + 1 >= songs.length) {
			tempArray = new Song[songs.length * 2];
			for (int i = 0; i < songs.length; i++) {
				tempArray[i] = songs[i];
			}
			for (int i = 0; i < tempArray.length; i++) {
				if (tempArray[i] == null) {
					tempArray[i] = element;
					break;
				}
			}
			songs = tempArray;
		} else {
			tempArray = new Song[songs.length];
			for (int i = 0; i < songs.length; i++) {
				tempArray[i] = songs[i];
			}
			for (int i = 0; i < tempArray.length; i++) {
				if (tempArray[i] == null) {
					tempArray[i] = element;
					break;
				}
			}
			
			songs = tempArray;
		}
	}

	public Song get(int index) {
		if (songs.length > 0){
		return songs[index];
		} else {
			return null;
		}
	}

	public void removeIndex(int index) {
		Song[] tempArray = new Song[songs.length - 1];

		for (int i = 0; i < index; i++) {
			tempArray[i] = songs[i];
		}

		for (int i = index + 1; i < songs.length; i++) {
			tempArray[i - 1] = songs[i];
		}
		songs = tempArray;
	}

	public void removeElement(Song song) {
		if(songs.length > 0){
		Song[] tempArray = new Song[songs.length - 1];
		int j = 0;
		int index = 0;
		for (int i = 0; i < songs.length; i++) {
			if (songs[i].equals(song)) {
				index = i + 1;
				break;
			}
			tempArray[j] = songs[i];
			j++;
		}

		for (int i = index; i < songs.length; i++) {
			tempArray[j] = songs[i];
			j++;
		}
		songs = tempArray;} else {
			System.out.println("There is no element to remove.");
		}
	}

	public int size() {
		int counter = 0;
		for (int i = 0; i < songs.length; i++) {
			if (!songs[i].equals(null)) {
				counter++;
			}
		}
		return counter;
	}

	public int indexOf(Song song) {
		int index = -1;
		for (int i = 0; i < songs.length; i++) {
			if (songs[i].equals(song)) {
				index = i;
				break;
			}
		}
		return index;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArrayListSong other = (ArrayListSong) obj;
		if (!Arrays.equals(songs, other.songs))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String s = "Songs:\n";
		for (int i = 0; i < songs.length; i++) {
			s += songs[i].toString() + "\n";
		}
		return s;
	}

}
