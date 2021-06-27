package day54_abstraction;

import java.util.Arrays;

public class Test4 {
    public  static int minNum(int [] nums){

        Arrays.sort(nums);
        return nums[0];
    }

    public static void main(String[] args) {
        int [] arr = {4, 1, 0, 8, -9, 3, 4};
        int min = minNum(arr);
    }

}
