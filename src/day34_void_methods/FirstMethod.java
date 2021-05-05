package day34_void_methods;

public class FirstMethod {
    public static void main(String[] args) {
        displayMessage();//1 call the method
        displayMessage();//2 call the method
        displayMessage();//3 call the method
       for(int i = 1; i <= 100; i++) {
           System.out.print(i + "-");
           displayMessage();
       }




    }
    //first custom reusable method
    public static void displayMessage() {
        System.out.println("Hello B22 Friends");
    }
}
