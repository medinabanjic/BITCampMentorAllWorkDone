package ba.bitcamp.exercises.ass9_28;

public class VideoGame extends Application {

	private String genre;
	private String gameStudio;
	private int soldCopies;

	public VideoGame(String name, int year, String version, int size,
			String genre, String gameStudio, int soldCopies) {
		super(name, year, version, size);
		this.genre = genre;
		this.gameStudio = gameStudio;
		this.soldCopies = soldCopies;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getGameStudio() {
		return gameStudio;
	}

	public void setGameStudio(String gameStudio) {
		this.gameStudio = gameStudio;
	}

	public int getSoldCopies() {
		return soldCopies;
	}

	public void setSoldCopies(int soldCopies) {
		this.soldCopies = soldCopies;
	}

}
