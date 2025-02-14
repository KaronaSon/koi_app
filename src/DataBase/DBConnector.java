package DataBase;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class DBConnector {
    public Connection connector(String dbName){
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbName, "root", "");
            if (connection == null) {
                System.out.println("Connection is fail");
            }else{
                System.out.println("Connection is success");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}

