package ba.bitcamp.classes.ass7;

public class Foo implements Compare {

	private int foones;

	public Foo(int foones) {
		super();
		this.foones = foones;
	}

	public void setFoo(int foones) {
		this.foones = foones;
	}

	@Override
	public String toString() {
		return "Foo [foones=" + foones + "]";
	}

	@Override
	public int compare(Object o) {
		if (o instanceof Foo) {
			Foo other = (Foo) o;
			if (this.foones > other.foones) {
				return 1;
			} else if (this.foones == other.foones) {
				return 0;
			} else {
				return -1;
			}
		}

		else {
			throw new IllegalArgumentException();
		}

	}
}
