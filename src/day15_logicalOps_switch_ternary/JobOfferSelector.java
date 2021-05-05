package day15_logicalOps_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        boolean isRemote = true;
        boolean hasBenefits = true;
        String location = "DMV";
        double salary = 150000;
        if(isRemote && hasBenefits && location.equals("DMV") && salary >= 150000){
            System.out.println("Get offer!");
        } else {
            System.out.println("Decline offer!");
        }
    }
}
