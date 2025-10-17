package ie.rc.oouserdb;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		System.out.println("OO User Database");
		
		UserDao dao = new UserDao();
		
		
		
		ArrayList<User>users = dao.getAll();
		
		for (User u : users) {
			
			System.out.println(u);
		}
		
		dao.delete(2);
		
		User userToUpdate = users.get(0);
		
		userToUpdate.setName("CHANGED");
		userToUpdate.setEmail("changed@gmail.com");
		userToUpdate.setActive(!userToUpdate.isActive());
		dao.update(userToUpdate);
		
		
		User userToAdd = new User(-1, "New User", "new.user@gmail.com", false);
		
		
		User addedUser = dao.add(userToAdd);
		
		System.out.println(addedUser);
		
		
		dao.close();
	}
}
