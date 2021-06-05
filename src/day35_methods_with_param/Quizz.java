package day35_methods_with_param;

public class Quizz {
    public static void main(String[] args) {
        System.out.println(method3(50));

        int result = method4('z', "zebra");
        System.out.println("result");

        int[] arr = {5,7,3,8,20,14};

    }

    public static String method3(int num) {
        if(num<0) {
            return "Less than 0";
        } else if(num < 50) {
            return "Less than 50";
        } else if(num < 100) {
            return "Less than 100";
        } else {
            return"other";
        }
    }

    public static int method4(char c, String s) {

        if(s.contains("" + c)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void method8(int [] arr) {

        for(int n: arr) {

            if(n % 2 == 0) {
                continue;
            }

            System.out.println(n);
        }
    }
}
