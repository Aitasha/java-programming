package day57_abstraction_polymorphism.abstract_class_vs_interface;

public interface InterfaceA {

    //interfaces can only be PUBLIC STATIC FINAL | constance
    public static final String TYPE = "interface";
    double MAX_COUNT = 500;//this is also public static final

    // public InterfaceA(){
    //   System.out.println("constructor is not welcome in interface"); }


    public abstract void absMethodD(int num);
    public static void staticMethodE(String str){ //starting from Java 1.8 interface can have not only abstract but also  static and default methods
        System.out.println("staticMethodE is called with str - " + str);
    }
    public default void defaultMethodF(){
        System.out.println("defaultMethodF is called");
    }



}
