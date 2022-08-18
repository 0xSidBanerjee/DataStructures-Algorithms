public class Test {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        System.out.println(search(arr, 1));
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] > arr[end]) {
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
        while (start <= end) {
            if (arr[mid] <= target) {
                if (arr[mid] == target) {
                    return arr[mid];
                } else
                    start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return -1; // The last elemet of the array was greater than the target :D
    }
}