package actions.pageAction.products;

import actions.commons.BasePage;
import jdbc.SQLServerConnectUtils;
import org.openqa.selenium.WebDriver;
import pageUI.products.DesktopPageUI;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DesktopPageAction extends BasePage {

    WebDriver driver;

    public DesktopPageAction(WebDriver driver) {
        this.driver = driver;
    }

//    public String getProductName(){
//        return getText(driver, DesktopPageUI.class);
//
//    }

    public int getProductSizeAtUI(){
        String totalNumber = getText(driver, DesktopPageUI.SELECTED_PRODUCT_PAGE_SIZE);
        // dùng hàm split() nếu nó hiển thị là 3 items
//        String totalArray[] = totalNumber.split(" ");
//        totalNumber = totalArray[0];

        return Integer.parseInt(totalNumber);// convert string into integer
    }

    public int getProductSizeAtDB()  {
        Connection conn = SQLServerConnectUtils.getSQLServerConnection();
        Statement statement;
        List<Integer> totalProducts = new ArrayList<Integer>();
        try {
            statement = conn.createStatement();
            String sql = "SELECT TOP 3 * FROM Product;";
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()){
                // Query bao nhiêu thì add bấy nhiu
                totalProducts.add(rs.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return totalProducts.size();
    }
}