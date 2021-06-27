package day53_inheritance.tesla.hiding;

public class Mobile extends Phone{

    String type = "Mobile phone";

    public static void use(){
        System.out.println("Using mobile phone");
    }

    public void text(){
        use();
        System.out.println(" and sending a text message");
    }

}
