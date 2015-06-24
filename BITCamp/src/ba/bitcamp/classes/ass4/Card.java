package ba.bitcamp.classes.ass4;

public class Card {
	private int value;
	private int suit;

	public Card(int value, int suit) {

		if (suit < 0 || suit > 4 || value < 0 || value > 13) {
			throw new IllegalArgumentException(
					"Values have to be in a range 1-13, and suit has to be in a range 0-4");
		} else {
			this.value = value;
			this.suit = suit;
		}
	}

	/**
	 * This method change our attributes to String so that we can print them.
	 */
	public String toString() {
		String s = "";
		s += "Value: " + value + "\n";
		s += "Suit: " + suit + "\n";
		return s;
	}

	/**
	 * This method compare two point objects.
	 * 
	 * @param otherPoint
	 * @return
	 * 
	 *         Boolean value, they are equal or not.
	 */
	public boolean Equals(Card otherCard) {

		boolean isEqual;
		if (this.value == otherCard.value && this.suit == otherCard.suit) {
			isEqual = true;
		} else {
			isEqual = false;
		}
		return isEqual;
	}

	public String getCard() {
		String card = "";
		String val = "";
		String suits = "";

		switch (value) {
		case 1:
			val = "A ";
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			val = value + " ";
			break;
		case 11:
			val = "Jack ";
			break;
		case 12:
			val = "Queen ";
			break;
		case 13:
			val = "King ";
		default:
			throw new IllegalArgumentException(
					"Value has to be in a range from 1-13");
		}

		switch (suit) {
		case 0:
			suits = "Herz";
			break;
		case 1:
			suits = "Pik";
			break;
		case 2:
			suits = "Tref";
			break;
		case 3:
			suits = "Karo";
			break;
		case 4:
			suits = "Joker";
		default:
			throw new IllegalArgumentException(
					"Suit needs to be in range from 0 - 4");

		}

		card = val + suits;

		return card;
	}

}
