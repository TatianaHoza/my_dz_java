package dz_2.tasks;

import java.util.Objects;

//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
//Студент [фамилия] получил [оценка] по предмету [предмет]
public class Task2 {
    private static String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, " +
            "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
            " {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

    public static void parse() {
        StringBuilder builder = new StringBuilder();
        String[] name = json.split(",");
        for (String s : name) {

            if (Objects.equals(s.split(":")[0].trim().replaceAll("[\"{ }\\[\\]]",
                    ""), "фамилия")) {
                builder.append("студент ")
                        .append(s.replaceAll("[\"}\\[\\]]", "")
                                .split(":")[1]);

            }
            if (Objects.equals(s.split(":")[0].trim().replaceAll("[\"{ }\\[\\]]",
                    ""), "оценка")) {
                builder.append(" получил(-а) ")
                        .append(s.replaceAll("[\"}\\[\\]]", "")
                                .split(":")[1]);

            }
            if (Objects.equals(s.split(":")[0].trim().replaceAll("[\"{ }\\[\\]]",
                    ""), "предмет")) {
                builder.append(" по предмету ")
                        .append(s.replaceAll("[\"}\\[\\]]", "")
                                .split(":")[1]).append("\n");

            }
            System.out.println(builder);
        }
    }
}
