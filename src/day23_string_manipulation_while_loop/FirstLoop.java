package day23_string_manipulation_while_loop;

import java.sql.SQLOutput;

public class FirstLoop {
    public static void main(String[] args) {


        int apples = 0;
        while(apples <= 10) {
            System.out.println("apples ->" + apples);
            apples++;
        }
        System.out.println("apples = " + apples);

        //infinite loop

        while(true) {
            System.out.println("Hello World");
        }



    }
}
