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
		System.out.println("\n");
	}
	
	public void shuffle(int count) {
		for (int i = 0; i < count; i++) {
			// generate a random number between 0 and 51
			// (int) converts / casts from double to int
			int r1 = (int)(Math.random() * 52);
			int r2 = (int)(Math.random() * 52);
			
			// swap the cards at r1 and r2
			Card t = cards[r1];
			cards[r1] = cards[r2];
			cards[r2] = t;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Deck of Cards");
		
		Deck d = new Deck();
		d.display();
		
		d.shuffle(1);
		d.display(); // deck should be different (shuffled)
		
		d.shuffle(10);
		d.display(); // deck should be different (shuffled)
		
		d.shuffle(100);
		d.display(); // deck should be different (shuffled)
		
		d.shuffle(1000);
		d.display(); // deck should be different (shuffled)
		
	}
}





