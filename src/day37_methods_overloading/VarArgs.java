package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10, 5);
        addNumbers(12, 39485873, 938457, 8495, 8349237);

    }
    public static void addNumbers(int...nums) {
        int sum = 0;
        for(int n : nums) {
            sum += n;
        }
        System.out.println("sum = " + sum);
    }
}
