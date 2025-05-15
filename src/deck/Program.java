package deck;

public class Program {

	public static void main(String[] args) {
		Deck myDeck = new Deck();
		
		// peek test
		System.out.println(myDeck.peekCard(999));
		System.out.println(myDeck.peekCard(9));
		
		for (int i = 0; i < 52; i++) {
			System.out.println(myDeck.drawCard());
		}

	}

}
