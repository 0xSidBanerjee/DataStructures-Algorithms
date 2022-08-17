import java.util.Scanner;

public class binarySalgo {
    public static void main(String[] args) {
        int[] arr = { 10, 9, 8, 7, 5, 4, 3, 2, 1, 0 };
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the target number");
        int target = in.nextInt();
        int result = search(arr, target);
        if (result == -1) {
            System.out.println("Number not found");
        } else {
            System.out.println("Number found at index " + result);
        }
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int flag = 0;
        if (arr[0] > arr[arr.length - 1]) {
            flag = 1;
            int[] arr2 = new int[arr.length];
            int[] temp = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[arr.length - 1 - i];
            }
            temp = arr2;
            arr2 = arr;
            arr = temp;

        }
        int mid = start + (end - start) / 2; // implement this after checking order agnostic binary search
        while (start <= end) {
            if (arr[mid] > target) {
                start = mid + 1;
            } else if (arr[mid] < target) {
                end = mid - 1;
            } else {
                if (flag == 1) {
                    return arr.length - mid - 1;
                }
                return mid;
            }
            mid = start + (end - start) / 2;
        }
        return -1;
    }
}
