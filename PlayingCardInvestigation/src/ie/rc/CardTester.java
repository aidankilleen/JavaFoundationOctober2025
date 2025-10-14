package ie.rc;

public class CardTester {

	public static void main(String[] args) {

		Card e = new Card(1, 1);
		
		System.out.println(e.getSuit());
		System.out.println(e.getValue());
		
		//e.suit = 99;
		e.setSuit(99);
		
		
		//e.suit = 1000;
		//e.value = 1000;
		
		e.display();


	}

}
