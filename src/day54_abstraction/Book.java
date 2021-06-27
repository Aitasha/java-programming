package day54_abstraction;

public class Book {

    static String author = "JKR";
    static{
        author = "SK";
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.author = "CP";
        Book b2 = new Book();
        System.out.println(b1.author.equals((b2.author)));
    }
}
