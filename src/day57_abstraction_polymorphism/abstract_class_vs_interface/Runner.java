package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class Runner {

    public static void main(String[] args) {

        //We cannot create object of neither of them.
        //AbstractA absA = new AbstractA();
        //InterfaceA iA = new InterfaceA();

        InterfaceA.staticMethodE("wooden spoon");
        //ConcreteA.staticMethodE("hello");
        ConcreteA.staticMethodC();

    }

}
