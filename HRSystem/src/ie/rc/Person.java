package ie.rc;

public class Person {
	// member variables
	private String firstName;
	private String lastName;
	
	// member functions
	// constructor(s)	
	public Person() {
		super();
	}
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// getters & setters	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// other functions
	public void display() {
		System.out.println("Person:");
		System.out.println(firstName + " " + lastName);
	}
	

}
