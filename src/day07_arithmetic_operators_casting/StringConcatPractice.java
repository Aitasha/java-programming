package day07_arithmetic_operators_casting;

public class StringConcatPractice {
    public static void main(String[] args){
        System.out.println("java" + 5 + 3); //java53
        System.out.println("java" + (5 + 3)); //java53
        System.out.println(5 + 3 + "java");//8java
        System.out.println(5 + (3 + "java"));//53java

        System.out.println("hello" + 1 + 2 + 3);
        System.out.println(1 + 2 + 3 + "hello");

        String str1 = "hello";
        String str2 = "friends";
        System.out.println(str1 + " " + str2);

        int num1 = 7;
        int num2 = 8;

        System.out.println(num1 + num2);
        System.out.println(num1 + " " + num2);
        System.out.println(num1 + "" + num2);

        char char1 = 'a';
        char char2 = 'b';
        System.out.println(char1 + char2);//if chars it takes number from ASCII table
        System.out.println(char1 + "" + char2);

    }
}
