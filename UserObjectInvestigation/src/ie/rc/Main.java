package ie.rc;

public class Main {

	public static void main(String[] args) {
		System.out.println("User Object Investigation");

		
		User u = new User(1, "Alice", "alice@gmail.com", false);
		
		u.id = 1;
		u.name = "Aidan";
		
		u.display();
		
		
//		u.email = "aidan@gmail.com";
//		u.active = false;
		
		u.display();
		
		User u2 = new User(2, "Bob", "bob@gmail.com", true);
		User u3 = new User(3, "Carol", "carol@gmail.com", false);
		
		u2.display();
		u3.display();
		
		System.out.println("==========================================");
		
		//User[] users = {
		//		new User(1, "Alice", "alice@gmail.com", false), 
		//		new User(2, "Bob", "bob@gmail.com", true), 
		//		new User(3, "Carol", "carol@gmail.com", false)
		//};
		
		User[] users = {u, u2, u3};
		
		for (int index = 0; index < users.length; index++) {
			
			users[index].display();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
