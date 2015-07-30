package ba.bitcamp.exercises.ass9_28;

public class Editor extends Application {

	public static final String TYPE1 = "Text";
	public static final String TYPE2 = "Photo";
	public static final String TYPE3 = "Video";
	private String type;
	private boolean isFreeware;

	public Editor(String name, int year, String version, int size, String type,
			boolean isFreeware) {
		super(name, year, version, size);
		this.type = type;
		this.isFreeware = isFreeware;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isFreeware() {
		return isFreeware;
	}

	public void setFreeware(boolean isFreeware) {
		this.isFreeware = isFreeware;
	}

}
