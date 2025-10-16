package ie.rc.oouserdb;

import java.sql.*;
import java.util.ArrayList;

/**
 * UserDAO
 * Data Access Object For User Objects into and out of the sqlite database
 */
public class UserDao {

	private Connection conn;
	private String url = "jdbc:sqlite:C:\\work\\training\\java\\JavaFoundationOctober2025\\users.db";

	/**
	 * UserDao Constructor
	 * Create dao and open database connection.
	 * NB: please call dao.close() when finished with db
	 */
	public UserDao() {
	
		try {
			conn = DriverManager.getConnection(url);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	/**
	 * @return ArrayList<User> of all users in the database
	 */
	public ArrayList<User> getAll() {
		// run a query to get all users from db
		ArrayList<User> users = new ArrayList<User>();
		
		try {
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM users";

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next() ) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				boolean active = rs.getBoolean("active");
				
				User u = new User(id, name, email, active);
				users.add(u);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	/**
	 * 
	 * @param id - the id of the user to be deleted
	 */
	public void delete(int id) {
		String sql = "DELETE FROM users WHERE id=" + id;
		try {
			Statement stmt = conn.createStatement();
			stmt.execute(sql);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	/**
	 * 
	 * @param userToUpdate - user object to modify
	 * Note: the userToUpdate.id is used to identify the user in the database
	 */
	public void update(User userToUpdate) {
		String sql = "UPDATE users "
				+ "SET "
				+ "name = '"+ userToUpdate.getName() + "', "
				+ "email = '"+ userToUpdate.getEmail() + "', "
				+ "active = " + (userToUpdate.isActive() ? 1 : 0) + " "
				+ "WHERE id = " + userToUpdate.getId();
		try {
			Statement stmt = conn.createStatement();
			stmt.execute(sql);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	/**
	 * 
	 * @param userToAdd - the user object to insert - userToAdd.id is ignored and will be replaced by auto generated id
	 * @return the newly created user including the id
	 */
	public User add(User userToAdd) {
		
		String sql = "INSERT INTO users "
				+ "(name, email, active) "
				+ "VALUES('" + userToAdd.getName() + "', "
				+ "'" + userToAdd.getEmail() + "',"
				+ " " + (userToAdd.isActive() ? 1 : 0) + ")";
		
		try {
			Statement stmt = conn.createStatement();
			stmt.execute(sql);
			
			// retrieve generated id
			ResultSet rs = stmt.getGeneratedKeys();
			if (rs.next()) {
				int newId = rs.getInt(1);
				userToAdd.setId(newId);
			}
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return userToAdd;
	}
	
	/**
	 * Please call this method to close the database connection
	 */
	public void close() {
		try {
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}



	
}
