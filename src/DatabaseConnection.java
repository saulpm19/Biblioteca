
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnection
{
    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String USER = "sperez";
    private static final String PASSWORD = "1234";

    public static Connection getConnection()
    {
        try
        {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e)
        {
            e.printStackTrace();
            throw new RuntimeException("Error al conectarse a la base de datos",e);
        }

    }

}
