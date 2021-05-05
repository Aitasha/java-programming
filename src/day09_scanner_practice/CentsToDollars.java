package day09_scanner_practice;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {

        System.out.println("Enter cents: ");

        Scanner scan = new Scanner(System.in);

        int cents = scan.nextInt();
        int dollars = cents / 100;
        int remainingCents = cents % 100;
        System.out.println("In " + cents + " cents: " + dollars + " dollars " + remainingCents + " cents");
    }
}
