package ie.rc;


// DO NOT DO THIS!!!
public class ColouredBoxOriginal {

	private int width;
	private int height;
	private String colour;
	public ColouredBoxOriginal() {
		super();
	}
	public ColouredBoxOriginal(int width, int height, String colour) {
		super();
		this.width = width;
		this.height = height;
		this.colour = colour;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public int area() {
		return width * height;
	}
}
