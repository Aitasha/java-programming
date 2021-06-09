package day49_static;

public class StaticMethods {
    int num = 10; //not static
    static int count = 5;

    public static void displayMessage(String message) {

        System.out.println("message: " + message);
        //System.out.println("num = " + num);  ERROR because num is not a static variable
        System.out.println("count = " + count);

    }

    public static void anotherStaticMethod() {
        System.out.println("another static method");
        displayMessage("wooden spoon");
    }

    //StaticMethods.instanceMethod(); -> NOT WORKING we need to create an object
    //StaticMethods stm = new StaticMethods();
    //stm.instanceMethod();
    public void instanceMethod() {
        System.out.println("instanceMethod");
        System.out.println("num = " + num);
        System.out.println("count = " + count);

    }
}
