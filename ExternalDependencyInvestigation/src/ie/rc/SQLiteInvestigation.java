package ie.rc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.github.lalyos.jfiglet.FigletFont;

public class SQLiteInvestigation {

	public static void main(String[] args) {
		try {
			String ascii = FigletFont.convertOneLine("SQLite Investigation");
			
			System.out.println(ascii);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String url = "jdbc:sqlite:C:\\work\\training\\java\\JavaFoundationOctober2025\\users.db";
		
		//DriverManager.getConnection(url);
		
		try {
			Connection conn = DriverManager.getConnection(url);
			String sql = "SELECT * FROM users";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next() ) {
				//boolean active = rs.getBoolean(4);
				
				//System.out.printf("%d %s %s\n", 
				//		rs.getInt(1), rs.getString(2), rs.getString(3));
				
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				boolean active = rs.getBoolean("active");
				
				User u = new User(id, name, email, active);
				System.out.println(u);
				
			}
			conn.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
