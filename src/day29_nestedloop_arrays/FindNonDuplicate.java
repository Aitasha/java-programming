package day29_nestedloop_arrays;

public class FindNonDuplicate {
    public static void main(String[] args) {
        int[] nums = {2, 2, 0, 3, 5};

        int sum = 0;
        for(int each : nums) {
            sum += nums[each];
        }

        System.out.println(sum);


    }
}
