package part2;

public class Task01 {

    public static void main(String[] args) {
        System.out.println(repeat("mice", 5));
        System.out.println(repeat("hello", 3));
        System.out.println(repeat("stop", 1));
    }

    private static String repeat(String str, int n) {
        String repeatedStr = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < n; j++) {
                repeatedStr += str.charAt(i);
            }
        }

        return repeatedStr;
    }
}
