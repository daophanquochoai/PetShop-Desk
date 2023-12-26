package hdt.petshopproject.util;
import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.DriverManager.getConnection;

public class helper {

    public static Connection openConnection()  throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
<<<<<<< HEAD
        String connectionURL = "jdbc:sqlserver://localhost\\HAOLE:1433;databaseName=QuanLyPetShop;encrypt=true;trustServerCertificate=true;";
        String username = "saa";
        String password = "100303";
=======
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyPetShop;encrypt=true;trustServerCertificate=true;";
        String username = "sa";
        String password = "123456";
>>>>>>> f78f7ae8ee5f2eeae6706f90de2f926743526f2e
        Connection con = DriverManager.getConnection(connectionURL, username, password);
        return con;
    }
}
