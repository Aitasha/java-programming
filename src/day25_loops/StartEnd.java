package day25_loops;

import java.util.*;


public class StartEnd {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter start and end: ");
        int start = input.nextInt();
        int end = input.nextInt();

        if(start > end) {
            System.out.println("reverse numbering is not supported");
        }

        for(int i = start; i <= end; i++) {
            System.out.println(i + " ");
        }



    }
}