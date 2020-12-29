package part3;

public class Task08 {

    public static void main(String[] args) {
        System.out.println(longestZero("01100001011000"));
        System.out.println(longestZero("100100100"));
        System.out.println(longestZero("11111"));
    }

    private static String longestZero(String str) {

        int maxZero = 0;

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == '0') {
                int j = i + 1;
                int k = 1;

                while (j < str.length() && str.charAt(j) == '0') {
                    k++;
                    j++;
                }

                i = j;

                if (k > maxZero) {
                    maxZero = k;
                }
            }
        }

        return "0".repeat(maxZero);
    }
}
