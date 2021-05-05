package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "gitlab";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub","lab"));
        System.out.println("word = " + word);

        word = word.replace("hub","lab");
        System.out.println("word = " + word);
        System.out.println(word = word.replace('i', 'o').replace('a','i'));

        String sentence = "java is fun";
        String withNoSpaces = sentence.replace(" ","");
        System.out.println(withNoSpaces);

        sentence = sentence.replace("java","selenium")
                           .replace("fun","a lot of fun");
        System.out.println("sentence = " + sentence);

        String result = "1-48 of over 4,000 results for java book";
        System.out.println(result);
        result = result.replace("1-48 of over ","")
                       .replace(" results for java book","")
                       .replace(",","");
        System.out.println("result: " + result);

    }


}
