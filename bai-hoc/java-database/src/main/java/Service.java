import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Service {
    DatabaseConnect databaseConnect = new DatabaseConnect();
    Connection conn = databaseConnect.connect();
    public void getAllUsers(int id){
        String query = "SELECT * FROM users WHERE id = " + id;

        try {
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery(query);
            while (result.next()){
                System.out.println(result.getString("id")+ " - " + result.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getUserById(int id){
        String query = "SELECT * FROM users WHERE id =" + id;
    }

}
