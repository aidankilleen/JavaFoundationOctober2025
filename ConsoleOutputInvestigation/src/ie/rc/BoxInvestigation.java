package ie.rc;

public class BoxInvestigation {

	public static void main(String[] args) {
		
		Box b = new Box(5, 3);
		b.displayOutline();
		
		Box b2 = new Box(8, 5);
		b2.displayOutline();
		
		
		// Create a ColouredBox class
		
		ColouredBox cb = new ColouredBox(10, 10, "RED");
		cb.display();
		
	}

}
