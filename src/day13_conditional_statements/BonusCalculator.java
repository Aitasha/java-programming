package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0;
        double salesAmount = 500.55;

        if (salesAmount <= 1000) {
            System.out.println("Good job! You're qualified for bonus!");
            bonus = 50;
        } else {
            System.out.println("Great job! You're qualified for full bonus!");
            bonus = 100;
        }
        System.out.println("Your bonus for sales amount: " + bonus);
    }
}
