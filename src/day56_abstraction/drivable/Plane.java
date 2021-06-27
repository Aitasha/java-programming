package day56_abstraction.drivable;

import day56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void autoPiloting() {
        System.out.println("Flying on auto-pilot mode");
    }

    @Override
    public void transportPeople() {

        System.out.println("Flying people from one city to another");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane costs " + (mile * 25.0) + " to fly " + mile + "miles");


    }

    @Override
    public void hi() {
        System.out.println("Welcome aboard!");
    }

    @Override
    public void bye() {

        System.out.println("Thank you for flying with us!");
    }

    public void land() {
        System.out.println("Plane is landing! Buckle up!");
    }
}
