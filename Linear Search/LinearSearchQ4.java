import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchQ4 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Enter your number to be searched: ");
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        System.out.println(Arrays.toString(searchIn2D(arr, target)));

    }

    static int[] searchIn2D(int[][] a, int target) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == target)
                    return new int[] { i, j };
            }
        }
        return new int[] { -1, -1 };
    }
}