package part5;

import java.util.Arrays;

public class Task01 {

    public static void main(String[] args) {
        int[] arr1 = new int[] {72, 33, -73, 84, -12, -3, 13, -13, -68};

        System.out.println(Arrays.toString(encrypt("Hello")));
        System.out.println(decrypt(arr1));
        System.out.println(Arrays.toString(encrypt("Sunshine")));
    }

    private static int[] encrypt(String str) {
        // Код предыдущего символа. Поскольку у первого символа нет предыдущего, то 0.
        int lastCharCode = 0;
        // Массив результата вычислений
        int[] arrEncrypt = new int[str.length()];

        for(int i = 0; i < str.length() ; i++) {
            // i-тый элемент массива равен вычитанию из текущего символа предыдущего
            arrEncrypt[i] = str.charAt(i) - lastCharCode;
            lastCharCode = str.charAt(i);
        }

        return arrEncrypt;
    }

    private static String decrypt(int[] arr) {
        // Строка результата
        StringBuilder str = new StringBuilder();
        // Код символа без разницы
        int charCode = 0;

        // В цикле прибавляем символ, код которого равен сложению разницы и предыдущего символа
        for (int i = 0; i < arr.length; i++) {
            str.append((char) (arr[i] + charCode));
            charCode = arr[i] + charCode;
        }

        return str.toString();
    }
}
