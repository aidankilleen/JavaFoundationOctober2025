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
		Employee e = new Employee("Bob", "Burns", "E12345");
		e.display();
		
		// Contractor - inherit Person and add in agency
		Contractor c = new Contractor("Carol", "Conway", "Computer Futures");
		c.display();
		
		// Manager - inherit Employee and add in headCount
		Manager m = new Manager("Danielle", "Dunne", "E12121", 25);
		m.display();
		
		System.out.println("=============");
		System.out.println(m.firstName);
	}
}
