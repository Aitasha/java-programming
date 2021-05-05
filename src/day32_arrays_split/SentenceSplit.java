package day32_arrays_split;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        System.out.println("1st word - " + words[0] );
        System.out.println("2nd word - " + words[1] );
        System.out.println("3rd word - " + words[2] );

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] words2 = googleResult.split(" ");
        System.out.println(Arrays.toString(words2));
        System.out.println("Count = " + words2[1]);
        System.out.println("Seconds = " + words2[3].replace("(", ""));
        //replace with substring         System.out.println("Seconds = " + words2[3]. substring(1);

        for(String eachWord : words2) {

        }

    }
}
