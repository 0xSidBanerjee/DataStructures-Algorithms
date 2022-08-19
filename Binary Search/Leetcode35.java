public class Leetcode35 {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 5, 9, 14, 16, 18 };
        System.out.println(search(nums, 1));
    }

    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        if (nums[start] > nums[end]) {
            int[] nums2 = new int[nums.length];
            int[] temp = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                nums2[i] = nums[nums.length - 1 - i];
            }
            temp = nums2;
            nums2 = nums;
            nums = temp;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // return nums[end]; //for floor
        return start; // for ceil

    }
}
