package ie.rc;

public class Main {

	public static void main(String[] args) {
		System.out.println("Member Investigation");
		
		// m is an object
		// it is an instance of the class Member
		Member m = new Member(1, "Alice", "alice@gmail.com", true);
		
		m.display();

		
		//m.id = -999;
		//System.out.println(m.id);
	}

}
