package main;

public class Main2 {
    public static void main(String[] args) {
        MyArrayList1 employees = new MyArrayList1();
        employees.add("Никита");
        employees.add("Игорь");
        employees.add("Ваня");
        employees.add("Иван");
        employees.add("Максим");
        employees.add("Ирина");
        employees.add("Алексей");
        employees.remove("Ваня");
        employees.remove("Алексей");
        employees.remove("Роман");
        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }
    }
}
