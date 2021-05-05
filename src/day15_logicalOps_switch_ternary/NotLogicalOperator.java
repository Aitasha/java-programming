package day15_logicalOps_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 2;
        if(!(age>7)){
            System.out.println("Need to sit in a child car seat. Age = " + age);

        } else {
            System.out.println("Can sit in normal seat. Age = " +age);
        }
        boolean isSmokingAllowed = true;


        boolean isAffordable = false;
        if(!isAffordable){
            System.out.println("Item is not affordable.");
        }

        String carModel = "Honda";
        if (!carModel.equals("Tesla")) {
            System.out.println("Not interested, thank you!");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if (!inputPassword.equals(secretPassword)){
            System.out.println("Incorrect password");
        }

    }
}
