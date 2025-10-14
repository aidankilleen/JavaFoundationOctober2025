package ie.rc;

public class User {

	// member variables
	// properties
	public int id;
	public String name;
	public String email;
	public boolean active;
	
	// member functions
	// methods
	// Constructor (used to create a new instance)
	public User(int idI, String nameI, String emailI, boolean activeI) {
		id = idI;
		name = nameI;
		email = emailI;
		active = activeI;
	}
	
	// Other method / functions
	public void display() {
		System.out.println("User Display");
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		if (active) {
			System.out.println("Active");
		} else {
			System.out.println("Inactive");
		}
	}
	
	
}
