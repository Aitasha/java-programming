package day10_shorthand_operators;

import javax.lang.model.SourceVersion;

public class ShortHandOperators {
    public static void main(String[] args) {

        int cars = 10;
        System.out.println("cars in parking lot = " + cars);
        cars +=2;
        System.out.println("cars in parking lot = " + cars);
        cars -=6;
        System.out.println("cars in parking lot = " + cars);

        int electricCars = 13;
        cars = cars + electricCars;
        System.out.println("Cars = " + cars);
        cars += electricCars;
        System.out.println("Cars in parking lot: " + cars);

        String word = "Java";
        System.out.println("word = " + word);

        word = word + " programming";
        System.out.println("word = " + word);
        word += " is fun";
        System.out.println("word = " + word);

        String selenium = " but selenium is more fun.";

        word += selenium;
        System.out.println("word = " + word);

        word += 1235;
        System.out.println("word = " + word);

        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        //add letter 'J'
        letter += 'J';
        System.out.println("letter = " + letter);
        letter += 'U';
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("normal parking fee = " + parkingFee);
        parkingFee /= 2;
        System.out.println("early bird parking fee = " + parkingFee);
        parkingFee -= parkingFee;
        System.out.println("weekend parking is free " + parkingFee);




    }
}
