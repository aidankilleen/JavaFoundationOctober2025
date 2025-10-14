package ie.rc;

public class Card {

	// properties / member variables
	// suit - H=1, S=2, D=3, C=4
	private int suit;
	
	// value = A=1, 2=2, 3=3, ..., 10=10, J=11, Q=12, K=13
	private int value;
	
	// functions / methods
	public int getSuit() {
		return suit;
	}
	public int getValue() {
		return value;
	}
	
	public void setSuit(int suit) {
		
		if (suit >= 1 && suit <= 4) {
			this.suit = suit;
		} else {
			// handle erroneous values appropriately
			System.out.println("Invalid suit:" + suit);
		}
	}
	public void setValue(int value) {
		if (value >= 1 && value <= 13) {
			this.value = value;
		} else {
			System.out.println("Invalid value:" + value);
			
		}
	}
	
	
	// constructor(s)
	public Card() {
		// constructor that takes no parameters (default constructor)
		suit = -1;
		this.value = -1;
	}
	
	public Card(int suit, int value) {
		this.suit = suit;
		this.value = value;
	}
	
	public void display() {
		String card = "";
		
		if (value == 1) {
			card += " A";
		} else if (value >= 2 && value <= 9) {
			card += " " + value;
		} else if (value == 10) {
			card += value;
			
		} else if (value == 11) {
			card += " J";
		} else if (value == 12) {
			card += " Q";
		} else if (value == 13) {
			card += " K";
		} else {
			card += " ?";
		}
		
		if (suit == 1) {
			card = card + "H ";
		} else if (suit == 2) {
			card = card + "S ";
		} else if (suit == 3) {
			card = card + "D ";
		} else if (suit ==4) {
			card = card + "C ";
		} else {
			card = card + "? ";
		}
		
		System.out.print(card);
	}
	
	public static void main(String[] args) {
		
		
		Card e = new Card();
		
		e.suit = 1000;
		e.value = 1000;
		
		e.display();
		
		/*
		Card c = new Card(1, 1); // create a card (suit, value) 
		c.display(); // display the card AH
		
		System.out.println();
		
		// create one of each possible card
		for (int suit = 1; suit <= 4; suit++) {
			
			for (int value = 1; value <= 13; value++) {
				
				Card cc = new Card(suit, value);
				cc.display();
			}
			System.out.println();
		}
		*/
	}
}
