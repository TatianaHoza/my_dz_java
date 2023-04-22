package dz_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Laptop {
    public String model;
    public String color;
    public String os;
    public String ram;
    public String hdd;
    public int year;
    public String price;

    public Laptop(String model, String color, String os, String ram, String hdd, int year, String price) {
        this.model = model;
        this.color = color;
        this.os = os;
        this.ram = ram;
        this.hdd = hdd;
        this.year = year;
        this.price = price;
    }

    public boolean validateObject() {
        return true;
    }

    public static void filterScore(Set<Laptop> set) {
        List<String> list = new ArrayList<>();
        list.add("model");
        list.add("color");
        list.add("os");
        list.add("ram");
        list.add("hdd");
        list.add("year");
        list.add("price");



    }

        @Override
        public String toString() {
            return String.format("Laptop {model: %s, color: %s, os: %s, ram: %s, hdd: %s, year: %s, price: %s}", model, color, os, ram, hdd, year, price);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Laptop)
                return ((Laptop) obj).model.equals(this.model) &&
                        ((Laptop) obj).color.equals(this.color) &&
                        ((Laptop) obj).os.equals(this.os) &&
                        ((Laptop) obj).ram.equals(this.ram)&&
                        ((Laptop) obj).hdd.equals(this.hdd)&&
                        ((Laptop) obj).year == this.year&&
                        ((Laptop) obj).price.equals(this.price);
            else return false;
        }




    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOS(String os) {
        this.os = os;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public int getYear(int year) {
        return year;
    }

    public String getPrice() {
        return price;


    }

}
