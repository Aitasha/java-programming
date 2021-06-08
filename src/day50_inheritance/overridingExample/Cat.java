package day50_inheritance.overridingExample;

public class Cat extends Animal {
    public void jump() {
        System.out.println("Cat is jumping...");
    }

    public void speak(){  // .speak method  is already in parent class but we're adding one more -> OVERRIDING (same method name, same parameter)
        System.out.println("Cat is saying Meow...");
    }
}
