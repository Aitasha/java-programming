package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());

        //3 steps to learn any method:
        //1. What does it accept?
        //str.isEmpty();
        //str.lengh();
        //str.equals("accept something")
        //2. What does method do?
        //-purpose of the method
        //isEmpty -> checks if string is empty, no chars
        //length -> counts number of characters
        //3. What does method return?
        //is empty -> boolean
        //length -> int
        //toUpperCase() -> String
        //some methods return

        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length() == 0);
        if (jobTitle.isEmpty()) {
            System.out.println("JobTitle is missing, please resend");
        }
        String veggie = "carrots";
        if(!veggie.isEmpty()) {
            System.out.println("We have " + veggie);

            String word2;
            //System.out.println(word2.isEmpty()); ERROR NOT INITIALIZED

        }

    }
}
