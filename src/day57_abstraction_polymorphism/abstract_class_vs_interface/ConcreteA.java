package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB{

    //MARKER INTERFACE - interface without any methods or variables. It is used in polymorphism or

    @Override
    public void absMethodA() { //concrete subclass must override abstract methods of a parent class or interface
        System.out.println("absMethodA implementation is called");
            }

    @Override
    public void methodB(){ // subclass can override non-final methods from parent class
        System.out.println("methodB overridden version is called");
    }

    //@Override-> static methods are hidden
    public static void staticMethodC(){ //static methods are hidden, not overriden
        System.out.println("staticMethodC hidden version is called");
    }


    @Override
    public void absMethodD(int num) {
        System.out.println("absMethodD overridden version is called");
    }
}
