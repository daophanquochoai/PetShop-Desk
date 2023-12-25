package hdt.petshopproject.util;
import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.DriverManager.getConnection;

public class helper {

    public static Connection openConnection()  throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost\\HAOLE:1433;databaseName=QuanLyPetShop;encrypt=true;trustServerCertificate=true;";
        String username = "sa";
        String password = "123456";
        Connection con = DriverManager.getConnection(connectionURL, username, password);
        return con;
    }
}
