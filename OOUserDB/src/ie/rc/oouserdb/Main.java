package ie.rc.oouserdb;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		System.out.println("OO User Database");
		
		UserDao dao = new UserDao();
		
		ArrayList<User>users = dao.getAll();
		
		
		
		
		//User u = new User(1, "alice", "alice@gamil.com", true);
		
		//System.out.println(u);
		
		
		//dao.getAll();
		//dao.delete(1);
		//dao.update(user);
		//dao.create(user);

	}

}
