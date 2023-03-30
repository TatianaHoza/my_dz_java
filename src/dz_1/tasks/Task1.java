//Вычислить n-ое треугольного число (сумма чисел от 1 до n)
package dz_1.tasks;

import java.util.Scanner;

public class Task1 {
    public static void number() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = Integer.parseInt(scanner.next());
        int T = (int) (0.5 * n * (n+1));
        System.out.println(T);


    }
}
