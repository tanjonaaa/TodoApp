package App.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static Connection connectionInstance;
    public static Connection getConnectionInstance(){
        if(connectionInstance == null){
            try{
                connectionInstance = DriverManager.getConnection(
                        Credentials.DB_URL,
                        Credentials.DB_USER,
                        Credentials.DB_PASS
                );
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return connectionInstance;
    }
}
