package part2;

public class Task07 {

    public static void main(String[] args) {
        System.out.println(isValid("59001"));
        System.out.println(isValid("853a7"));
        System.out.println(isValid("732 32"));
        System.out.println(isValid("393939"));
    }

    private static boolean isValid(String index) {

        if (index.length() != 5) {
            return false;
        }

        for (int i = 0; i < index.length(); i++) {
            if (!Character.isDigit(index.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
