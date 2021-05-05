package Day19_class_vs_object_string;

import java.sql.SQLOutput;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "CyberTek";
        String sentence = "123 Java IS Fun";
        System.out.println(word);
        //convertword to all lowercase
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println("JAVA".toLowerCase());

        word.toLowerCase();
        System.out.println(word);// value did not change

        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase );


        //change word to all lowercase letters and assign back
        word = word.toLowerCase();
        System.out.println("word = " + word);

        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase - " + company.toUpperCase());
        System.out.println("Java".toUpperCase());

        //change company "Amazon" to "AMAZON"
        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);



    }
}
