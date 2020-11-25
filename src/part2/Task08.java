package part2;

public class Task08 {

    public static void main(String[] args) {
        System.out.println(isStrangePair("ratio", "orator"));
        System.out.println(isStrangePair("sparkling", "groups"));
        System.out.println(isStrangePair("bush", "hubris"));
        System.out.println(isStrangePair("", ""));
    }

    private static boolean isStrangePair(String str1, String str2) {

        if (str1.length() == 0 && str2.length() == 0) {
            return true;
        }

        return str1.length() > 0 &&
                str2.length() > 0 &&
                str1.charAt(0) == str2.charAt(str2.length() - 1) &&
                str1.charAt(str1.length() - 1) == str2.charAt(0);
    }
}
