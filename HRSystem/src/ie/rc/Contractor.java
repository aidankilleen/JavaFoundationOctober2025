package ie.rc;

public class Contractor extends Person {

	// member variables
	private String agency;

	// member functions
	// constructor(s)
	public Contractor() {
		
	}
	
	public Contractor(String firstName, String lastName, String agency) {
		super(firstName, lastName);
		this.agency = agency;
	}

	// getters & setters
	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}
	
	// other methods
	public void display() {
		System.out.println("Contractor:");
		super.display();
		System.out.println("Agency:" + agency);
	}
	
	

}
