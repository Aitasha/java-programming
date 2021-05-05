package day06_aruthmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args){
        int toyotas = 431;
        int hondas = 233;
        int vw = 2;
        int tesla = 20;
        int nissan = 1;
        int bmw = 155;

        int totalCarsInParking = toyotas + hondas + vw + tesla + nissan + bmw;

        System.out.println("There are " + totalCarsInParking + " in the parking lot.");

        String pizza = "hawaiian";
        int slices = 8;
        int people = 4;
        int howManySlicesPerPerson = slices/people;

        System.out.println("There are " + howManySlicesPerPerson + " slices per person.");
        System.out.println("We ordered hawaiian pizza with " + slices + " slices, " +
                            people + " people ate " + howManySlicesPerPerson + " slices each.");

    }
}
