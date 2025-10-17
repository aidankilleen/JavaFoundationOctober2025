package ie.rc.oouserdb;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserDaoTest {
	
	private UserDao dao;
	
	@BeforeAll
	public static void setupBeforeAll() {
		// use this to create a database with and exact set of records
		
	}
	
	@AfterAll
	public static void teardownAfterAll() {
		// use this to delete the database
	}
	
	@BeforeEach
	void setup() {
		dao = new UserDao();
	}

	@AfterEach
	void teardown() {
		dao.close();
	}
	
	@Test
	void initialTest() {
		assertNotEquals(dao, null);
	}
	
	@Test
	void testGetAll() {
		
		ArrayList<User> users = dao.getAll();
		assertTrue(users.size() > 0);
	}

	@Test
	void testInsert() {
		User newUser = new User (-1, "Alice", "alicae@gmail.com", false);
		User addedUser = dao.add(newUser);
		assertTrue(addedUser.getId() != -1);
	}
	
	@Test
	void testInsertWithApostrophe() {
		User newUser =new User (-1, "Aidan O'Sullivan", "aos@gmail.com", true);
		User addedUser = dao.add(newUser);
		assertTrue(addedUser.getId() != -1);
	}
	
	@Test
	void testSQLInjection() {
		User newUser = new User(-1, "','',0); delete from users where name='New User'; --", "", false);
		
		User addedUser = dao.add(newUser);
		assertTrue(newUser.getName().equals(addedUser.getName()));
	}
	
	
	
	
	
	
	
}
