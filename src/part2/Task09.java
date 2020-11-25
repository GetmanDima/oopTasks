package part2;

public class Task09 {

    public static void main(String[] args) {
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(isPrefix("retrospect", "sub-"));
        System.out.println(isSuffix("vocation", "-logy"));
    }

    private static boolean isPrefix(String str, String prefix) {
        for (int i = 0; i < prefix.length() - 1; i++) {
            if (prefix.charAt(i) != str.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isSuffix(String str, String suffix) {
        for (int i = 1; i < suffix.length(); i++) {
            if (suffix.charAt(suffix.length() - i) != str.charAt(str.length() - i)) {
                return false;
            }
        }

        return true;
    }
}
