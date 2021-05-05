package day21_string_manipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word = "mom";
        char first = word.charAt(0);
        char last = word.charAt(2);

        if (first == last) {
            System.out.println("first and last letters are match");
        } else {
            System.out.println("first and last letters are mismatch");
        }

        if(word.charAt(0) == word.charAt(2)) {
            System.out.println("first and last letters are match");
        } else {
            System.out.println("first and last letters are mismatch");
        }

        String friend = "aziza";
        char firstLetter = friend.charAt(0);
        System.out.println(firstLetter);
        char lastLetter = friend.charAt(friend.length() - 1);
        System.out.println(lastLetter);

        String word1 = "java";
        System.out.println(word1.indexOf("y"));



    }
}
