import java.util.Scanner;

public class LinearSearchQ2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number to be searched: ");
        int target = in.nextInt();
        System.out.println("Enter your lower bound: ");
        int lower = in.nextInt();
        System.out.println("Enter your upper bound: ");
        int upper = in.nextInt();
        if (search(arr, target, upper, lower) == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found");
        }
    }

    static int search(int[] arr, int target, int upper, int lower) {
        int flag = -1;
        for (int i = 0; i < arr.length; i++) {
            if (i >= lower && i <= upper) {
                if (arr[i] == target) {
                    flag = i;
                }
            }
        }
        return flag;
    }
}
