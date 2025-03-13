import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

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
        System.out.println("Tách chuỗi : " + schoolName.substring(11, 15));

        String result = "Viewing 48 of 132 results";
        String results[] = result.split(" "); // Tách chuỗi thành 1 mảng dựa vào kí tự / chuỗi kí tự
        System.out.println(results[1]);

        System.out.println("----------------------------------------------------------------------");

        // Replace
        String productPrice = "$100.00";
        productPrice = productPrice.replace("$", "");
        System.out.println("Before converting into float : " + productPrice);

        // Sap xếp nó: Sort Data (Asc/Desc)
        float productPriceF = Float.parseFloat(productPrice);
        System.out.println(productPriceF);

        System.out.println("----------------------------------------------------------------------");

        String driver = "libs/chromedriver";
        String osName = System.getProperty("os.name");
        System.out.println("Your os name : " + osName);

        // Handle operation model
        if (osName.toLowerCase().contains("windows")) {
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

        System.out.println("----------------------------------------------------------------------");

        String dynamicButtonXpath = "//button[@id= '%s']";
        System.out.println("Click into button "
                + dynamicButtonXpath.format("%s", "Login"));

        System.out.println("Click into button "
                + dynamicButtonXpath.format("%s", "Register"));

        System.out.println("Click into button "
                + dynamicButtonXpath.format("%s", "Cancel"));

        System.out.println("----------------------------------------------------------------------");

    }

    @Test
    public void splitString() {
        String text = "AirAsia Vietnam";
        String splitedString = Arrays.toString(text.split(" "));
        System.out.println("text : " + splitedString);
    }

    @Test
    public void TC_01_Count_Upper_Case_Number() {
        String courseName = "Automation Testing Advanced 20 21";
        int count = 0;
        char strArr[] = courseName.toCharArray();

        for (char character : strArr) {
            if (character <= 'Z' && character >= 'A') {
                count++;
            }
        }
        System.out.println("Sum of Uppercase : " + count);


    }

    @Test
    public void TC_02_Count_Lower_Case_Number() {
        String courseName = "Automation Testing Advanced Of Khanh";
        int count = 0;
        char strArr[] = courseName.toCharArray();

        for (char character : strArr) {
            if (character <= 'z' && character >= 'a') {
                count++;
            }
        }
        System.out.println("Sum of Uppercase : " + count);

    }


}
