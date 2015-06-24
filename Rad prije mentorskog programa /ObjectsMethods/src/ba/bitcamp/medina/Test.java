package ba.bitcamp.medina;

public class Test {

	public static void main(String[] args) {
		Planets pl = new Planets(1000, 600, "Lopta", "Pluton");

		pl.dodajMasu(80);
		System.out.println("PL Masa: " + pl.vrijednostMase());
		System.out.println("PL Tezina: " + pl.racunajTezinu());

	}

}
