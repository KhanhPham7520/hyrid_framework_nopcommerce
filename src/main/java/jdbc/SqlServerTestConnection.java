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

//        String turnOnIdentityInsert = "SET IDENTITY_INSERT Warehouse ON";

//        String insertSql = "INSERT INTO Warehouse (Id, Name, AdminComment, AddressId) " +
//                "VALUES (3, 'Warehouse 3 (Ho Chi Minh City)', 'Test Comment', 9);";

//        String sql = "SELECT Id, Name FROM Product";
        String sql = "SELECT TOP 3 * FROM Product;";

        // Turn on IDENTITY_INSERT for auto increment permission
//        statement.executeUpdate(turnOnIdentityInsert);

//        int rowCount = statement.executeUpdate(insertSql);
//        System.out.println("Row count affected = " + rowCount);

        // Thực thi câu lệnh SQL trả về đối tuong ResultSet
        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()){
            int productId = rs.getInt("Id");
            String productName = rs.getString("Name");

            System.out.println("------------------");
            System.out.println("Product Id : " + productId);
            System.out.println("Product Name : " + productName);
        }
        conn.close();
        System.out.println("----- Closed Connection -------");
    }
}
