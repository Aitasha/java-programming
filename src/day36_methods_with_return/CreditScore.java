package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(600);
        checkEligible(760);
        checkEligible(400);
       // System.out.println(checkEligible(750)); ERROR - cannot print void method
        System.out.println(getCreditScore());
        getCreditScore();//do not type anything
        int score = getCreditScore();
        System.out.println(score);
    }
    public static void checkEligible (int creditScore) {
        if(creditScore >=700) {
            System.out.println("You're eligible for leasing this car");
        } else {
            System.out.println("You're not eligible for leasing this car");
        }
    }
    public static int getCreditScore() {
        return 800;
    }
}
