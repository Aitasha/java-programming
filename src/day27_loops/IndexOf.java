package day27_loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "gitghub";
        char letter = 'g';
        int index = -1;//it's -1 because 0 is valid index

        for(int n = 0; n < word.length(); n++) {
            //System.out.println(n + " - " + word.charAt(n));
            if (word.charAt(n) == letter){
                index = n;
                System.out.println(letter + " is found at index " + index);
                break; //if it's return it's gonna exit the program not only the loop
            }
            if(index == -1) {
                System.out.println(letter + " is not present");
            } else {
                System.out.println(letter + " is found at index " + index);
            }
        }
    }
}
