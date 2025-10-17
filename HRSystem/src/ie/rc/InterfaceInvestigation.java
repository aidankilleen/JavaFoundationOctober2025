package ie.rc;

import java.util.ArrayList;

public class InterfaceInvestigation {

	public static void main(String[] args) {
		
		
		Trainer t = new Trainer("Ger", "Graham", "E22222");
		
		t.display();
		System.out.println(t.getEmployeeId());
		t.teach();
		
		
		Tutor tut = new Tutor("Hilary", "Hughes", "Computer Solutions");
		tut.display();
		System.out.println(tut.getAgency());
		
		tut.teach();
		
		ArrayList<Teacher> teachers = new ArrayList<Teacher>();
		
		teachers.add(new Trainer("Ger", "Graham", "E22222"));
		teachers.add(new Tutor("Hilary", "Hughes", "Computer Solutions"));
		teachers.add(new Trainer("Ingrid", "Johnson", "E33333"));
		teachers.add(new Tutor("Karen", "Keane", "Computer Futures"));
		teachers.add(new Professor("Laura", "Leonard", "E4444", 10));
		
		Person p = new Person();
		
		for (Teacher te : teachers) {
			
			te.teach();
			
			// you can't access .display because it is a Teacher
			//te.display();
			
			// you can use a cast because it is a Person
			((Person)te).display();
			
		}
	}
}
