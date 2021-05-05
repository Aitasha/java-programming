package day32_arrays_split;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String words = "java:python:selenium:html";
        String[] wordsArray = words.split(":");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array = " + wordsArray.length);

        for(String each: wordsArray) {
            System.out.println(each);
        }

        String sentence = "today I am coding java arrays" +
                "";
        String[] sentenceArray = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArray));

        for(String each : sentenceArray) {
            System.out.println(each);
        }

        int sentenceLength = sentenceArray.length;
        System.out.println("number of words in sentence = " + sentenceLength);

    }
}
