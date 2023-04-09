package dz_3.tasks;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//Задан целочисленный список ArrayList.
//        Найти минимальное, максимальное и среднее из этого списка.
public class Task3 {
    public static void arraySorted() {

        List<Integer> array = new ArrayList<>();
        //int[] array = new int[] {12,10,5,13,8,30,115,18,90,1,0};
        array.add(11);
        array.add(1);
        array.add(112);
        array.add(6);
        array.add(34);
        array.add(9);
        array.add(27);
        array.add(5);
        Collections.sort(array);
        System.out.println(array.get(0));
        System.out.println(array.size()-1);

        double average = 0;
        if (array.size() > 0)
        {
            double sum = 0;
            for (int i = 0; i < array.size(); i++) {
                sum += array.get(i);
            }
            average = sum / array.size();
        }
        System.out.println(average);
    }




}
