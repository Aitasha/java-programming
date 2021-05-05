package day25_loops;

public class PrinEvenOrOddNumbers {
    public static void main(String[] args) {
        System.out.println("EVEN NUMBERS 0 - 100");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nODD NUMBERS 0-100");
        for (int k = 0; k <= 100; k++) {
            if (k % 2 != 0) {
                System.out.print(k + " ");
            }
        }
    }
}