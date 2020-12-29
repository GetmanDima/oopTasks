package part3;

public class Task05 {

    public static void main(String[] args) {
        System.out.println(isValidHexCode("#CD5C5C"));
        System.out.println(isValidHexCode("#EAECEE"));
        System.out.println(isValidHexCode("#eaecee"));
        System.out.println(isValidHexCode("#CD5C58C"));
        System.out.println(isValidHexCode("#CD5C5Z"));
        System.out.println(isValidHexCode("#CD5C&C"));
        System.out.println(isValidHexCode("CD5C5C"));
    }

    private static boolean isValidHexCode(String code) {
        if (code.length() == 7) {
            if (code.charAt(0) == '#') {
                code = code.toLowerCase();

                for (int i = 1; i < code.length(); i++) {
                    if (!(code.charAt(i) >= 'a' && code.charAt(i) <= 'f') &&
                            !(code.charAt(i) >= '0' && code.charAt(i) <= '9')) {
                        return false;
                    }
                }

                return true;
            }

            return false;
        }

        return false;
    }
}
