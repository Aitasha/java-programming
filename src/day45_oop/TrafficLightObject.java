package day45_oop;

public class TrafficLightObject {
    public static void main(String[] args) {
        //create traffic light object
        TrafficLight trafficLight = new TrafficLight(); //Creating trafficLight object
        //trafficLight.color = "red";   NOT A GOOD PRACTICE
        //we will assign/update the value of color using a method of the class
        trafficLight.showColor();
        trafficLight.changeColor("red");
        trafficLight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("blue");
        trafficLight2.showColor();
    }
}
