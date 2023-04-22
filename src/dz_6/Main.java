package dz_6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Laptop> set = new HashSet<>();
        set.add(new Laptop("HP","grey","Win","8 GB","500 GB",2013,"50 $"));
        set.add(new Laptop("DELL","black","Win","32 GB","4 TB",2022,"1000 $"));
        set.add(new Laptop("ASUS","blue","Linux","16 GB","1000 GB",2019,"500 $"));
        System.out.println(set);

        System.out.println(set.stream().map(Laptop::getModel));

        Map<String, Object> filters = new HashMap<>();
        filters.put("price", "1000 $");

        System.out.println("По вашему запросу:"+filters);

        Laptop.filterScore(set);
    }
}
