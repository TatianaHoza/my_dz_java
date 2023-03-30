//Вывести все простые числа от 1 до 1000
// простое число - то число которое делится без остатка только на 1 и на само себя
// (1 - это не простое число);
package dz_1.tasks;

public class Task3 {
    public static void numbers() {
        for (int item = 2; item <= 1000; item++) {
            boolean isPrime = item > 2;
            for (int j = 2; j < item; j++) {
                if(item % j == 0){ isPrime = false;
                    break;}
            }
            if(isPrime)
                System.out.println(item);
        }

        }

    }



