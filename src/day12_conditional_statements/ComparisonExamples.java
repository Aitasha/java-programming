package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {

        int currentSpeed = 45;
        int speedLimit = 55;
        boolean isSpeeding = currentSpeed < speedLimit;
        System.out.println("Are you speeding? " + isSpeeding);

        currentSpeed += 20;
        isSpeeding = currentSpeed > currentSpeed;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("current speed = " + currentSpeed + " mph");
        System.out.println("speed limit = " + speedLimit + " mph");

        double accountBalance = 250.25;
        double itemPrice = 200.99;
        System.out.println("can I afford? - " + (accountBalance >= itemPrice));

        boolean canAfford = accountBalance >=itemPrice;
        System.out.println("can afford = " + canAfford);
        
        accountBalance -= itemPrice;
        
        boolean isBroke = accountBalance <= 0;
        System.out.println("isBroke - " + isBroke);
    }
}
