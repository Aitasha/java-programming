package day15_logicalOps_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Moscow";

        String teacher = "Gurhan";
        if(teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("It's java class with " + teacher);
        } else if(teacher.equals("Nadir")) {
            System.out.println("Soft skill class with " + teacher);
        } else {
            System.out.println("some class with Gurhan/Akbar");
        }

        String company = "NadirTech";
        double salary = 85_000.0;
        if(company.equals("Google") || salary >= 100_000){
            System.out.println("Accepting offer from " + company);
        } else {
            System.out.println("Decline offer from " + company);
        }
    }
}
