package day57_abstraction_polymorphism.abstract_class_vs_interface;

public abstract class AbstractA {

    int num1;
    private double price;
    public static int count;
    public final String TYPE = "abstract";//final variables can be upper case
    public static final String LANGUAGE = "java";

    public AbstractA(){
        System.out.println("AbstractA constructor");
    }

    public abstract void absMethodA();
    public void methodB(){
        System.out.println("methodB called");
    }
    public static void staticMethodC(){
        System.out.println("static methodC is called");
    }

}
