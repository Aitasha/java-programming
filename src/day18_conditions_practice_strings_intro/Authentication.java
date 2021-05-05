package day18_conditions_practice_strings_intro;

import java.util.Scanner;

public class Authentication {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int last4SSN = scan.nextInt();
        int pinCode = scan.nextInt();

        int expLast4SSN = 1234;
        int expPinCode = 4321;

        if (last4SSN == expLast4SSN && pinCode == expPinCode) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication not successful");
            if (last4SSN != expLast4SSN) {
                System.out.println("Last 4 of SSN did not match");
            } else if (pinCode != expPinCode) {
                System.out.println("pinCode did not match");
            }
        }

    }
}
