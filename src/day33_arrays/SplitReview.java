package day33_arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word = "ajava";
        String[] array = word.split("a");
        System.out.println(array.length);

        int countOfA = array.length;

        System.out.println("countofA = " + countOfA);
    }
}
