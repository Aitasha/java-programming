package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithListReturn {

    public static void main(String[] args) {
        //1 second - 1_000_000_000 nanoseconds
        long start = System.nanoTime();
        List<Integer> mlnNums = getInteger();
        long end = System.nanoTime();
        System.out.println(getInteger());//returns ready ArrayList object, No need new Array
        System.out.println("ArrayList time = " + (end-start));

        long st = System.nanoTime();
        int[] arr = getIntegerArray();

        long en = System.nanoTime();
        System.out.println("Array time = " + (en-st));


    }



//method for ArraList
    public static List<Integer> getInteger(){
        List<Integer> a = new ArrayList<>();
        for(int i = 0; i < 1000_000; i++){
            a.add(i);
        }
        return a;
    }

    //method for Array
    public static int[] getIntegerArray() {
        //declare empty array with size - 1_000_001
        int[] nums = new int[1_000_001];
        //loop and assign numbers
        for (int i = 0; i <= 1_000_000; i++) {
            nums[i] = i;
        }
        return nums;
    }
}
