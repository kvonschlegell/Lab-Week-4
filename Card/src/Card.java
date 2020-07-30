import java.util.Random;

public class Card {
	private String cardSuit, cardNumber;
	private int number, suit;
	Random generator = new Random();

	public static void main(String[] args) {

		Card card = new Card();
		System.out.println("Your five cards are:");

		// Deals 5 random cards with replacement
		for (int count = 0; count < 5; count++) {
			card.shuffle();
			System.out.println(card);
		}

	}

	public void shuffle() {
		// Generates a random number (1-13) and suit (1-4)
		number = generator.nextInt(13) + 1;
		suit = generator.nextInt(4) + 1;
	}

	// Returns Card
	public String toString() {
		if (2 <= number && number <= 10) {
			cardNumber = Integer.toString(number);
		} else if (number == 1) {
			cardNumber = "Ace";
		} else if (number == 11) {
			cardNumber = "Jack";
		} else if (number == 12) {
			cardNumber = "Queen";
		} else {
			cardNumber = "King";
		}

		if (suit == 1) {
			cardSuit = "Spades";
		} else if (suit == 2) {
			cardSuit = "Clubs";
		} else if (suit == 3) {
			cardSuit = "Diamonds";
		} else {
			cardSuit = "Hearts";
		}

		return cardNumber + " " + "of" + " " + cardSuit;

	}

}
