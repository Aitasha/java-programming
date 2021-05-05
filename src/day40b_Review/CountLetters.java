package day40b_Review;

public class CountLetters {
//*[Count Letters]
//
//Create a method that will accept a String and print how many times each characters is found in the String
//
//Ex:
//	Input:
//		"apple tree"
//	Output:
//		a - 1
//		p - 2
//		l - 1
//		e - 3
//	      - 1  (space char)
//	    t - 1
//	    r - 1
//
//--------------------------------------------------
//
//[Sum of Numbers from String]
//
//Create a method that will accept a String and returns the sum of all the numbers in the String.
//
//Requirement: any numbers that are next to each other are not single digit numbers but instead read as a full number
//	Ex: a5bc12def100g
//		Here we would have added 5 + 12 + 100
//		NOT: 5 + 1 + 2 + 1 + 0 + 0
//
//--------------------------------------------------*/
public static void main(String[] args) {
    countLetters("apple tree");
}
    public static void countLetters(String str) {
        String checked = "";



            for (int i = 0; i < str.length(); i++) {
                char eachLetter = str.charAt(i);
                int count = 0;

                if (!checked.contains("" + eachLetter)) {

                for (int j = 0; j < str.length(); j++) {
                    char eachOtherLetter = str.charAt(j);

                    if (eachLetter == eachOtherLetter) {
                        count++;
                    }
                }

                System.out.println(eachLetter + " - " + count);
                checked += eachLetter + "";
            }
        }

    }}
