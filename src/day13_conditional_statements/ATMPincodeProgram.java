package day13_conditional_statements;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        System.out.println("***WELCOME TO TD BANK ATM***");
        int secretPinCode = 1234;
        int inputPinCode = 1255;

        if(inputPinCode == secretPinCode){
            System.out.println("Welcome to your account");
            System.out.println("You can withdraw, check balance, deposit.");
        } else {
            System.out.println("Incorrect PIN code! " + inputPinCode);
            System.out.println("Please try again!");


        }
    }
}
