package ie.rc;

public class PolymorphismInvestigation {

	public static void main(String[] args) {
		
		
		// lists in Java are "homogeneous" - strongly typed
		// int[] list = {1, 2, 3, 4, 5, "six"};
		
		
		Person[] team = {
				new Person("Alice", "Adams"),
				new Employee("Bob", "Burns", "E12345"), 
				new Employee("Eve", "Evans", "E12346"), 
				new Employee("Fred", "Flintstone", "E12347"), 
				new Contractor("Carol", "Conway", "Computer Futures"), 
				new Manager("Danielle", "Dunne", "E11111", 15)
		};
		
		// Note: items are different classes
		// BUT they do have a common super class - Person
		
		for (int i = 0; i < team.length; i++) {
			
			team[i].display();
		}
		
		// This is Polymorphism
		// You can create a heterogeneous list as long as the items in the list
		// have a common base class
		// note: the correct display() method is called depending on the item in the list
		
		
		team[2].display();
		
		
		// Building Block - Loops
		// while loop
		// for (;;)
		
		// for each loop
		for (Person p : team) {
			
			System.out.println(p.getClass().getName());
			System.out.println(p.getFirstName());
			
			// p is a Person object 
			// there is no getHeadCount() function in Person
			//System.out.println(p.getHeadCount());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
