package day09_scanner_practice;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        System.out.println("Enter hourly rate: ");
        double hourlyRate = scan.nextInt();
        double weeklyPay = hourlyRate * 40;
        System.out.println("Weekly pay: " + weeklyPay);

        System.out.println("Enter monthly hours: ");
        double monthlyPay = weeklyPay * 52 / 12;
        System.out.println("Monthly pay: " + monthlyPay);


        System.out.println("Enter yearly hours: ");
        double yearlyPay = weeklyPay * 52;
        System.out.println("Yearly pay: " + yearlyPay);

    }
}
