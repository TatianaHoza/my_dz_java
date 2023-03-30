//Реализовать простой калькулятор
package dz_1.tasks;

import java.util.Scanner;

public class Task4 {
    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        double number_1 = scanner.nextDouble();
        System.out.println("Enter + - / *: ");
        char operation = scanner.next().charAt(0);
        System.out.println("Enter 2st number: ");
        double number_2 = scanner.nextDouble();

        if (operation == '+'){
            System.out.println(number_1+number_2);
        }
        else if (operation == '-') {
            System.out.println(number_1-number_2);
        }
        else if (operation == '/') {
            System.out.println(number_1/number_2);
        }
        else if (operation == '*') {
            System.out.println(number_1*number_2);
        }


    }
}
