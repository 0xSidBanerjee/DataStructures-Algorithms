public class Leetcode1295 {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(check(nums));
    }

    static int check(int[] arr) {
        int flag = 0;
        for (int num : arr) {
            int counter = 0;
            int temp = num;
            while (temp != 0) {
                temp = temp / 10;
                counter++;
            }
            if (counter % 2 == 0) {
                flag++;
            }
        }
        return flag;
    }
}
