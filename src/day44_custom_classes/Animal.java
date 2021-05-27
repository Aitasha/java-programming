package day44_custom_classes;

public class Animal {

    //This is called custom class
    //we do not need run button here
    //we use it only to define  values and behavior

    //adding data
    String type = "some animal"; //declaring attributes

    //adding behavior
    public void eat(){
        System.out.println("eating");
    }

    //method overloading
    public void eat(String food) { //method eat has String parameter
        System.out.println("eating " + food);
    }

    public void speak() {
        System.out.println("speaking");
    }


}
