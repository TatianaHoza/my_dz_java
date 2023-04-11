package dz_4.tasks;

import java.util.LinkedList;

//Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
public class ImplementQueue {
    public static void main() {
        LinkedList queue = new LinkedList<>();
        queue.add("каждый");
        queue.add("охотник");
        queue.add("желает");
        queue.add("знать");
        queue.add("где");
        queue.add("сидит");

        System.out.println("1." +queue);

        //поместить элемент в конец очереди
        queue.addLast("фазан");
        System.out.println("2." +queue);

        // возвратить 1 эл-т очереди не удаляя
        String firstEl = (String) queue.getFirst();
        System.out.println("3."+firstEl);
        System.out.println("3/1." +queue);

        // возвратить 1 эл-т очереди и удалить
        String firstEll = (String) queue.pollFirst();
        System.out.println("4."+firstEll);
        System.out.println("4/1." +queue);





    }


}
