package part3;

public class Task06 {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 4, 4};
        int[] arr2 = {2, 5, 7};
        System.out.println(same(arr1, arr2));

        int[] arr3 = {9, 8, 7, 6};
        int[] arr4 = {4, 4, 3, 1};

        System.out.println(same(arr3, arr4));

        int[] arr5 = {2};
        int[] arr6 = {3, 3, 3, 3, 3};

        System.out.println(same(arr5, arr6));
    }

    private static boolean same(int[] arr1, int[] arr2) {
        return countUniqueElements(arr1) == countUniqueElements(arr2);
    }

    private static int countUniqueElements(int[] arr) {
        int k = 0;
        int[] uniqueArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            boolean state = true;

            for (int j = 0; j < k; j++) {
                if (arr[i] == uniqueArr[j]) {
                    state = false;
                    break;
                }
            }

            if (state) {
                uniqueArr[k++] = arr[i];
            }
        }

        return k;
    }
}
