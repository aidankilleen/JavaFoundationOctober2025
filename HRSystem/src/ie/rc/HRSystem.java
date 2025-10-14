package ie.rc;

public class HRSystem {

	public static void main(String[] args) {
		
		
		System.out.println("HR System");
		
		//
		// Employee - firstName, lastName, employeeId, constructor(), display()
		// Manager - firstName, lastName, employeeId, headCount constructor(), display()
		// Contractor - firstName, lastName, agency constructor(), display()

		// devise objects (classes) to implement this system
		// D.R.Y. - don't repeat yourself!
		
		// Person - firstName, lastName
		Person p = new Person("Alice", "Adams");
		p.display();
		
		
		// Employee - inherit Person and add in employeeId
		
		// Contractor - inherit Person and add in agency
		
		// Manager - inherit Employee and add in headCount
		
		
	}

}
