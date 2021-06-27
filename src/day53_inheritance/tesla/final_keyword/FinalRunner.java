package day53_inheritance.tesla.final_keyword;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);
        //TestData.ADMIN_USERNAME = "change"; Error: cannot change value of final variable
          //fianl int SSN = 465464313244;
         // SSN = 464676976767; ERROR
    }
}
