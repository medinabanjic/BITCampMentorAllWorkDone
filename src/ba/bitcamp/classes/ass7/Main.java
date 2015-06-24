package ba.bitcamp.classes.ass7;

public class Main {

	public static Compare getMax(Compare[] c) {
		Compare max = c[0];
		for (int i = 0; i < c.length; i++)
			if (max.compare(c[i]) == -1) {
				max = c[i];
			}
		return max;
	}

//	public static Bar getMax(Bar[] b) {
//		Bar max = b[0];
//		for (int i = 0; i < b.length; i++)
//			if (max.compare(b[i]) == -1) {
//				max = b[i];
//			}
//		return max;
//	}

	public static void main(String[] args) {
		Foo[] f = new Foo[3];
		f[0] = new Foo(12);
		f[1] = new Foo(19);
		f[2] = new Foo(13);

		Bar[] b = new Bar[3];
		b[0] = new Bar("Medina");
		b[1] = new Bar("Mladen");
		b[2] = new Bar("Kristina");

		System.out.println(getMax(f));
		System.out.println(getMax(b));
	}
}
