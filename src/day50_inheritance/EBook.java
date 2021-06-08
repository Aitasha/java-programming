package day50_inheritance;

public class EBook extends Book {
    int size;
    int pages;

    public void readBook(){
        System.out.println("Read " + title + " by " + author);
    }

}
