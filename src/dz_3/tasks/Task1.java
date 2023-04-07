package dz_3.tasks;

import java.util.Arrays;

//Реализовать алгоритм сортировки слиянием
public class Task1 {
    public static void listSorted(String[] args) {
        int[] list1 = new int[] {12,10,5,13,8,30};
        int[] list2 = new int[] {1,18,6,123,18,300};
        int[] list3 = new int[list1.length + list2.length];

        int temp1 = 0;
        int temp2 =0;
        for (int i = 0; i < list3.length; i++) {
            if (temp1>list1.length-1) {
                int a = list2[temp2];
                list3[i] = a;
                temp2++;
            } else if (temp2>list2.length-1) {
                int a = list1[temp1];
                list3[i]=a;
                temp1++;

            } else if (list1[temp1]<list2[temp2]) {
                int a = list1[temp1];
                list3[i] = a;
                temp1++;

            } else {
                int a = list2[temp2];
                list3[i]= a;
                temp2++;
            }
            System.out.println(Arrays.toString(list3));
        }


    }
}
