package day47_constructors;

public class Student {

   String name;
   int age;

    //No args constructor
    public Student(){
       System.out.println("No_Args Constructor");


    }

    //constructor with 1 param: String name
    public Student(String name){
        System.out.println("name param constructor | name = " + name);
    }

    //constructor with age
    public Student(int age){
        System.out.println("age param constructor | age = " + age);
    }

    //constructor with name and age

    public Student(String name, int age){
        System.out.println("name and age params constructor | name = " + name + " | age = " + age);
    }

}
