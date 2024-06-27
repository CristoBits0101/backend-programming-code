package persistence.databases.h2.config;

import java.sql.Connection;     //
import java.sql.DriverManager;  //
import java.sql.SQLException;   //

public class ConnectionH2
{
    //
    public String driver = "org.h2.Driver";
    public String url = "jdbc:h2:~/test";
    public String username = "sa";
    public String password = "";

    /**
     * @return Connection
     * */
    public Connection getConectionH2()
    {
        try
        {
            Class.forName(driver);

            // Return the connection in case of success
            return DriverManager.getConnection(url, username, password);
        }

        catch (ClassNotFoundException | SQLException e)
        {
            // Return null in case of error
            e.printStackTrace();

            System.out.println("¡Connection not made!");
        }

        return null;
    }
}
