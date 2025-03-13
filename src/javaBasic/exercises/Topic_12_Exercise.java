package exercises;


import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;

public class Topic_12_Exercise {

    String courseName = "Automation Testing Advance";

    @Test
    public void TC_02_Count_Character() {
        char courseNameArr[] = courseName.toCharArray();
        int count = 0;
        for (char c : courseNameArr) {
            if (c == 'o') {
                count++;
            }
        }
        System.out.println(count);
    }

    @Test
    public void TC_03_Reverse_String() {
        char courseNameArr[] = courseName.toCharArray();

        Collections.reverse(Arrays.asList(courseNameArr));

        for (int i = courseNameArr.length - 1; i >= 0; i--) {
            System.out.print(courseNameArr[i]);
        }
    }
}
