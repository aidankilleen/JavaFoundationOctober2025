package ie.rc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateQueryInvestigation {

	public static void main(String[] args) {
		
		String url = "jdbc:sqlite:C:\\work\\training\\java\\JavaFoundationOctober2025\\users.db";
		
		try {
			
			// C.R.U.D.
			// Create
			// Retrieve
			// Update
			// Delete
			
			Connection conn = DriverManager.getConnection(url);
			
			String sql = "DELETE FROM users WHERE name='Alice'";
			Statement stmt = conn.createStatement();
			stmt.execute(sql);
			
			sql = "UPDATE users SET name = 'changed' WHERE id = 2";
			stmt.execute(sql);
	
			sql = "INSERT INTO users (name, email, active) "
					+ "VALUES('Alice', 'alice@gmail.com', 1)";
			stmt.execute(sql);
			
			conn.close();
			
			System.out.println("User 1 deleted and user 2 changed and alice added back");
		} catch (Exception ex) {
			System.out.println("Something went wrong");
			System.out.println(ex.getMessage());
		}
	}

}
