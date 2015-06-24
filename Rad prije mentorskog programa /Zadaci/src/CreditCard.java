public class CreditCard {

	private Integer cardNum;
	private String bank;
	private Integer monthExpiring;
	private Integer yearExpiring;
	private Integer accountBalance;

	
	
	public CreditCard(Integer cardNum, String bank, Integer monthExpiring,
			Integer yearExpiring) {
		super();
		this.cardNum = cardNum;
		this.bank = bank;
		this.monthExpiring = monthExpiring;
		this.yearExpiring = yearExpiring;
		this.accountBalance = 0;
	}

	public void addMoney(int n) {
		accountBalance += n;
	}

	public void removeMoney(int n) {
		accountBalance -= n;
	}

	public int getAccountBalance() {
		return accountBalance;
	}
	
	
}
