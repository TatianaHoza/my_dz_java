package dz_4.tasks;
//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayReverse {
    public static void addList() {
        List<String> list = new LinkedList<String>();
        list.add("Hello");
        list.add("world");
        list.add("!");
        LinkedList<String> listReversed = reverseLinkedList((LinkedList) list);
        System.out.println(listReversed);
    }

    public static LinkedList reverseLinkedList(LinkedList list) {
        Collections.reverse(list);
        return list;

    }

}
