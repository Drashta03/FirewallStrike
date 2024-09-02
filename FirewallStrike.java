import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class FirewallStrike {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/firewall_strike_db";
    private static final String USER = "your_db_user";
    private static final String PASS = "your_db_password";

    public static void main(String[] args) {
        // Example event to be logged
        String eventDescription = "WAF evasion attempt detected.";

        logEvent(eventDescription);
    }

    public static void logEvent(String eventDescription) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            String sql = "INSERT INTO events (timestamp, event_description) VALUES (?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setTimestamp(1, new java.sql.Timestamp(new Date().getTime()));
            statement.setString(2, eventDescription);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new event was logged successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
