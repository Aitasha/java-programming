package day36_methods_with_return;
import java.util.*;

public class Info {
    public static void main(String[] args) {
        System.out.println("Full name: " + fullName());
        System.out.println("Is married? " + isMarried());
        System.out.println("Age: " + getAge());
        System.out.println(getRandomYear());
        System.out.println(getRandomYear());

        String name = fullName();
        boolean married = isMarried();
        int year = getRandomYear();

        System.out.println("fullName() = " + fullName());
        System.out.println("married = " + married);
        System.out.println("year = " + year);
    }


    public static String fullName() {
        return "Mike Smith";
    }

    public static boolean isMarried() {
        return false;
    }

    public static int getAge() {
        return 35;
    }

    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }

}
