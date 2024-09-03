import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StrikeView {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/firewall_strike_db";
        String user = "your-username";
        String password = "your-password";

        try {
            // Establish connection to the database
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            // Execute a query to retrieve logged events
            String query = "SELECT * FROM events";
            ResultSet resultSet = statement.executeQuery(query);

            // Display the results
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String timestamp = resultSet.getString("timestamp");
                String description = resultSet.getString("event_description");

                System.out.println("ID: " + id);
                System.out.println("Timestamp: " + timestamp);
                System.out.println("Event: " + description);
                System.out.println("------------------------");
            }

            // Clean up resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
