package dz_3.tasks;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void listRemove(String[] args) {
        Random rd = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(rd.nextInt(1, 11));
        }
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list2.add(list.remove(i));

            }

        }
        System.out.println(list);
        System.out.println(list2);
    }
}
