package day39_wrapper_classes;

import day36_methods_with_return.Calculator;

public class WrapperClassMethod {
    public static void main(String[] args) {
        System.out.println(Integer.max(10, 5));
        System.out.println(Integer.sum(50, 35));
        System.out.println(Integer.min(5, 2));
        System.out.println(Integer.reverse(123));
        System.out.println("MIN INT: " + Integer.MIN_VALUE);
        System.out.println("MAX INT: " + Integer.MAX_VALUE);

        System.out.println(Double.max(234.4, 23.9));
        System.out.println("MIN DOUBLE: " + Double.MIN_VALUE);
        System.out.println("MAX DOUBLE:" + Double.MAX_VALUE);

        System.out.println(Double.compare(5, 1));//console:1
        System.out.println(Double.compare(5, 5));//console:0
        System.out.println(Double.compare(5, 45));//console:-1

        System.out.println(Character.isDigit('8')); //true
        System.out.println(Character.isDigit('v'));//false
        System.out.println(Character.isUpperCase('V'));

        char letter = 'A';
        if(Character.isUpperCase(letter)) {
            System.out.println("it is uppercase");
        }

        String word = "JaVa iS FuN";
        for (int i = 0; i < word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))) {
                System.out.print(word.charAt(i));
            }
        }





    }
}
