package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println("count = " + count);

        String strPrice = "123.5";
        double price = Double.parseDouble(strPrice);
        if(price > 100) {
            System.out.println("strPrice > 100");
        }

        String sentence = "I wrote 100 lines of code";
        String [] splittedSentence = sentence.split(" ");
        int linesOfCode = Integer.parseInt(splittedSentence[2]);
        System.out.println("Lines of code: " + linesOfCode);
    }
}
