package ba.bitcamp.medina;

public class Planets {

	private static final Integer g = 10;

	private Integer tezina;
	private Integer masa;
	private String oblik;
	private String ime;

	/**
	 * Ovo je nas konstruktor za klasu
	 * 
	 * @param tezina
	 * @param masa
	 * @param oblik
	 * @param ime
	 */
	public Planets(Integer tezina, Integer masa, String oblik, String ime) {

		super();
		this.tezina = tezina;
		this.masa = masa;
		this.oblik = oblik;
		this.ime = ime;
	}

	/**
	 * Metoda dodavanja mase
	 * 
	 * @param dodatak
	 */
	public void dodajMasu(Integer dodatak) {
		this.masa += dodatak;
	}

	public Integer vrijednostMase() {
		return this.masa;
	}

	public Integer racunajTezinu() {
		this.tezina = this.masa * g;
		return this.tezina;
	}

}
