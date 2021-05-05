package day30_arrays;

public class ForLoopArray {
    public static void main(String[] args) {
        int[] data = {32, 532, 12, 5454, 22, 123, 543, 999, 321, 3};

        for(int eachNum : data) {
            System.out.println(eachNum);
        }

        for(int n : data){
            System.out.print(n + " ");

            System.out.println("");

            for(int i = 0; i < data.length; i++) {
                System.out.println(data[i]);
            }

            //print last value in array using length

            System.out.println("last value: " + data[data.length - 1]);

            //print all numbers backwards in same line
            System.out.println("");
            for(int idx = data.length - 1; idx >= 0; idx-- ) {
                System.out.println(data[idx]);
            }

    }

    }

}
