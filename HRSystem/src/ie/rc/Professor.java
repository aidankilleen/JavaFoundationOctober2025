package ie.rc;

public class Professor extends Manager implements Teacher {

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Professor(String firstName, String lastName, String employeeId, int headCount) {
		super(firstName, lastName, employeeId, headCount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("Professor:");
		super.display();
	}

	@Override
	public void teach() {
		
		System.out.println("Listen up ...");
	}

	

}
