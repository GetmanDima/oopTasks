package part3;

public class Task04 {

    public static void main(String[] args) {
        System.out.println(flipEndChars("Cat, dog, and mouse."));
        System.out.println(flipEndChars("ada"));
        System.out.println(flipEndChars("Ada"));
        System.out.println(flipEndChars("z"));
    }

    private static String flipEndChars(String str) {
        if (str.length() < 2) {
            return "Incompatible.";
        }

        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return "Two's a pair";
        }

        String newStr = "";
        newStr += str.charAt(str.length() - 1);

        for (int i = 1; i < str.length() - 1; i++) {
            newStr += str.charAt(i);
        }

        newStr += str.charAt(0);

        return newStr;
    }
}
