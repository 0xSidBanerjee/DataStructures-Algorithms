public class Test {
    public static void main(String[] args) {
        int[] arr = { 10, 9, 8, 7, 5, 4, 3, 2, 1, 0 };
        int target = 6;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int flag = 0;

        // For descending order
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

        int mid = start + (end - start) / 2;
        while (start <= end) { // Why <= is required and not just < ?
            mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                if (flag == 1) {
                    return arr.length - 1 - mid;
                }
                return mid;
            }
        }
        return -1;
    }
}