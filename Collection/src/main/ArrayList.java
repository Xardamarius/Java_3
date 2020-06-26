package main;

import java.util.HashSet;
import java.util.TreeSet;

public class ArrayList {
    public static void main(String[] args) {
        TreeSet<Integer> names = new TreeSet<>();
        names.add(4);
        names.add(3);
        names.add(1);
        names.add(2);
        names.add(5);
        for (int name : names) {
            System.out.println(name);
        }
    }
}
