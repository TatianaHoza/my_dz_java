//n! (произведение чисел от 1 до n)
package dz_1.tasks;

import java.util.Scanner;


public class Task2 {
    public static void number_factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = Integer.parseInt(scanner.next());
        int f = 1;
        for (int item = 2; item <= n; item++) {
            f*=item;

        }
        System.out.println(f);
        }

    }
