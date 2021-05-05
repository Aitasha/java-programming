package day09_scanner_practice;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("######## F TO C ########");
        System.out.println("Enter F: ");
        double f = scan.nextDouble();
        double c = (f - 32) * 5/9;
        System.out.println(f + " F is in C: " + c);

    }
}
