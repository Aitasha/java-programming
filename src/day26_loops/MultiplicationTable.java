package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
            int number = 15;
           if(number < 1 || number > 10) {
               System.out.println("ERROR: invalid input");
           return;
           }

            for(int i = 1; i <=10; i++){
                System.out.println(number + " x " + i + " = " + (number *i));
            }






    }
}
