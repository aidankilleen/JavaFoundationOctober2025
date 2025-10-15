package ie.rc;

public class Box {

	protected int width;
	protected int height;
	
	public Box(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public void display() {
		for (int row = 0; row < height; row++) {
			System.out.println("*".repeat(width));
		}
		System.out.println();
	}
	public void displayOutline() {
		
		String b = "*".repeat(width) + "\n";
		for (int i=0; i<height-2; i++) {
			b = b + "*" + " ".repeat(width-2) + "*\n";
		}
		if (height > 1) {
			b = b + "*".repeat(width) + "\n";
		}
		
		System.out.println(b);
	}
}
