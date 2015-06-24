public class Wallet {

	private Integer walletBalance;
	private CreditCard[] cards;
	private Integer maxCards;
	private Integer cardsIn;

	public Wallet(Integer maxCards) {
		super();
		this.maxCards = maxCards;
		this.walletBalance = 0;
	}

	public int getCardsIn() {

		int counter = 0;
		for (int i = 0; i < maxCards; i++) {
			if (cards[i] != null) {
				counter++;
			}
		}
		return counter;
	}

	public int getWalletBalance() {
		return walletBalance;
	}

	public void addMoneyToWallet(int n) {
		walletBalance += n;
	}

	public void removeMoneyFromWallet(int n) {
		walletBalance -= n;
	}

	public void addCard(CreditCard c) {
		if (cardsIn < maxCards) {
			cards[cardsIn] = c;
		}
	}
}
