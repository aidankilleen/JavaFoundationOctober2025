package ie.rc;

public class BoxInvestigation {

	public static void main(String[] args) {
		
		Box b = new Box(5, 3);
		b.displayOutline();
		
		Box b2 = new Box(8, 5);
		b2.displayOutline();
		
		
		// Create a ColouredBox class
		
		ColouredBox cb = new ColouredBox(5, 5, "RED");
		cb.display();
		
		
		ColouredBox cbg = new ColouredBox(8, 3, "GREEN");
		cbg.displayOutline();
		
		ColouredBox cbb = new ColouredBox(10, 4, "BLUE");
		cbb.display();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        System.out.println("ASCII: ABC abc 123");
        System.out.println("Accents: é ñ ü ø å");
        System.out.println("Math: ∑ ∞ √ π ≈");
        System.out.println("Arrows: ← ↑ → ↓ ↔ ↕");
        System.out.println("Emoji: 😀 🚀 🎉");

        
        System.out.println("Single box:");
        System.out.println("┌───────┐");
        System.out.println("│ Hello │");
        System.out.println("└───────┘");
        
		
	}

}
