import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        search(arr, 4);
    }

    static int search(int[] arr, int target) {
        int flag = 0;
        int middle = arr.length / 2;
        int[] arr2 = new int[arr.length];

        if (arr[arr.length - 1] < arr[0]) {
            int[] temp = new int[arr.length];
            flag = 1;
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[arr.length - 1 - i];
            }
            temp = arr;
            arr = arr2;
            arr2 = temp;
        }

        if (arr[middle] == target) {
            if (flag == 1) {
                return arr.length - 1 - middle;
            } else
                return middle;
        }

        else if (arr[middle] > target) {
            return search(Arrays.copyOfRange(arr, arr[0], arr[middle - 1]), target);
        }

        else if (arr[middle] < target) {
            return search(Arrays.copyOfRange(arr, arr[middle], arr[arr.length]), target);
        }
        return -1;
    }
}