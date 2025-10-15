package ie.rc;

public class Message {
	
	// class variable
	// there is only 1 count variable
	// it is shared by every instance
	// it is accessed using the class name 
	// rather than an instance
	public static int count = 0;
	
	
	public static int getCount() {
		return count;
	}
	
	// instance variables
	// these are repeated for every instance
	private String title;
	private String text;
	
	public Message(String title, String text) {
		
		count++;
		this.title = title;
		this.text = text;
	}
	
	

}
