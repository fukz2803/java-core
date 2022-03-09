import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnect {

    String hostName = "localhost:8080";
    String dbname = "test";
    String username = "root";
    String password = "123";

    String url = "jdbc:mysql://"+hostName+"/"+dbname;

    public Connection connect(){
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("ket noi thanh cong");
        } catch (SQLException e) {
            System.out.println("ket noi khong thanh cong" + e.getMessage());
        }

        return conn;
    }
}
