import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class indexTest{
    public static void main(String[] args) throws SQLException{
        final String url = "jdbc:mysql://localhost:3306/teste";
        final String user = "root";
        final String password = "";

        Connection connection = DriverManager.getConnection(url, user, password);
    }
}