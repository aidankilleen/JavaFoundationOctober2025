package ie.rc;

public class Manager extends Employee {

	// member variables
	private int headCount;
	
	// member functions
	
	// constructor(s)
	public Manager() {
		
	}

	public Manager(String firstName, 
					String lastName, 
					String employeeId, 
					int headCount) {
		super(firstName, lastName, employeeId);
		
		this.headCount = headCount;
	}
	// get & set methods
	public int getHeadCount() {
		return headCount;
	}

	public void setHeadCount(int headCount) {
		this.headCount = headCount;
	}
	
	// other methods
	@Override
	public void display() {
		
		System.out.println("Manager:");
		super.display();
		System.out.println("Headcount:" + headCount);
	}
}
