package ie.rc;

// with inheritance
// we have access to the properties & functions of 
// the super class
//
// we can add new properties & functions

public class ColouredBox extends Box {

	private String colour;

	
	public ColouredBox() {
		super();
	}

	public ColouredBox(int width, int height, String colour) {
		super(width, height); // call the super class constructor
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	
	
}
