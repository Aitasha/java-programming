package day60_exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {


        try{
            String word = "java";
            System.out.println("length = " + word.length());
            System.out.println(word.substring(2));
        }catch(NullPointerException e) {
            System.out.println("NullPointerException caught and handled, please check if String has valid index");
        }catch(StringIndexOutOfBoundsException e) {
            System.out.println("Index is wrong, please check if you entered a valid index");
        }catch(Throwable t) {
            System.out.println("Exception is caught");
            System.out.println("Reason = " + t.getCause());
        }


    }
}
