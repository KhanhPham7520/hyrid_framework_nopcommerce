package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLServerConnectUtils {


    public static Connection getSQLServerConnection(){
        String hostName = "localhost";
        String dbName = "NopCommerceDB";
        String userName = "sa";
        String password = "F@ster456";
        return getSqlServerConnection(hostName, dbName, userName, password);
    }

    public static Connection getSqlServerConnection(String hostName, String dbName,
                                                     String username,String password){
        Connection conn = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String connectionUrl = "jdbc:sqlserver://" +
                    hostName + ";" + "databaseName=" + dbName + ";" + "user="+username + ";"
                    +"password="+password + ";trustServerCertificate=true";

            conn = DriverManager.getConnection(connectionUrl, username, password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }

}
