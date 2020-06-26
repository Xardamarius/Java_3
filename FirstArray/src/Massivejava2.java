public class Massivejava2 {
    public static void main(String[] args) {
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * 10;
        }
        for (int i : nums) {
            System.out.println(i);
        }
        char[] chars = new char[10];
        for (char ch : chars) {
            System.out.println(ch);
        }
        for (int i = 0, j = 1000; i < 1000; i++, j--) {

        }
    }
}