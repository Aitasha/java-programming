package day23_string_manipulation_while_loop;

import java.nio.charset.StandardCharsets;

public class ChainingStringMethod {
    public static void main(String[] args) {
        String word = "wooden spoon";

        System.out.println(word.toUpperCase().toLowerCase().length());
        //remove spaces first and print everything uppercase
        System.out.println(word.replace(" ", "").toUpperCase());

        String city = "kabul";
                             //read 1st letter .makeUcase    + read 2nd till last.makelowercase
        System.out.println(city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase());
        String capitalized = city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase();
        System.out.println("capitalized = " + capitalized);

        //.isEmpty().toUpperCase() Does not work since isEmpty is boolean

    }
}
