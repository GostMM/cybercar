package RessourceHumaine;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
    Connection connection;
    String dbName = "" ;
    String dbUser = "" ;
    String dbPwd = "" ;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost" + dbName + dbUser + dbPwd);

        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }

}
