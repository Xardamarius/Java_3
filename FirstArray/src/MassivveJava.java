public class MassivveJava {
    public static void main(String[] args) {
        int[] nums = new int[901];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 100;
        }
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
