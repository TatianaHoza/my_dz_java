package dz_5.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

//список сотрудников
public class Task2 {
    public static String[] list = new String[]  {
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Иван Иванов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Иван Иванов",
            "Мария Рыкова",
            "Анна Крутова",
            "Марина Лугова",
            "Анна Владимирова",
            "Петр Лыков",
            "Иван Мечников",
            "Петр Петин",
            "Петр Лыков",
            "Иван Ежов"

    };

    public static void run() {
        HashMap<String,Integer> keyValue = new HashMap<String,Integer>();
        for (int i = 0; i <=list.length - 1 ; i++) {
            if(keyValue.containsKey(list[i])){
                int counter = keyValue.get(list[i]);
                keyValue.put(list[i],counter+1);
            }
            else keyValue.put(list[i],1 );


        }

        System.out.println(keyValue);

        List<Integer> sortedNames = new ArrayList<>(keyValue.values());
        Collections.sort(sortedNames,Collections.reverseOrder());


        System.out.println(sortedNames);
    }

}