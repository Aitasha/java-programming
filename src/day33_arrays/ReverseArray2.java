package day33_arrays;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        //swap using additional variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);



    String[] words = {"java", "html", "js", "ruby", "css"};
        System.out.println("before reverse words = " + Arrays.toString(words));
        for(int i = 0, j = words.length-1; i < words.length/2; i++, j--) {
            String tempWord = words[i];
            words[i] = words[j];
        }
        System.out.println("words after reverse = " + Arrays.toString(words));
    }
}
