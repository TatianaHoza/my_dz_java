package dz_5.tasks;

import java.util.HashMap;
import java.util.Map;

//1)Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
public class Task1 {
    public static final Map<String, String> phonesToName = new HashMap<>();

    public static void setPhonesToName() {
        phonesToName.put("375291234556", "Иванов И.B.");
        phonesToName.put("375171286556", "Иванов И.B.");
        phonesToName.put("375331597534", "Петров С.B.");
        phonesToName.put("37517315971564", "Петров С.B.");
        phonesToName.put("37517971564", "Сидоров К.B.");
        phonesToName.put("3751731594", "Желудев С.B.");

        System.out.println(phonesToName);

        for (Map.Entry<String, String> entry : phonesToName.entrySet()) {
            if (entry.getValue().equals("Иванов И.В.")) {
                System.out.println("по вашему запросу по имени" + entry);
            }


                String k = phonesToName.getOrDefault("3751731594", "Номер не определен");
                System.out.println("по вашему запросу по номеру:" + k);


            }
        }
    }

