package day23_string_manipulation_while_loop;

public class Quizz {
    public static void main(String[] args) {

        int a = 0;
        while(a<=6) {
            a += 2;
        }
        System.out.println(a);

        int j = 7;
        for(int i = 0; i < j-1; i += 2) {
            System.out.print(i + " ");
        }

        String word = "word";

        System.out.println(word.substring(0, word.length() / 2 ));

    }
}
