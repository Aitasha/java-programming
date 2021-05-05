package day16_switch_ternary;

public class CapuccinoBuyer {
    public static void main(String[] args) {
        double price = 0;
        int callories = 0;
        String size = "grande";

        switch (size){
            case "tall":
                System.out.println("Tall Cappuccino please");
                price = 3.69;
                callories = 90;
                break;
            case "grande":
                System.out.println("Grande Cappuccino please");
                price = 3.99;
                callories = 120;
                break;
            case "venti":
                System.out.println("Venti Cappuccino please");
                price = 4.29;
                callories = 150;
                break;
            default:
                System.out.println("We do not serve that size of Cappuccino");
                break;
        }
        System.out.println("Total price " + price);
        System.out.println("You will consume " + callories + " cal of energy");

    }
}
