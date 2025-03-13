package javaBasic;

import jdk.jfr.Description;
import org.testng.annotations.Test;

public class Topic_09_While_Do_While {

    @Test
    @Description("")
    public void TC_01_learning_for_statement(){
        for (int i = 0; i < 5; i++) {
            System.out.println("For : " + i);

            if(i == 3){
                break;
            }
        }
    }

    @Test
    @Description("")
    public void TC_02_learning_while_statement(){
        int i = 0;

        // i = 5 không thỏa mãn điều kiện của while
        while (i < 5) {
            System.out.println("While : " + i);
            i++;
        }

    }

    @Test
    @Description("Do - While -> Chạy ít nhất 1 lần rồi mới kiểm tra điều kiên")
    public void TC_03_learning_do_while_statement(){
        int i = 0;
        do {
            System.out.println("Do - While : " + i);
            i++;
        }while (i < 5);
    }

}
