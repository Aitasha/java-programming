package day50_inheritance;

public class BookInheritanceTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "intro to Java";
        book.author = "Savitch";
        book.type = "programming";
        book.price = 85.0;

        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        AudioBook audioBook = new AudioBook();
        audioBook.author = "Unmesh";
        audioBook.length = 60;
        audioBook.narrator = "Irina";
        audioBook.price = 44.99;
        audioBook.title = "Selenium Cookbook";
        audioBook.type = "Automation";
        audioBook.listen();

        EBook eBook = new EBook();
        eBook.title = "Java data structures";
        eBook.author = "Savitch";
        eBook.type = "programming";
        eBook.price = 85.0;
        eBook.size  = 45;
        eBook.pages = 100;
        eBook.readBook();
    }

}
