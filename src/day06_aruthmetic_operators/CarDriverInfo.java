package day06_aruthmetic_operators;

public class CarDriverInfo {
    public static void main (String[] args){
        //String carModel;
        //carModel = "Lexus XL";
        String carModel = "Lexus XL";
        String driverName = "Ayta Darbakova";
        String licenseNumber = "lucky7777";
        short speed = 55;
        boolean isAutomatic = true;
        char licenseClass = 'D';

        // Lexus XL is car model.

        System.out.println(carModel + "  is a car model.");
        System.out.println("Driver Name: " + driverName);
        System.out.println(driverName);
        System.out.println(driverName + " is driving a car.");
        System.out.println(driverName + " is driving " + carModel + ".");

        System.out.println("Current speed is " + speed + ".");
        System.out.println("Current speed: " + speed + " MPH");

        System.out.println("Is car automatic ->" + isAutomatic);
        System.out.println(licenseClass + " " + isAutomatic);






    }
}
