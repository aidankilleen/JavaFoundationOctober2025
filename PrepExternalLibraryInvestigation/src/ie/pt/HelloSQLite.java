package ie.pt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;


public class HelloSQLite {
    public static void main(String[] args) {
        // Path to your SQLite DB file
        String url = "jdbc:sqlite:C:\\work\\training\\java\\JavaFoundationOctober2025\\users.db";

        // Connect and query
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM users;")) {

            System.out.println("Connected! Reading from 'users' table:\n");

            // Print results (assuming columns: id, name, age — adjust as needed)
            while (rs.next()) {
                int id = rs.getInt(1);        // first column
                String name = rs.getString(2); // second column
                String email = rs.getString(3);        // third column
                System.out.printf("id=%d, name=%s, age=%s%n", id, name, email);
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}