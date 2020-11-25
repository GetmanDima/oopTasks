package part2;

import java.util.Arrays;

public class Task02 {

    public static void main(String[] args) {
        int[] arr = {10, 4, 1, 4, -10, -50, 32, 21};
        System.out.println(differenceMaxMin(arr));

        int[] arr2 = {44, 32, 86, 19};
        System.out.println(differenceMaxMin(arr2));
    }

    private static int differenceMaxMin(int[] arr) {
        if (arr.length > 1) {
            int min = arr[0];
            int max = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            for (int i = 1; i< arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            return max - min;
        }

        return 0;
    }
}
