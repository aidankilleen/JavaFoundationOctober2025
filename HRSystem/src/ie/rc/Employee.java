package ie.rc;

public class Employee extends Person {

	// member variables
	private String employeeId;
	
	// member functions
	// constructor(s)
	public Employee() {
		
	}

	public Employee(String firstName, String lastName, String employeeId) {
		super(firstName, lastName);
		this.employeeId = employeeId;
	}

	// get & set methods
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	// other methods
	// override the display() method in the Person class
	public void display() {
		System.out.println("Employee:");
		//System.out.println(getFirstName() + " " + getLastName());
		
		// call the original super class display() method
		super.display();
		System.out.println("ID:" + employeeId);
	}

}
