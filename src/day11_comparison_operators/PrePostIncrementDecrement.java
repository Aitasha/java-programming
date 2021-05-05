package day11_comparison_operators;

public class PrePostIncrementDecrement {
    public static void main(String[] args) {
        //PRE_INCREMENT
        int num1 = 10;
        int num2 = ++num1;
        System.out.println(num1);
        System.out.println(num2);
        
        //POST_INCREMENT
        int num3 = 8;
        int num4 = num3++;
        System.out.println("num 3 = " + num3);
        System.out.println("num 4 = " + num4);
        
        int apples = 5;
        int basket = ++apples;
        System.out.println("apples = " + apples);
        System.out.println("basket = " + basket);
        
        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = " + kiwiBasket);

        int myNumber = 15;
        int yourNumber = ++ myNumber;

        System.out.println("myNumber = " + myNumber);
        System.out.println("yourNumber = " + yourNumber);
        
        int a = 50;
        int b = 22;
        int c = a++ + ++b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        
        

    }
}
