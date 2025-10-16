package ie.rc;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		String[] names = {"Alice", "Bob", "Carol", "Dan" };
		
		ArrayList al = new ArrayList();
		
		// arrays are very limited in features
		// you can't even add an item.
		//names.
		
		al.add("Alice");
		al.add("Bob");
		al.add("Carol");
		al.add("Dan");
		
		
		for (Object s : al) {
			
			System.out.println(s);
		}
		
		ArrayList people = new ArrayList();
		
		people.add(new Person("Alice", "Adams"));
		people.add(new Person("Bob", "Brown"));
		people.add(new Person("Carol", "Conway"));
		people.add(new Person("Dan", "Dunne"));
		//people.add("this is not a person");
		
		for (Object o : people) {
			
			((Person)o).display();
		}
		
		System.out.println("=".repeat(30));
		// ArrayList supports type-safety using generics
		ArrayList<Person> team = new ArrayList<Person>();
		
		team.add(new Person("Alice", "Adams"));
		
		team.add(new Person("Bob", "Brown"));
		team.add(new Person("Carol", "Conway"));
		team.add(new Person("Dan", "Dunne"));
		team.add(new Person("Eve", "Evans"));
		//team.add("this is not a person");
		
		for (Person p : team) {
			System.out.println(p.getFirstName());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		

	}

}
