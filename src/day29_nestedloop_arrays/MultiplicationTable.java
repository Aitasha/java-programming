package day29_nestedloop_arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.println();
            for(int n = 1; n <= 10; n++) {
                System.out.print(i * n + "\t");
            }
        }
    }
}
