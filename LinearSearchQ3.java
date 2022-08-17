public class LinearSearchQ3 {
    public static void main(String[] args) {
        int[] arr = { 25, 69, 73, 33, 22, 18 };
        System.out.println("The minimum number is " + min(arr));
    }

    static int min(int[] a) {
        int min = a[0];
        for (int num : a) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

}
