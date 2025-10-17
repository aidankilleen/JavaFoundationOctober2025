package ie.rc;

public class Tutor extends Contractor implements Teacher {

	public Tutor() {
		
	}

	public Tutor(String firstName, String lastName, String agency) {
		super(firstName, lastName, agency);
		
	}

	@Override
	public void display() {
		System.out.println("Tutor:");
		super.display();
	}
	
	@Override
	public void teach() {
		System.out.println("Here is the lesson...");

	}

}
