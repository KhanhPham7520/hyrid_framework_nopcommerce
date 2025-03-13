package javaBasic;

import jdk.jfr.Description;
import org.testng.annotations.Test;


// Tìm số lớn nhất trong mảng
public class Topic_11_Find_Largest_Number {

    int number[] = {5, 8, 15, 7, 60, 10};

    @Test
    public void TC_01_Find_Max_Number() {
        int x = 0;
        for (int i = 0; i < number.length; i++) {
            if (x < number[i]) {
                x = number[i];
            }
        }

        System.out.println("First number = " + number[0]);
        System.out.println("Last number = " + number[number.length - 1]);
        System.out.println("Max number = " + x);
    }

    @Test
    @Description("")
    public void TC_02_calculate_Sum_First_And_Last_Number() {
        int x = 0;
        x = number[0] + number[number.length - 1];
        System.out.println("Sum : " + x);

    }

    @Test
    @Description("")
    public void TC_05_Calculate_Sum_Average() {
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }

        System.out.println("Sum all number = " + sum);

        float averageNumber = sum / number.length;
        System.out.println("Average all number = " + averageNumber);
    }

}
