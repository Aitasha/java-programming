package day61_exceptions_collections.checked_exceptions;

public class CheckExceptionDemo {
    public static void main(String[] args) throws InterruptedException{

        System.out.println("About to sleep for  seconds");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Woke up after  seconds");

        Thread.sleep(5000);
    }

}
