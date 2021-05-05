package day28_loops;

public class JavaCityClass {
    public static void main(String[] args) {
        int day = 0;
        int totalCases = 0;
        for(day = 1; day <= 30; day++) {
            if(day % 7 == 0) {
                totalCases += 500;
            } else {
                totalCases += 200;
            }
            System.out.println("day " + day + " - daily cases: " + totalCases);
        }
        System.out.println("JavaCity Nov/2021 Total cases: " + totalCases);
    }
}
