package ie.rc;

public class Trainer extends Employee implements Teacher {

	public Trainer() {
		super();
	}

	public Trainer(String firstName, String lastName, String employeeId) {
		super(firstName, lastName, employeeId);
	}

	
	@Override
	public void display() {
		System.out.println("Trainer:");
		super.display();
	}

	@Override
	public void teach() {
		System.out.println("Class is starting...");

	}

}
