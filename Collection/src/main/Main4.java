package main;

public class Main4 {
    public static void main(String[] args) {
        String sourceData = "Это Иван. Ему 34 года. Его рост 166.3 см. Должность \"Программист\"";
        String name = sourceData.substring(4,8);
        String ageString = sourceData.substring(14,16);
        int age = Integer.parseInt(ageString);
        String heightString = sourceData.substring(32,37);
        double height = Double.parseDouble(heightString);
        String position = sourceData.substring(53, 64);
        Man1 man = new Man1(name, position, age, height);
        System.out.println(man.getName() + " " + man.getPosition() + " " + man.getAge() + " года " + man.getHeight() + "см.");
    }
}
