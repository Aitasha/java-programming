package day31_arrays;

import java.util.*;

public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums = {5, 56, 700, -44, 79, 32,};
        //print all nums in same line
        System.out.println(Arrays.toString(nums));
        //sort nums
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("min value: " + nums[0]);
        System.out.println("max value: " + nums[nums.length - 1]);


        String[] words = {"java", "python", "c++", "sql", "ruby", "javascript"};
        System.out.println(Arrays.toString(words));
        System.out.println(String.join(", ", words));
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        //sort in reverse order

        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));
    }
}
