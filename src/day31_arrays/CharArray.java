package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};
        for(char each : letters) {
            System.out.print(each);
        }
        System.out.println("");
        String sentence = new String(letters);
        System.out.println("sentence = " + sentence);

        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length() = " + item.length());


        String fruitStr = "";
        String[] items = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};
        for(String each : items) {
            System.out.print(each + "-");
            fruitStr += each + "-";
        }
        System.out.println("\nfruitStr = " + fruitStr);


        String[] languages = {"java", "python", "c++", "sql", "ruby", "javascript"};
        System.out.println(String.join("|", languages));
        System.out.println(String.join("##", languages));
        String joinedLanguages = String.join("<>", languages);
        System.out.println("joinedLanguages = " + joinedLanguages);





    }
}
