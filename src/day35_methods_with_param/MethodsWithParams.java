package day35_methods_with_param;

public class MethodsWithParams {
    public static void main(String[] args) {
        displayValue(102);
        displayValue(25);
        displayValue(79);
        int count = 55;
        displayValue(count);
        greetByName("Ayta");
        greetByName("Roman");
        String name = "Luda";
        greetByName(name);
    }
    public static void displayValue(int num) {
        System.out.println("The value is " + num);
    }

    public static void greetByName(String name) {
        System.out.println("Hello " + name + ", how are you today?");
    }
}
