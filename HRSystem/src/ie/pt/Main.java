package ie.pt;

import ie.rc.Person;

public class Main {

	public static void main(String[] args) {

		Person p = new Person("alice", "adams");
		
		// you can't access the protected member
		// if you are outside of the package
		//System.out.println(p.firstName);
		

	}

}
