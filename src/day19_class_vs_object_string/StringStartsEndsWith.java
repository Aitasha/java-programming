package day19_class_vs_object_string;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("i"));// true
        System.out.println(word.startsWith("in"));// true
        System.out.println(word.startsWith("intellij"));//
        System.out.println(word.startsWith("intellij idea"));// true

        System.out.println("java".startsWith("j"));// true

        System.out.println(word.startsWith("Int")); //false. case sensitive

        System.out.println(word.endsWith("idea"));
        System.out.println(word.endsWith("a"));

        String name = "Irina";
        if(name.endsWith("a")) {
            System.out.println("Maybe, it is a female name");
        }

        /**
         * Mr. -> Man
         * Dr. -> Doctor
         * Mrs.-> Married woman
         * Ms. -> Single woman
         * Sr. -> Senior
         */

        String firstName = "Dr. Nadir";
        if (firstName.startsWith("Mr.")){
            System.out.println("Man");
        } else if (firstName.startsWith("Dr.")) {
            System.out.println("Doctor");
        } else if (firstName.equals("Mrs.")) {
            System.out.println("Married woman");
        }else if (firstName.equals("Ms.")) {
            System.out.println("Single woman");
        }else if (firstName.equals("Sr.")) {
            System.out.println("Senior");
        }else {
            System.out.println("Normal name");
        }

        /**
         * String url = "https://www.stackoverflow.com"
         * .com - "Commercial website"
         * .ru - "Russian website"
         * .gov - "Government website"
         * .edu - "Education website"
         * org. - Organization website
         */
        String url = "https://www.stackoverflow.com";
        if (firstName.endsWith(".com")){
            System.out.println("Commercial website");
        } else if (firstName.endsWith(".ru")) {
            System.out.println("Russian website");
        } else if (firstName.endsWith(".gov")) {
            System.out.println("Government website");
        }else if (firstName.endsWith(".edu")) {
            System.out.println("Education website");
        }else if (firstName.equals(".org")) {
            System.out.println("Organization website");
        }



    }
}
