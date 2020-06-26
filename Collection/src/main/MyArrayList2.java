package main;

import java.util.HashSet;

public class MyArrayList2 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Джон");
        names.add("Ольга");
        names.add("Женя");
        names.add("Максим");
        names.add("Ольга");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
