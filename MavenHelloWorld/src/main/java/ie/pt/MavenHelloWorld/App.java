package ie.pt.MavenHelloWorld;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.github.lalyos.jfiglet.FigletFont;

import ie.rc.oouserdb.User;
import ie.rc.oouserdb.UserDao;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	User u = new User(1, "Alice", "alice@gmail.com", true);
    	
    	UserDao dao = new UserDao();
    	
    	ArrayList<User> users = dao.getAll();
    	
    	for (User user: users) {
    		System.out.println(user);
    	}
    	System.out.println("=".repeat(20));
    	
    	String ascii;
		try {
			ascii = FigletFont.convertOneLine("Hello World!");
	        System.out.println(ascii);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:sqlite:C:\\work\\training\\java\\JavaFoundationOctober2025\\users.db";
		
		try {
			Connection conn = DriverManager.getConnection(url);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM users");
			
			while (rs.next()) {
				
				String name = rs.getString("name");
				System.out.println(name);
			}
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
}
