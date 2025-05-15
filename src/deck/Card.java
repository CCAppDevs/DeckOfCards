package deck;

public class Card {
	
	// Properties and Attributes
	private String Rank;
	private String Suit;

	
	// constructor
	public Card(String rank, String suit) {
		// ensure that the rank and suit are set
		this.Rank = rank;
		this.Suit = suit;
	}
	
	public Card(int rank, int suit) {
		// convert ranks
		switch (rank) {
			case 1:
				this.Rank = "Ace";
				break;
			case 11:
				this.Rank = "Jack";
				break;
			case 12:
				this.Rank = "Queen";
				break;
			case 13:
				this.Rank = "King";
				break;
			default:
				this.Rank = Integer.toString(rank);
				break;
		}
		
		switch (suit) {
			case 1:
				this.Suit = "Clubs";
				break;
			case 2:
				this.Suit = "Diamonds";
				break;
			case 3:
				this.Suit = "Hearts";
				break;
			case 4:
				this.Suit = "Spades";
				break;
			default:
				this.Suit = "Unknown";
				break;
		}
	}

	@Override
	public String toString() {
		return this.Rank + " of " + this.Suit;
	}
	
	// getters and setters

	public String getRank() {
		return Rank;
	}

	public void setRank(String rank) {
		Rank = rank.toUpperCase();
	}

	public String getSuit() {
		return Suit;
	}

	public void setSuit(String suit) {
		Suit = suit;
	}

	// TODO: add a method to computer the value of the card
	public int getValue() {
		// we care about the value of the rank but not the value of the suit
		// for example: Ace of Hearts is worth 1
		// a 9 of Hearts is worth 9
		// A 9 of Clubs is worth 9
		
		int value = 0;
		
		if (this.Rank == "Ace") {
			value = 1;
		} else if (this.Rank == "Jack" || this.Rank == "Queen" || this.Rank == "King") {
			value = 10;
		} else {
			value = Integer.parseInt(this.Rank);
		}
		
		return value;
	}
}
