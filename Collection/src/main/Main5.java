package main;

import java.util.ArrayList;

public class Main5 {
    public static void main(String[] args) {
        ArrayList<String> emploees = new ArrayList<>();
        for (String name : emploees) {
            System.out.println(name);
        }
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers.add(i);
        }
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println(sum);
    }
}
