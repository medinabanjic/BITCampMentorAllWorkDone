package ba.bitcamp.exercises.ass9_28;

public class Application {

	private String name;
	private int year;
	private String version;
	private int size;

	public Application(String name, int year, String version, int size) {
		super();
		this.name = name;
		this.year = year;
		this.version = version;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
