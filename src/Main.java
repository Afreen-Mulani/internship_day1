import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    // Step 1: Connection URL and Credentials
    private static final String URL = "jdbc:postgresql://localhost:5432/internship_day1_jdbc";
    private static final String USER = "postgres"; // *** YOUR PG USERNAME HERE ***
    private static final String PASSWORD = "12345"; // *** YOUR PG PASSWORD HERE ***

    public static void main(String[] args) {

        System.out.println("Attempting to connect to the database...");

        // Step 2, 3, & 4: Load Driver, Connect, and Close Connections Safely
        // The 'try-with-resources' (Connection conn = ...) automatically closes
        // the connection (Step 4) even if errors occur.
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {

            // Step 3: Print Success
            if (conn != null) {
                System.out.println("Connected successfully!");
            }

        } catch (SQLException e) {
            // Handle errors like wrong password or database not running
            System.err.println("Connection Failed! Check URL, User, Password, and if PostgreSQL is running.");
            e.printStackTrace();
        }
    }
}
