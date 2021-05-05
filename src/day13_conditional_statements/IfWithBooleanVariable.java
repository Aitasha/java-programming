package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
        if(isHungry){
            System.out.println("I am hungry I will go get something to eat.");
            System.out.println("Then code Java.");
        } else{
            System.out.println("I am not hungry.");
            System.out.println("Let's code Java.");
        }
        double price = 130.44;
        boolean isAffordable = price <= 200.0;

        System.out.println("isAffordable = " + isAffordable);
        if(isAffordable){
            System.out.println("I can afford it, let's buy!");
        } else {
            System.out.println("Too expensive, let's keep coding java");
        }
        boolean isRemoteJob = true;
        if (!isRemoteJob){
            System.out.println("Sorry, I'm not interested");
        } else {
            System.out.println("Sure, I'm interested, what is the interview process?");
        }
    }
}
