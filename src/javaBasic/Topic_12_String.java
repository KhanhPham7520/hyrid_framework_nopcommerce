import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.util.Arrays;

public class Topic_12_String {

    public static void main(String[] args) {
        String schoolName = "Automation Testing Advanced";
        String schoolAddress = "Ho Chi Minh city";
        System.out.println(schoolName.length());

        System.out.println("Vị trí của 1 ký tự/ chuỗi kí tự trong chuỗi = " + schoolName.indexOf("Automation"));
        System.out.println("Vị trí của 1 ký tự/ chuỗi kí tự trong chuỗi = " + schoolName.indexOf("T"));

        System.out.println("----------------------------------------------------------------------");

        // Substring
        System.out.println("Tách chuỗi : " + schoolName.substring(11));
        System.out.println("Tách chuỗi : " + schoolName.substring(11,15));

        String result = "Viewing 48 of 132 results";
        String results[] = result.split(" "); // Tách chuỗi thành 1 mảng dựa vào kí tự / chuỗi kí tự
        System.out.println(results[1]);

        System.out.println("----------------------------------------------------------------------");

        // Replace
        String productPrice = "$100.00";
        productPrice= productPrice.replace("$","");
        System.out.println("Before converting into float : " + productPrice);

        // Sap xếp nó: Sort Data (Asc/Desc)
        float productPriceF = Float.parseFloat(productPrice);
        System.out.println(productPriceF);

        System.out.println("----------------------------------------------------------------------");

        String driver = "libs/chromedriver";
        String osName = System.getProperty("os.name");
        System.out.println("Your os name : " + osName);

        // Handle operation model
        if(osName.toLowerCase().contains("windows")){
            Keys key = Keys.CONTROL;
        } else {
            Keys key = Keys.COMMAND;
        }

        String driverInstanceName = driver.toString();
        System.out.println("Driver Instance Name : " + driverInstanceName);

        System.out.println("----------------------------------------------------------------------");

        String helloWorld = " \n       \t    Hello World       ";
        System.out.println("Xóa tất cả các khoảng trắng : " + helloWorld.trim());

        String helloWordGet = helloWorld.trim();

        String strSplit[] = helloWordGet.split(" ");

        System.out.println("Đã get dc : " + strSplit[1]);

        String countStr = strSplit[1];
        int count = 0;
        for (int i = 0; i < countStr.length(); i++) {
            count++;
        }
        System.out.println("Chữ World có " + count + " kí tự");

    }

    @Test
    public void splitString(){
        String text = "AirAsia Vietnam";
        String splitedString = Arrays.toString(text.split(" "));
        System.out.println("text : " + splitedString );
    }




}
