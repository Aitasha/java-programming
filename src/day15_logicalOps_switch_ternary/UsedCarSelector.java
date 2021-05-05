package day15_logicalOps_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        double budget = 5000;
        String model = "Tesla";
        double carPrice = 8999;
        if(carPrice <= budget && (model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla"))){
            System.out.println("Buy " + model + " for " + carPrice);
        } else {
            System.out.println("Not interested in Model " + model + " for " + carPrice);
        }
    }
}
