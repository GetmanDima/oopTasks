package part2;

public class Task04 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] sumArr = cumulativeSum(arr);

        for (int i = 0; i < sumArr.length; i++) {
            System.out.print(sumArr[i] + " ");
        }

        System.out.println("");


        int[] arr2 = {1, -2, 3};
        int[] sumArr2 = cumulativeSum(arr2);

        for (int i = 0; i < sumArr2.length; i++) {
            System.out.print(sumArr2[i] + " ");
        }

        System.out.println("");

        int[] arr3 = {3, 3, -2, 408, 3, 3};
        int[] sumArr3 = cumulativeSum(arr3);

        for (int i = 0; i < sumArr3.length; i++) {
            System.out.print(sumArr3[i] + " ");
        }

        System.out.println("");
    }

    private static int[] cumulativeSum(int[] arr) {

        if (arr.length > 1) {
            int[] sumArr = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                sumArr[i] = arr[i];

                for (int j = 0; j < i; j++) {
                    sumArr[i] += arr[j];
                }
            }

            return sumArr;
        }

        return arr;
    }
}
