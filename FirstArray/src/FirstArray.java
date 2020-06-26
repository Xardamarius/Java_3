public class FirstArray {
    public static void main(String[] args) {
        int[] daysInMonth = new int [13];
        daysInMonth[0] = 31;
        daysInMonth[1] = 28;
        daysInMonth[2] = 31;
        daysInMonth[3] = 30;
        daysInMonth[4] = 31;
        daysInMonth[5] = 30;
        daysInMonth[6] = 31;
        daysInMonth[7] = 30;
        daysInMonth[8] = 31;
        daysInMonth[9] = 30;
        daysInMonth[10] = 31;
        daysInMonth[11] = 30;
        daysInMonth[12] = 31;
        for (int i = 0; i < daysInMonth.length; i++) {
            System.out.println(daysInMonth[i]);
        }
    }
}
