package ie.rc.oouserdb;

import java.sql.*;
import java.util.ArrayList;

public class UserDao {

	private Connection conn;
	private String url = "jdbc:sqlite:C:\\work\\training\\java\\JavaFoundationOctober2025\\users.db";
	
	public UserDao() {
		
		try {
			conn = DriverManager.getConnection(url);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
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

	public void delete(int id) {
		String sql = "DELETE FROM users WHERE id=" + id;
		try {
			Statement stmt = conn.createStatement();
			stmt.execute(sql);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

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

	public User add(User userToAdd) {
		
		String sql = "INSERT INTO users "
				+ "(name, email, active) "
				+ "VALUES('" + userToAdd.getName() + "', "
				+ "'" + userToAdd.getEmail() + "',"
				+ " " + (userToAdd.isActive() ? 1 : 0) + ")";
		
		try {
			Statement stmt = conn.createStatement();
			stmt.execute(sql);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
	
	public void close() {
		try {
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}



	
}
