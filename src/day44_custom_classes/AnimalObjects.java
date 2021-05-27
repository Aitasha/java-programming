package day44_custom_classes;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal = new Animal(); //creating an object from Animal class
        System.out.println(animal.type);// will print some animal

        //calling method
        animal.eat();
        animal.eat("grass");

        animal.speak();

        //create object cheetahObj
        Animal cheetahObj = new Animal(); //creating an object from Animal class
        cheetahObj.type = "cheetah"; //change value/reassign to "cheetah"
        System.out.println(cheetahObj.type);
        cheetahObj.eat("meat");


    }
}
