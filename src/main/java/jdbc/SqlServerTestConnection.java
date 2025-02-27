package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlServerTestConnection {

    public static Connection getSqlServerConnection() throws SQLException {
        return SQLServerConnectUtils.getSQLServerConnection();
    }

    public static void main(String[] args) throws SQLException {
        System.out.println("Get connection");

        Connection conn = SqlServerTestConnection.getSqlServerConnection();
        System.out.println("Opened connection " + conn);

        Statement statement = conn.createStatement();

        String sql = "SELECT * FROM dbo.Customer;";

        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()){
            int customerId = rs.getInt(1);
            String customerUsername = rs.getString(2);
            String customerEmail = rs.getString(3);

            System.out.println("------------------");
            System.out.println("Customer Id : "+ customerId);
            System.out.println("customerUsername : "+ customerUsername);
            System.out.println("customerEmail : "+ customerEmail);
        }
        conn.close();
        System.out.println("----- Closed Connection -------");
    }
}
