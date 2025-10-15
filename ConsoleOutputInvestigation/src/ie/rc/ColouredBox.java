package ie.rc;

public class ColouredBox extends Box {
	
	protected String colour;

	public ColouredBox(int width, int height, String colour) {
		super(width, height);
		this.colour = colour;
	}

	public void setColour(String c) {
		
		switch (c) {
		
		case "RED":
			System.out.print("\u001b[31m");
			break;
		case "GREEN":
			System.out.print("\u001b[32m");
			break;
		case "BLUE":
			System.out.println("\u001b[34m");
			break;
		default:
			System.out.print("\u001b[0m");
			break;
		}
	}
	@Override
	public void display() {
		
		setColour(colour);
		super.display();
		setColour("Black");
	}

	@Override
	public void displayOutline() {
		setColour(colour);
		super.displayOutline();
		setColour(colour);
	}
	
	

}
