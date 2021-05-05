package day09_scanner_practice;


import java.util.*;



public class AddNumbers {
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
        //System.out.println("Enter two numbers");
        //int num1 = scan.nextInt();
        //int num2 = scan.nextInt();
        //int result = num1 + num2;
        //System.out.println("Result: " + result);
        //Scanner scan = new Scanner(System.in);
        //Scanner scan = new Scanner(System.in);


        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int sum = 0;

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(i);
            for(i = 0; i < size; i++) {
                sum += list.get(i);
            }
        }

        // Write your code below

        System.out.println(sum);

            }

        }




