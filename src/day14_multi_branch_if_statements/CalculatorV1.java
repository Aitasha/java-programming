package day14_multi_branch_if_statements;

public class CalculatorV1 {
    public static void main(String[] args) {
        double num1 = 2;
        double num2 = 3;
        char operator = '%';

        if(operator == '+'){
            System.out.println(num1 + num2);
        } else if (operator == '-'){
            System.out.println(num1 - num2);
        } else if (operator == '*'){
            System.out.println(num1 * num2);
        }else if (operator == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Invalid operator " + operator);
        }
    }
}
