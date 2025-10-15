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
		
		for (Object o : people) {
			
			((Person)o).display();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		

	}

}
