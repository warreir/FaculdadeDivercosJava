import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexao{
    public static Connection getConnection() throws SQLException{
        //Properties props = getProps();
        final String url = "jdbc:mysql://localhost:3306/teste";
        final String user = "root";
        final String password = "";

        Connection connection = DriverManager.getConnection(url, user, password);
    }
}