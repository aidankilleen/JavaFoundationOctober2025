package ie.rc;

public class Deck {

	// member variables / properties
	Card[] cards = new Card[52];
	
	// member functions / methods
	
	// constructor
	public Deck() {
		// instantiate each of the 52 cards
		int count = 0;
		for (int suit = 1; suit <= 4; suit++) {
			
			for (int value = 1; value <= 13; value++) {
				
				cards[count++] = new Card(suit, value);
			}
		}
	}
	
	// other methods
	public void display() {
		for (int i = 0; i < cards.length; i++) {
			cards[i].display();
			
			if (i == 12 || i == 25 || i == 38 ) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("Deck of Cards");
		
		Deck d = new Deck();
		d.display();
	}
}
