package part3;

public class Task07 {

    public static void main(String[] args) {
        System.out.println(isKaprekar(3));
        System.out.println(isKaprekar(5));
        System.out.println(isKaprekar(297));
    }

    private static boolean isKaprekar(int n) {
        int left = 0;
        int right = 0;
        int squaredNumber = n * n;

        String str = Integer.toString(squaredNumber);

        for (int i = 0; i < str.length() / 2; i++) {
            left = left * 10 + Character.getNumericValue(str.charAt(i));
        }

        for (int i = str.length() / 2; i < str.length(); i++) {
            right = right * 10 + Character.getNumericValue(str.charAt(i));
        }

        return left + right == n;
    }
}
