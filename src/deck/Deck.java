package deck;

import java.util.ArrayList;

public class Deck {

	public ArrayList<Card> cards;

	public Deck() {
		// add code to create 52 cards, 13 cards of each of 4 suits
		this.cards = new ArrayList<Card>();
		
		// loop for each suit
		for (int i = 1; i <= 4; i++) {
			// loop for each rank
			for (int j = 1; j <= 13; j++) {
				// create the card
				this.cards.add(new Card(j, i));
			}
		}
	}

	// shuffle
	
	// draw a card
	public Card drawCard() {
		Card myCard = this.cards.get(this.cards.size() - 1);
		this.cards.remove(this.cards.size() - 1);
		return myCard;
	}
	
	// peek a card
	public Card peekCard(int index) {
		if (index > this.cards.size()-1) {
			return null;
		}
		
		Card myCard = this.cards.get(index);
		return myCard;
	}
	
	// reset the deck
	
	// how many cards are left
}
