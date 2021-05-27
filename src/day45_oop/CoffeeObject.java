package day45_oop;

public class CoffeeObject {
    public static void main(String[] args) {

        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("coffee amount after refill = " + myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("coffee amount after drink 10 = " + myCoffee.getAmount());
        // NOT: my.Coffee.type = "Espresso"; INSTEAD use a method:
        myCoffee.setType("Espresso");
        System.out.println("My coffee = " + myCoffee.getType());
        System.out.println(myCoffee.toString());

        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type = " + coffee1.getType());

        //assign coffee1 object to coffee2
        Coffee coffee2 = coffee1;
        System.out.println("coffee2 type = " + coffee2.getType());
        coffee2.setType("Espresso");
        System.out.println("coffee2 type = " + coffee2.getType());//espresso
        System.out.println("coffee1 type = " + coffee1.getType());//espresso too

        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappuccino");

        Coffee coffee4 = null;// as reference variable does not refer to any object in the Heap
        coffee4.setType("turkish");//NullPointerException



    }
}
