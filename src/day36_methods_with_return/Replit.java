package day36_methods_with_return;

import java.util.*;

public class Replit {
    public static void main(String[] args) {



            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            long result = 1;

            for (int i = n; i > 0; i--) {
                result = result * i;
            }
            System.out.println(result);

        }

    }
