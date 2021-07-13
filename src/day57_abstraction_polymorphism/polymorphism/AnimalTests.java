package day57_abstraction_polymorphism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTests {

    public static void main(String[] args) {
        Animal a1 = new Animal(); // not polymorphic, data type and object type are same
        a1.makeNoise();

        //polymorphic way;
        //parent type = new child type
        Animal animal1 = new Dog();
        Animal animal2 = new Horse();
        Animal cat = new Cat();
        animal1.makeNoise();
        animal2.makeNoise();
        cat.makeNoise();

        //Polymorphic list of objects. List data type is Parent class
        //objects are any of child classes
        List<Animal> listofAnimals = new ArrayList<>();
        listofAnimals.add(new Dog());
        listofAnimals.add(new Dog());
        listofAnimals.add(new Horse());
        listofAnimals.add(new Cat());

        for (Animal each: listofAnimals) {
            each.makeNoise();
        }




    }
}
