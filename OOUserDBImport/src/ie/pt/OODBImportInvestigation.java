package ie.pt;


import java.util.ArrayList;

import ie.rc.oouserdb.User;
import ie.rc.oouserdb.UserDao;

public class OODBImportInvestigation {

	public static void main(String[] args) {
		
		
		UserDao dao = new UserDao();
		
		ArrayList<User> users = dao.getAll();
		
		
		User newUser = new User(-1, "Zoe", "zoe@gmail.com", true);
		
		newUser = dao.add(newUser);
		
		System.out.println(newUser);
		
		for (User u : users) {
			System.out.println(u);
		}
		
		dao.close();

	}

}
