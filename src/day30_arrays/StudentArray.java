package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
        student1[0] = "AD1234";
        student1[1] = "Adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] = "202-543-1234";

        // or we can do:

        String[] student2 = {"MK4421" , "Mike" , "Bloomberg", "B22" , "703-432-1234"};

        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstName = " + student1[1]);
        System.out.println("student1 lastName = " + student1[2]);
        System.out.println("student1 batchNum = " + student1[3]);
        System.out.println("student1 callNumber = " + student1[4]);

        System.out.println("student data length: " + student1.length);
        //student1 data array contains 5 items, if true - Student1 data array correct length
        //if false: Fail: data array has incorrect length
        //

        if (student1.length == 5) {
            System.out.println("Student1 data array correct length");
        } else {
            System.out.println("Fail: data array has incorrect length");
        }


        if (student2.length == student1.length) {
            System.out.println("PASS: data arrays length match");
        } else {
            System.out.println("FAIL: data arrays length mismatch");
        }
        /**
         * print firstName and lastName all in upper case ADAM SMITH
         */

        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());

        //read mobile from array and store into variable


    }
}
