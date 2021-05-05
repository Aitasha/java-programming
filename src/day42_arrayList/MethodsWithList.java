package day42_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
        //declare String ArrayList and add values
       List<String> words = new ArrayList<>();
        words.add("java");        words.add("html");       words.add("selenium");       words.add("a");
        words.add("input");       words.add("title");
        //pass the words list to printStrList method
        printStrList(words);
        printStrList(Arrays.asList("select", "option", "br", "python", "sql", "api"));

        //sumIntegerList(Arrays.asList(1, 5, 98, 25));

        List<Integer> nums = Arrays.asList(23, 54, 23, 54554, 234, 11, 5, 2);
        int sum = sumIntegerList(nums);
        System.out.println("sum = " + sum);

    }

    /**
     * methodName: printStrList
     * param: List of Strings
     * return:void
     * prints all values separated by space in same line
     */

    public static void printStrList(List<String> stringList) {
        for(String str : stringList) {
            System.out.print(str + " ");
        }

        System.out.println();
    }

/**
 * method: sumIntegerList
 * param: List of integers
 * returns int
 * calculates sum of integers in the list then returns
 */

public static int sumIntegerList(List<Integer> nums) {
    int sum = 0;
    for(int each : nums) {
        sum += each;
    }
    return sum;
}

}
