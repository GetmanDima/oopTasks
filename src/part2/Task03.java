package part2;

import java.util.Arrays;

public class Task03 {

    public static void main(String[] args) {
        int[] arr = {1, 3};
        System.out.println(isAvgWhole(arr));

        int[] arr2 = {1, 2, 3, 4};
        System.out.println(isAvgWhole(arr2));

        int[] arr3 = {1, 5, 6};
        System.out.println(isAvgWhole(arr3));

        int[] arr4 = {1, 1, 1};
        System.out.println(isAvgWhole(arr4));

        int[] arr5 = {9, 2, 2, 5};
        System.out.println(isAvgWhole(arr5));
    }

    private static boolean isAvgWhole(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum % arr.length == 0;
    }
}
