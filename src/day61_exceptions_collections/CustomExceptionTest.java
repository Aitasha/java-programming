package day61_exceptions_collections;

public class CustomExceptionTest {
    public static void main(String[] args) {

        int minutes = 30;
        System.out.println("Class is going on for " + minutes + " minutes");
        if(minutes > 50) {
            throw new BreakTimeException("It is break time!");
        }

        System.out.println("Let's continue the class");


        int balance = 400;
        int itemPrice = 300;

        System.out.println("Ihave $" + balance + " and purchase item for $" + itemPrice);

        if(itemPrice > balance) {
            throw new InsufficientBalanceException("Transaction declined. Not enough funds");
        }
        System.out.println("Item purchased successfully");


    }
}
