package day50_inheritance;

public class AudioBook extends Book {
    double length;
    String narrator;

    public void listen(){
        System.out.println("Listen to " + title + " by " + author + " narrated by " + narrator);
    }
}
